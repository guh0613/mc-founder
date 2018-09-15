package com.genisys.mcfounder;

import com.pgyersdk.crash.PgyCrashManager;
import android.app.Application;
import com.pgyersdk.feedback.*;

public class MCApplication extends Application {

    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();

        PgyCrashManager.register(this);
		new PgyerFeedbackManager.PgyerFeedbackBuilder()
			.setShakeInvoke(true)  //设置是否摇一摇的方式激活反馈，默认为 true
			// fasle 则不触发摇一摇，最后需要调用 invoke 方法
			.setColorDialogTitle("#ffffff")    //设置Dialog 标题的字体颜色，默认为颜色为#ffffff
			.setColorTitleBg("#2E2D2D")        //设置Dialog 标题栏的背景色，默认为颜色为#2E2D2D
			// 默认参数为PgyerFeedbackManager.TYPE.DIALOG_TYPE, Dialog UI 显示
			// 可选参数PgyerFeedbackManager.TYPE.ACTIVITY_TYPE  Activity UI 显示
			.setDisplayType(PgyerFeedbackManager.TYPE.DIALOG_TYPE)  
			.setMoreParam("KEY1","VALUE1") //自定义的反馈数据
			.setMoreParam("KEY2","VALUE2") //自定义的反馈数据
			.builder()
			.register();
    }
}
