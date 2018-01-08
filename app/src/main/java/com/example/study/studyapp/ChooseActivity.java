package com.example.study.studyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.Random;

/**
 * Created by Hiroki on 2018/01/07.
 */

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

//        Log.v("テスト", "1");

        Intent intent = this.getIntent();

//        Log.v("テスト", "2");

        findViewById(R.id.janken_gur).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//            hogeClickEvent(v);
                Log.d("おれは", "グー");
                janken(10);
            }
        });

        findViewById(R.id.janken_choki).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//            hogeClickEvent(v);
                Log.d("わたしは", "チョキ");
                janken(20);
            }
        });

        findViewById(R.id.janken_par).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//            fugaClickEvent(v);
                Log.d("どうしても", "パー");
                janken(30);
            }
        });

    }

    private void janken(int choise) {
        choise = choise + new Random().nextInt(3) + 1;
        Log.d("結果", String.valueOf(choise));

        switch (choise) {
            case 12:
            case 23:
            case 31:
                Log.d("勝ち", "勝利です。");
                break;

            case 11:
            case 22:
            case 33:
                Log.d("引き分け", "あいこです。");
                break;

            case 13:
            case 21:
            case 32:
                Log.d("負け", "敗北です。");
                break;

        }
    }
}
