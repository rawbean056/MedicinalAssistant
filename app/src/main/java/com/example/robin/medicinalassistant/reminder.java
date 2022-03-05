package com.example.robin.medicinalassistant;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import static com.example.robin.medicinalassistant.R.id.morning_alarm_text;

public class reminder extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        Button button2 = (Button)findViewById(R.id.noon);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotonoon();
            }
        });

        Button button3 = (Button)findViewById(R.id.night);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotonight();
            }
        });

        Button button1 = (Button) findViewById(R.id.morning_alarm_button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                DialogFragment timePicker1 = new TimePickerFragment();
                timePicker1.show(getSupportFragmentManager(),"time picker");

            }
        });

    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

        TextView textview1 = (TextView) findViewById(R.id.morning_alarm_text);
        textview1.setText("Hour: "+hourOfDay + " Minute: "+minute);
    }
    public void gotonoon(){
        Intent intent = new Intent(this,reminder_noon.class);
        startActivity(intent);
    }
    public void gotonight(){
        Intent intent = new Intent(this,reminder_night.class);
        startActivity(intent);
    }


}
