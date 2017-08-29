package com.example.bakibillah.daynightswitchusing;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import com.mahfa.dnswitch.DayNightSwitch;
import com.mahfa.dnswitch.DayNightSwitchListener;

public class MainActivity extends AppCompatActivity {

    DayNightSwitch dayNightSwitch;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dayNightSwitch = (DayNightSwitch)findViewById(R.id.day_night_switch);
        layout = (ConstraintLayout)findViewById(R.id.my_layout);

        dayNightSwitch.setListener(new DayNightSwitchListener() {
            @Override
            public void onSwitch(boolean isNight) {
                if(isNight){
                    Toast.makeText(MainActivity.this, "This is Night",Toast.LENGTH_LONG).show();
                    layout.setBackgroundColor(Color.parseColor("#34495e"));
                    
//                    getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                }
                else {
                    Toast.makeText(MainActivity.this, "This is Day",Toast.LENGTH_LONG).show();
                    layout.setBackgroundColor(Color.parseColor("#3498db"));
//                    getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                }

            }
        });
    }
}
