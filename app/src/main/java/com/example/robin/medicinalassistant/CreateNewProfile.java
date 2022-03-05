package com.example.robin.medicinalassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateNewProfile extends AppCompatActivity {
private Button backlogin;
private Button submit;
DatabaseHelper myDb;
Profile p1;
EditText editname, editdoctor, edithospital, editmedicine,editforbidden;
String name,doctor,hospital,medicine,forbidden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_create_new_profile);

        myDb = new DatabaseHelper(this);
        backlogin= (Button)findViewById(R.id.back_to_login);
        submit = (Button)findViewById(R.id.submit_button);
        editname = (EditText)findViewById(R.id.name_text);
        editdoctor = (EditText) findViewById(R.id.doctor_text);
        edithospital = (EditText) findViewById(R.id.hospital_text);
        editmedicine = (EditText) findViewById(R.id.medicine_text);
        editforbidden = (EditText) findViewById(R.id.forbidden_text);
        name = editname.getText().toString();
        doctor = editdoctor.getText().toString();
        hospital = edithospital.getText().toString();
        medicine = editmedicine.getText().toString();
        forbidden = editforbidden.getText().toString();
        p1 = new Profile(1,name,doctor,hospital,medicine,null,forbidden);





        backlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goback();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDb.addprofile(p1);
                
            }
        });

    }
    public void goback(){
        Intent intent = new Intent(this,LoginPage.class);
        startActivity(intent);
    }
    public void gotoSummary(){
        Intent intent = new Intent(this,summary.class);
    }
}
