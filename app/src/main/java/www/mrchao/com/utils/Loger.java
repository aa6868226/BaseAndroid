package www.mrchao.com.utils;


import android.text.TextUtils;
import android.util.Log;

import www.mrchao.com.config.Constant;


/**
 * Log日志统一管理类
 *
 * @author ocean
 * @date 2016-4-27
 */
public class Loger {

    private static boolean LOG_DEBUG = Constant.IS_OPEN_LOG;

    public static int v(String tag, String msg) {
        if (LOG_DEBUG) {
            if (!TextUtils.isEmpty(msg)) {
                return Log.v(tag, msg);
            }
        }
        return 0;
    }

    public static int d(String tag, String msg) {
        if (LOG_DEBUG) {
            if (!TextUtils.isEmpty(msg)) {
                return Log.d(tag, msg);
            }
        }
        return 0;
    }

    public static int i(String tag, String msg) {
        if (LOG_DEBUG) {
            if (!TextUtils.isEmpty(msg)) {
                return Log.i(tag, msg);
            }
        }
        return 0;
    }

    public static int w(String tag, String msg) {
        if (LOG_DEBUG) {
            if (!TextUtils.isEmpty(msg)) {
                return Log.w(tag, msg);
            }
        }
        return 0;
    }

    public static int e(String tag, String msg) {
        if (LOG_DEBUG) {
            if (!TextUtils.isEmpty(msg)) {
                return Log.e(tag, msg);
            }
        }
        return 0;
    }

    public static int e(String tag, String msg, Throwable tr) {
        if (LOG_DEBUG) {
            if (!TextUtils.isEmpty(msg)) {
                return Log.e(tag, msg, tr);
            }
        }
        return 0;
    }
}
