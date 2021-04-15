package com.example.jud.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.jud.R;

public class coifActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coif_activity);
        ecouteMenu((ImageButton)findViewById(R.id.imageButton), MainActivity2.class);
        ecouteMenu((ImageButton)findViewById(R.id.imageButton2), MainActivity2.class);
        ecouteMenu((ImageButton)findViewById(R.id.imageButton33), MainActivity2.class);
        ecouteMenu((ImageButton)findViewById(R.id.imageButton44), MainActivity2.class);


    }
    private void ecouteMenu(ImageButton btn, final Class classe){
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(coifActivity.this,classe);
                startActivity(intent);
            }
        });
    }
}