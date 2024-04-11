package com.siam.alarmmanegerrrrrrrrrr;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.set_Alarm).setOnClickListener(v -> {
            AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
            Intent i = new Intent(this, Broadcast_Rc.class);
            PendingIntent PI = PendingIntent.getBroadcast(MainActivity.this, 234, i, PendingIntent.FLAG_IMMUTABLE);

            alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+ 5 * 1000, PI);

            Toast.makeText(this, "Alarm Set..", Toast.LENGTH_SHORT).show();
        });
    }
}