package com.hotzhi.testweather.util;

/**
 * Created by Administrator on 2016-04-10.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);

}
