package cn.lry.floatwidget;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by liruiyuan on 2016/1/19.
 */
public class MainActivity extends Activity {
    private FloatingManager floatingManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatingManager = new FloatingManager(this);
    }

    public void buttonListener(View v) {
        switch (v.getId()) {
            case R.id.open_button:
                floatingManager.open();
                break;
            case R.id.close_button:
                floatingManager.close();
                break;
            default:
                break;
        }
    }

}
