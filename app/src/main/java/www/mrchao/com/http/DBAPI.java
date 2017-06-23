package www.mrchao.com.http;

import android.content.Context;

import www.mrchao.com.http.callback.ICallBack;

/**
 * Created by Linfc
 * on 2017/6/23.
 * 缓存数据请求api
 */

public class DBApi implements IApi {
    private static DBApi sInstance;

    private DBApi() {
    }

    public static DBApi getInstance() {
        if (sInstance == null) {
            synchronized (DBApi.class) {
                if (sInstance == null) {
                    sInstance = new DBApi();
                }
            }
        }
        return sInstance;
    }

    @Override
    public void testApiMeth(Context context, String param1, String param2, ICallBack callBack) {

    }
}
