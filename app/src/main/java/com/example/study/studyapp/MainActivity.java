package com.example.study.studyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


//        Button btn = (Button)findViewById(R.id.btnCurrent);
//        btn.setOnClickListener(
//            new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    TextView txt = (TextView) findViewById(R.id.txtResult);
//                    txt.setText(new Date().toString());
//                    Log.d("CurrentTime", new Date().toString());
//                    showToast();
//                }
//            }
//        );
    }

//    private void showToast(){
//        Toast toast = Toast.makeText(
//        this, "aho", Toast.LENGTH_LONG);
//        toast.show();
//    }
}
