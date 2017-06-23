package www.mrchao.com.http;

import android.content.Context;

import www.mrchao.com.utils.NetworkUtils;

/**
 * Created by Linfc
 * on 2017/6/23.
 * 数据调度类
 */

public class ApiFactory {
    public static IApi sIApi;

    private static IApi getIApi(boolean hasNetwork) {

        if (hasNetwork) {
            sIApi = NetApi.getInstance();
        } else {
            sIApi = DBApi.getInstance();
        }
        return sIApi;
    }

    public static IApi getIApi(Context context) {
        boolean hasNetwork = NetworkUtils.isNetworkAvailable(context);
        return getIApi(hasNetwork);
    }
}
