package www.mrchao.com.http;

import android.content.Context;

import www.mrchao.com.http.callback.ICallBack;

/**
 * Created by Linfc
 * on 2017/6/23.
 * 所有网络请求方法接口
 */

public interface IApi {

    void testApiMeth(Context context, String param1, String param2, ICallBack callBack);
}
