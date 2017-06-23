package www.mrchao.com.http.HttpApi;

import android.content.Context;

import org.json.JSONObject;

import java.io.File;
import java.util.List;

import www.mrchao.com.http.callback.ICallBack;

/**
 * Created by Linfc
 * on 2017/6/23.
 */

public class HttpHelper implements IHttpRequest {
    private static IHttpRequest mIHttpRequest;
    private static HttpHelper sInstance;

    private HttpHelper() {
    }

    public static HttpHelper getInstance() {
        if (sInstance == null) {
            synchronized (HttpHelper.class) {
                if (sInstance == null) {
                    sInstance = new HttpHelper();
                }
            }
        }
        return sInstance;
    }

    public static void initHttp(IHttpRequest httpRequest) {
        getInstance();
        mIHttpRequest = httpRequest;
    }

    @Override
    public void post(Context context, String url, JSONObject params, ICallBack callBack, Boolean isSafeDB) {
        mIHttpRequest.post(context, url, params, callBack, isSafeDB);
    }

    @Override
    public void postFile(Context context, String url, List<File> files, ICallBack callBack) {
        mIHttpRequest.postFile(context, url, files, callBack);
    }
}
