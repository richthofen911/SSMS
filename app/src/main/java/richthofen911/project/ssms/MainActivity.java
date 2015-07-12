package richthofen911.project.ssms;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_fire).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "ni mei de";
                SmsManager.getDefault().sendTextMessage("16472991076", null, msg, null, null);
            }
        });
    }

}
