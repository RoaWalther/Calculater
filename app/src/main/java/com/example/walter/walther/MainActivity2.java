package com.example.walter.walther;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    private EditText et1,et2,et3;
    private TextView vt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);

        et1 = (EditText)findViewById(R.id.txt_nun1);
        et2 = (EditText)findViewById(R.id.txt_nun2);
        et3 = (EditText)findViewById(R.id.txt_nun3);
        vt = (TextView)findViewById(R.id.tvResult);

        }

        public void estatus (View view){
            try {
                String mate = et1.getText().toString();
                String quimi = et2.getText().toString();
                String fisi = et3.getText().toString();

                int ma = Integer.parseInt(mate);
                int qui = Integer.parseInt(quimi);
                int fi = Integer.parseInt(fisi);
                int promedio = (ma + qui + fi)/ 3;

                if (promedio >= 6) {
                    vt.setText("estatus aprobado con " + promedio);
                }else if (promedio <= 5){
                    vt.setText("estatus reprobado con " + promedio);
                }
            }catch (Exception e){
                e.getMessage();
            }
        }
}
