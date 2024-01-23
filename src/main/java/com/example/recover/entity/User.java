package com.example.recover.entity;
import lombok.*;
@Getter //Get方法
@Setter //Set方法
@ToString //ToString方法
@AllArgsConstructor //有产
@NoArgsConstructor //无产
public class User {
    private String UserEamil;
    private String UserName;
    private String UserPwd;
}
