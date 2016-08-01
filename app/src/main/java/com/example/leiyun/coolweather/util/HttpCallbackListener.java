package com.example.leiyun.coolweather.util;

/**
 * Created by LeiYun on 2016/8/1 0001.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
