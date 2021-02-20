package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registerUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        Button button5 = (Button) findViewById(R.id.button7);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToAnotherActivity(view);
            }
        });
    }

    public void goToAnotherActivity(View view) {
        Intent intent = new Intent(this, check.class);
        startActivity(intent);
    }
}