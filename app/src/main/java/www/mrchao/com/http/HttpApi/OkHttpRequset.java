package www.mrchao.com.http.HttpApi;

import android.content.Context;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.builder.PostFormBuilder;
import com.zhy.http.okhttp.builder.PostStringBuilder;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.RequestCall;

import org.json.JSONObject;

import java.io.File;
import java.util.List;

import okhttp3.Call;
import okhttp3.MediaType;
import www.mrchao.com.config.Constant;
import www.mrchao.com.http.callback.ICallBack;

/**
 * Created by Linfc
 * on 2017/6/23.
 * 真正的网络请求类
 */

public class OkHttpRequset implements IHttpRequest {


    public OkHttpRequset() {

    }

    @Override
    public void post(Context context, String url, JSONObject params, final ICallBack callBack, Boolean isSafeDB) {
        PostStringBuilder postString = OkHttpUtils.postString();
        //添加请求标志
        postString.tag(context);
        //配置请求参数
        postString.mediaType(MediaType.parse("application/json; charset=utf-8"));
        postString.url(Constant.HOST + url);
        postString.content(params.toString());
        //打印参数
        String requestUrl = Constant.HOST + url + params.toString();
        //发起请求
        callBack.onStart(requestUrl);
        RequestCall requestCall = postString.build();
        requestCall.execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int i) {
                callBack.onError(e, "网络请求失败");
            }

            @Override
            public void onResponse(String s, int i) {
                callBack.onSuccess(s);
            }
        });

    }


    @Override
    public void postFile(Context context, String url, List<File> files, final ICallBack callBack) {
        PostFormBuilder post = OkHttpUtils.post();
        //添加请求标志
        post.tag(context);
        //配置请求参数
        String requestUrl = Constant.HOST + url;
        callBack.onStart(requestUrl);
        post.url(requestUrl);
        if (files != null) {
            for (int i = 0; i < files.size(); i++) {
                File file = files.get(i);
                post.addFile("myFiles", file.getName(), file);
            }
        }
        //打印请求地址
        callBack.onStart(requestUrl);
        post.build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int i) {
                callBack.onError(e, "上传失败");
            }

            @Override
            public void onResponse(String s, int i) {
                callBack.onSuccess(s);
            }
        });
    }
}
