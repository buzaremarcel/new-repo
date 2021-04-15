package com.example.jud.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.jud.R;

public class coupeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rdv);
        ecouteMenu((ImageButton)findViewById(R.id.imageButton7), MainActivity2.class);
        ecouteMenu((ImageButton)findViewById(R.id.imageButton8), MainActivity2.class);
        ecouteMenu((ImageButton)findViewById(R.id.imageButton9), MainActivity2.class);
        ecouteMenu((ImageButton)findViewById(R.id.imageButton10), MainActivity2.class);

    }
    private void ecouteMenu(ImageButton btn, final Class classe){
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(coupeActivity.this,classe);
                startActivity(intent);
            }
        });
    }
}