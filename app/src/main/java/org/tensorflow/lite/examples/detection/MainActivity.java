package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToAnotherActivity(view);
            }
        });

        Button button4 = (Button) findViewById(R.id.button);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToAnotherActivity1(view);
            }
        });
    }

    public void goToAnotherActivity(View view) {
        Intent intent = new Intent(this, userEnter.class);
        startActivity(intent);
    }

    public void goToAnotherActivity1(View view) {
        Intent intent = new Intent(this, registerUser.class);
        startActivity(intent);
    }
}