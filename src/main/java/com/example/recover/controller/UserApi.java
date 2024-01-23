package com.example.recover.controller;
import com.example.recover.entity.User;
import com.example.recover.util.APIResultUtil;
import com.example.recover.util.MybatisUtil;
import com.example.recover.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class UserApi {
    @RequestMapping("/GetUserList")
    public Object GetUserList() {
        try {
            SqlSession sqlSession = MybatisUtil.sqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//            List<User> users = mapper.GetUserList();
            List<User> users = mapper.seleteUserList();
            sqlSession.close();
            if (users != null) {
                return APIResultUtil.apiResult(true, "获取成功", users);
            } else {
                return APIResultUtil.apiResult(true, "无任何用户数据", null);
            }
        } catch (Exception e) {
            System.out.println("程序错误" + e);
            return APIResultUtil.apiResult(false, "程序错误", null);
        }
    }
}