package com.example.recover.entity;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class APIResult {
    private Boolean success;
    private Object data;
    private String message;
}