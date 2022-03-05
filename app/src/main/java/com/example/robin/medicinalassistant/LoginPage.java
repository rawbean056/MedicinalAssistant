package com.example.robin.medicinalassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPage extends AppCompatActivity {
private Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_page);
        button2 = (Button)findViewById(R.id.profile1);
        button = (Button)findViewById(R.id.create_new_profile_button);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSummary();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCreate();
            }
        });
    }
 public void gotoCreate(){
        Intent intent = new Intent(this,CreateNewProfile.class);
        startActivity(intent);
 }
    public void gotoSummary(){
        Intent intent = new Intent(this,summary.class);
        startActivity(intent);
    }
}
