package com.example.jud.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jud.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ecouteMenu((Button)findViewById(R.id.button_coup), coupeActivity.class);
        ecouteMenu((Button)findViewById(R.id.button_coif), coifActivity.class);

    }
    private void ecouteMenu(Button btn,final Class classe){
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,classe);
                startActivity(intent);
            }
        });
    }
}