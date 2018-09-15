package com.genisys.mcfounder;

import android.app.*;
import android.os.*;
import com.pgyersdk.update.PgyUpdateManager;
public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		

		new PgyUpdateManager.Builder()
			.register();

		/** 可选配置集成方式 **/
		new PgyUpdateManager.Builder()
			.setForced(false)                //设置是否强制更新
			.setUserCanRetry(true)         //失败后是否提示重新下载
			.setDeleteHistroyApk(false)     // 检查更新前是否删除本地历史 Apk， 默认为true
			.register();
    }
}
