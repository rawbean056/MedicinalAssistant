package com.example.robin.medicinalassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class summary extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary);

        button = (Button)findViewById(R.id.reminder);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoreminder();
            }
        });
    }
    public void gotoreminder(){
        Intent intent = new Intent(this,reminder.class);
        startActivity(intent);
    }
}
