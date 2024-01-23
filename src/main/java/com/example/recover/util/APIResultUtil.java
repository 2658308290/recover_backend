package com.example.recover.util;

import com.example.recover.entity.APIResult;

public class APIResultUtil {
    public static APIResult apiResult(Boolean success, String message, Object data) {
        APIResult apiResult = new APIResult();
        apiResult.setSuccess(success);
        apiResult.setMessage(message);
        apiResult.setData(data);
        return apiResult;
    }
}
