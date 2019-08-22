package com.novaindripuspita.islamiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnsholat, btnhalal, btndoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsholat = (Button)findViewById(R.id.btnsholat);
        btnhalal = (Button)findViewById(R.id.btnhalal);
        btndoa = (Button)findViewById(R.id.btndoa);

        btnsholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SholatActivity.class);
                startActivity(intent);
            }
        });

        btnhalal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HalalActivity.class);
                startActivity(intent);
            }
        });

        btndoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DoaActivity.class);
                startActivity(intent);
            }
        });
    }
}
