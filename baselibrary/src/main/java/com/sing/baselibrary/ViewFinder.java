package com.sing.baselibrary;

import android.app.Activity;
import android.view.View;

/**
 * Created by yy on 2019/9/10.
 * function:
 */
public class ViewFinder {

    private View mView;
    private Activity mActivity;

    public ViewFinder(View view) {
        mView = view;
    }

    public ViewFinder(Activity activity) {
        mActivity = activity;
    }

    public View findViewById(int viewId) {

        return mActivity != null ? mActivity.findViewById(viewId) : mView.findViewById(viewId);
    }
}
