package www.mrchao.com;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import www.mrchao.com.Base.BaseActivity;
import www.mrchao.com.bean.Mode;
import www.mrchao.com.http.ApiFactory;
import www.mrchao.com.http.callback.HttpCallBack;
import www.mrchao.com.utils.Loger;

public class MainActivity extends BaseActivity {
    @BindView(R.id.tv_Des)
    TextView mTvDes;
    @BindView(R.id.bt_click)
    Button mBtClick;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setBackgroundDrawable(null);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mContext = this;
    }

    @OnClick(R.id.bt_click)
    public void onViewClicked() {
        ApiFactory.getIApi(mContext).testApiMeth(mContext, "", "", new HttpCallBack<Mode>() {
            @Override
            public void onStart(String start) {
                Loger.e("requstUrl====>", start);
            }

            @Override
            public void onError(Exception e, String msg) {

            }

            @Override
            public void onSuccess(Mode mode) {
                mTvDes.setText(mode.toString());
            }
        });

    }
}
