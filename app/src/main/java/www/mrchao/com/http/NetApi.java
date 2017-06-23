package www.mrchao.com.http;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

import www.mrchao.com.http.HttpApi.HttpHelper;
import www.mrchao.com.http.HttpApi.OkHttpRequset;
import www.mrchao.com.http.callback.ICallBack;

/**
 * Created by Linfc
 * on 2017/6/23.
 * 网络数据请求api
 */

public class NetApi implements IApi {
    private static NetApi sInstance;
    private static boolean isSaveDb = false;

    private NetApi() {
        HttpHelper.initHttp(new OkHttpRequset());
    }

    public static NetApi getInstance() {
        if (sInstance == null) {
            synchronized (NetApi.class) {
                if (sInstance == null) {
                    sInstance = new NetApi();
                }
            }
        }
        return sInstance;
    }

    @Override
    public void testApiMeth(Context context, String param1, String param2, ICallBack callBack) {
        JSONObject obj = new JSONObject();
        try {
            obj.put("param1", param1);
            obj.put("param2", param2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        HttpHelper.getInstance().post(context, "course/search", obj, callBack, isSaveDb);
    }
}
