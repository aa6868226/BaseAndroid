package www.mrchao.com.http.HttpApi;

import android.content.Context;

import org.json.JSONObject;

import java.io.File;
import java.util.List;

import www.mrchao.com.http.callback.ICallBack;

/**
 * Created by Linfc
 * on 2017/6/23.
 * 网络数据请求接口类
 */

public interface IHttpRequest {
    void post(Context context, String url, JSONObject params, ICallBack callBack, Boolean isSafeDB);


    void postFile(Context context, String url, List<File> files, ICallBack callBack);
}
