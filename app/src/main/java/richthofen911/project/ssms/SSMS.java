package richthofen911.project.ssms;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.telephony.SmsManager;

public class SSMS extends Service {
    public SSMS() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        String addr_dest = intent.getStringExtra("addr_dest");
        String sms_body = intent.getStringExtra("sms_body");
        SmsManager.getDefault().sendTextMessage(addr_dest, null, sms_body, null, null);

        return START_STICKY;
    }
}
