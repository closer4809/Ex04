package com.javaex.ex04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //필드
    private EditText edtDisplay;
    private Button btnSet;
    private Button btnGet;

    private TextView txtTitle;
    private Button btnVisible;
    private Button btnInVisible;
    private Button btnGone;
    //생성자
    //gt
    //일반

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btnSet 버튼을 자바로 쓸수 있게 자바 객체로 만들어준다~
        btnSet = (Button)findViewById(R.id.btnSet);
        edtDisplay = (EditText) findViewById(R.id.edtDisplay);
        btnGet = (Button)findViewById(R.id.btnGet);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        btnVisible = (Button) findViewById(R.id.btnVisible);
        btnInVisible = (Button) findViewById(R.id.btnInVisible);
        btnGone = (Button) findViewById(R.id.btnGone);
        //btnset을 클릭했을때
        btnSet.setOnClickListener(new View.OnClickListener(){

            @Override
            public void  onClick(View view) {
                //클릭이벤트 체크
                Log.d("javaStudy", "버튼클릭");

                //to do
                //etDisplay에 777을 출력한다
                edtDisplay.setText("777");
            }

        });

        //btnGet을 클릭할때
        btnGet.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Log.d("javaStudy", "가져오기버튼 클릭");
                String result = edtDisplay.getText().toString();
                Log.d("javaStudy", result);

                Toast.makeText(getApplicationContext(), "안녕하세요", Toast.LENGTH_SHORT).show();

            }



        });

        txtTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("javaStudy", "텍스트타이틀 클릭");
            }
        });

        btnVisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("javaStudy", "비시벌버튼클릭");
                txtTitle.setVisibility(View.VISIBLE);

                String str = txtTitle.getText().toString();
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();

                btnSet.setText("바보");
            }
        });

        btnInVisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("javaStudy", "인비시벌버튼 클릭");
                txtTitle.setVisibility(View.INVISIBLE);
            }
        });

        btnGone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("javaStudy", "곤버튼 클릭");
                txtTitle.setVisibility(View.GONE);
            }
        });
    }

    //메소드1

    //메소드2
}