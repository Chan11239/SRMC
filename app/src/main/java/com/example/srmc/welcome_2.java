package com.example.srmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome2);

        Button button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), LoginPage.class);
                startActivity(intent);
            }
        });
    }

    public void OpenThirdActivity(View view)
    {
        Intent intent = new Intent(this, welcome_3.class);
        startActivity(intent);
//        overridePendingTransition(R.anim.slide_right,
//                R.anim.slide_left);
    }
    public void OpenMainActivity(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
//        overridePendingTransition(R.anim.slide_right,
//                R.anim.slide_left);
    }
}