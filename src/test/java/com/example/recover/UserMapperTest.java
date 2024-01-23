package com.example.recover;
import com.example.recover.entity.User;
import com.example.recover.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
public class UserMapperTest {
    @Test
    public void TestDemo01() throws IOException {
        //获取Mybatis配置文件
        String resource = "Mybatis-config.xml";
//      构建SqlSessionFactory
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
//        调用映射器接口
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        遍历数据，并打印
        for (User user : mapper.seleteUserList()) {
            System.out.println(user);
        }
//        记得一点要关闭SqlSession，否者会导致Mysql连接数过高，无法访问
        sqlSession.close();
    }
}
