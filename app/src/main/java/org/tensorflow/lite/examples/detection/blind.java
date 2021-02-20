package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class blind extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blind);

        Button button3 = (Button) findViewById(R.id.button6);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToAnotherActivity(view);
            }
        });
    }

    public void goToAnotherActivity(View view) {
        Intent intent = new Intent(this, DetectorActivity.class);
        startActivity(intent);
    }
}