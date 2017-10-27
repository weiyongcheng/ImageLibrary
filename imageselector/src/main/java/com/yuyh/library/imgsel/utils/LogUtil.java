package com.yuyh.library.imgsel.utils;

/**
 * Created by yuanyuan on 17-10-27.
 */

public class LogUtil {

    private static String TAG = "ChengYing　";

    public static void writeLog(String msg) {
        writeLog("", msg);
    }

    public static void writeLog(int code, String msg) {
        writeLog(String.valueOf(code), msg);
    }

    public static void writeLog(long code, String msg) {
        writeLog(String.valueOf(code), msg);
    }

    @SuppressWarnings("WeakerAccess")
    public static void writeLog(String code, String msg) {
        if (StringEmptyUtil.isNotEmpty(code) && StringEmptyUtil.isNotEmpty(msg)) {
            System.out.println(TAG + "code: " + code + ", msg: " + msg);
        } else if (StringEmptyUtil.isNotEmpty(code)) {
            System.out.println(TAG + "code: " + code);
        } else {
            System.out.println(TAG + msg);
        }
    }
}
