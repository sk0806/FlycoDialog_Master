package com.flyco.dialogsamples.extra;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.flyco.animation.FlipEnter.FlipVerticalSwingEnter;
import com.flyco.dialog.widget.base.TopBaseDialog;
import com.flyco.dialogsamples.R;
import com.flyco.dialogsamples.utils.T;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ShareTopDialog extends TopBaseDialog<ShareTopDialog> {
    @Bind(R.id.ll_wechat_friend_circle) LinearLayout mLlWechatFriendCircle;
    @Bind(R.id.ll_wechat_friend) LinearLayout mLlWechatFriend;
    @Bind(R.id.ll_qq) LinearLayout mLlQq;
    @Bind(R.id.ll_sms) LinearLayout mLlSms;

    public ShareTopDialog(Context context, View animateView) {
        super(context, animateView);
    }

    public ShareTopDialog(Context context) {
        super(context);
    }

    @Override
    public View onCreateView() {
        showAnim(new FlipVerticalSwingEnter());
        dismissAnim(null);
        View inflate = View.inflate(mContext, R.layout.dialog_share, null);
        ButterKnife.bind(this, inflate);

        return inflate;
    }

    @Override
    public void setUiBeforShow() {
        mLlWechatFriendCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T.showShort(mContext, "朋友圈");
                dismiss();
            }
        });
        mLlWechatFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T.showShort(mContext, "微信");
                dismiss();
            }
        });
        mLlQq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T.showShort(mContext, "QQ");
                dismiss();
            }
        });
        mLlSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T.showShort(mContext, "短信");
                dismiss();
            }
        });
    }
}
