package com.example.yuanyuan.imagelibray;

/**
 * Created by yuanyuan on 17-10-16.
 */

public class StringEmptyUtil {

    @SuppressWarnings("WeakerAccess")
    public static boolean isEmpty(final Object obj) {
        return obj == null || obj instanceof String && obj.toString().length() == 0;
    }

    public static boolean isNotEmpty(final Object obj) {
        return !isEmpty(obj);
    }
}
