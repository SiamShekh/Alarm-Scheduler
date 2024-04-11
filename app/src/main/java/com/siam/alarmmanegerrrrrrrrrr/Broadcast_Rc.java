package com.siam.alarmmanegerrrrrrrrrr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;

public class Broadcast_Rc extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        MediaPlayer mp = MediaPlayer.create(context, R.raw.alarm);
        mp.start();
        mp.setLooping(true);

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
               mp.stop();
            }
        }.start();

    }
}
