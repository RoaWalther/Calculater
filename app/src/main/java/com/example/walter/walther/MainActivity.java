package com.example.walter.walther;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView vt;
    private RadioButton rb1,rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_nun1);
        et2 = (EditText)findViewById(R.id.txt_nun2);
        vt = (TextView)findViewById(R.id.tv_resultado);
        rb1 = (RadioButton)findViewById(R.id.rb_sumar);
        rb2 = (RadioButton)findViewById(R.id.rb_restar);

    }
    public void resul (View view){

        try{
            String val1 = et1.getText().toString();
            String val2 = et2.getText().toString();
            int va1 = Integer.parseInt(val1);
            int va2 = Integer.parseInt(val2);

            if (rb1.isChecked() ==true){
                int suma = va1 + va2;
                String resultado = suma +"";
                vt.setText(resultado);
            }else if (rb2.isChecked() == true){
                int resta = va1 - va2;
                String resultado = String.valueOf(resta);
                vt.setText(resultado);
            }
        }catch (Exception e){
            e.getMessage();
        }

    }

    public void enviar(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}
