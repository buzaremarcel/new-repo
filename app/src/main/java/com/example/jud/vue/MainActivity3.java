package com.example.jud.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jud.R;
import com.example.jud.model.Profil;
import com.example.jud.controler.controle;

import static com.example.jud.controler.controle.creerProfil;
import static com.example.jud.controler.controle.getInstance;

public class MainActivity3<txtnom> extends AppCompatActivity {
    private TextView textView6;
    private Context context;
    private com.example.jud.controler.controle controle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        controle controle;

        this.textView6=(TextView)findViewById(R.id.textView6);
        ecouteMenu((Button)findViewById(R.id.button2));








        }





    private void ecouteMenu(Button btn){
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=getIntent();
                String strnom=" ";
                strnom=intent.getStringExtra("edittext");
                String strprenom="";
                strprenom=intent.getStringExtra("edittext2");
                String strmail="";
                strmail=intent.getStringExtra("edittext3");
                String strnumero="";
                strnumero=intent.getStringExtra("edittext4");


                EditText time =(EditText)findViewById(R.id.editTextDate);
                String tonText=time.getText().toString();
                EditText heure =(EditText)findViewById(R.id.editTextTime);
                String tonText2=heure.getText().toString();


                    textView6.setText(strnom+" "+ strprenom+" Votre rendez vous a bien été pris le "+tonText + " a " + tonText2);


            }
        });


    }
    //controle.creerProfil(strnom,strprenom,strmail,strnumero);

    public void recupProfil(String strnom, String strprenom, String strmail, String strnumero){
        this.controle.creerProfil(strnom,strprenom,strmail,strnumero);



    }


}