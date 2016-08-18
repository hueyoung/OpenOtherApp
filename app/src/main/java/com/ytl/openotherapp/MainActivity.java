package com.ytl.openotherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ytl.openotherapp.util.ActivirtManageUtil;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOpen(View v)
    {
      /*  Intent intent = new Intent(Intent.ACTION_VIEW);

        String packageName = "com.boc.quote";
        String className = "com.boc.quote.ui.activity.login.LoginGestureActivity";
        intent.setClassName(packageName, className);

        //second method
        //        intent.setComponent(new ComponentName(
        //                "com.lazytech.projecta",
        //                "com.lazytech.projecta.MainActivity"
        //        ));
        Bundle bundle = new Bundle();
        bundle.putString("msg", "this message is from project B ");
        intent.putExtras(bundle);

        intent.putExtra("pid", android.os.Process.myPid());

        startActivityForResult(intent, 1);*/
//        ActivirtManageUtil.doStartApplicationWithPackageName(this, "com.boc.quote.ui.view.SettingNinePointLineView");
          ActivirtManageUtil.doOpenOtherApp(this,"com.boc.quote", "com.boc.quote.ui.activity.main.SplashActivity");
//        Toast.makeText(MainActivity.this,"好神奇啊！", Toast.LENGTH_SHORT).show();
//        ActivirtManageUtil.doOpenOtherApp(this,"com.ytl.diyfont", "com.ytl.diyfont.MainActivity");
    }
}
