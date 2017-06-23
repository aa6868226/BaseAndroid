package www.mrchao.com.http.callback;

/**
 * Created by Linfc
 * on 2017/6/23.
 */

public interface ICallBack {
    void onStart(String start);

    void onSuccess(String result);

    void onError(Exception e, String msg);

}
