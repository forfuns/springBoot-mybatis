package com.example.demo.action;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseCtrl {

    private Map<String,Object> resultWrapper(boolean isSuccess,String message,Object data){
        Map<String,Object> result = new HashMap<>();
        // 业务成功与失败标记
        result.put("success",isSuccess);

        // 反馈消息
        result.put("message",message);

        // 附带的数据
        result.put("data",data);

        // 服务器响应的时间戳
        result.put("timestamp",new Date());
        return result;
    }

    public Map<String,Object> success(String message,Object data){
        return resultWrapper(true,message,data);
    }

    public Map<String,Object> success(String message){
        return success(message,null);
    }

    public Map<String,Object> error(String message,Object data){
        return resultWrapper(false,message,data);
    }

    public Map<String,Object> error(String message){
        return error(message,null);
    }

}
