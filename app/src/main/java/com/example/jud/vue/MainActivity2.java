package com.example.jud.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.jud.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ecouteMenu((Button)findViewById(R.id.valide_button2), MainActivity3.class);
        init();


    }
    private void ecouteMenu(Button btn, final Class classe){
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity2.this,classe);
                nom = (EditText)findViewById(R.id.txtnom);
                strnom=nom.getText().toString();
                txtprenom = (EditText)findViewById(R.id.txtprenom);
                String strprenom=txtprenom.getText().toString();
                String strmail=txtemail.getText().toString();
                String strnumero=txttel.getText().toString();
                intent.putExtra("edittext",strnom);
                intent.putExtra("edittext2",strprenom);
                intent.putExtra("edittext3",strmail);
                intent.putExtra("edittext4",strnumero);

                startActivity(intent);
            }
        });
    }

          public String strnom;
          private EditText nom;
          private EditText txtprenom;
          private EditText txtemail;
          private EditText txttel;

          public  void init(){
              this.nom = (EditText)findViewById(R.id.txtnom);
              this.strnom=nom.getText().toString();
              this.txtprenom = (EditText)findViewById(R.id.txtprenom);
              this.txtemail = (EditText)findViewById(R.id.txtemail);
              this.txttel = (EditText)findViewById(R.id.txttel);




          }


}