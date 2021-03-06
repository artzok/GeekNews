package com.codeest.geeknews.presenter.contract;

import com.codeest.geeknews.base.BasePresenter;
import com.codeest.geeknews.base.BaseView;
import com.codeest.geeknews.model.bean.VersionBean;

/**
 * Created by codeest on 16/8/9.
 */

public interface MainContract {

    interface View extends BaseView{

        void showUpdateDialog(VersionBean bean);

    }

    interface  Presenter extends BasePresenter<View> {

        void checkVersion(String currentVersion);

    }
}
