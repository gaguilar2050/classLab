package com.example.spamt.csc413hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.header).setOnClickListener(this);


        CheckBox check = (CheckBox)findViewById(R.id.checkBox);

        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView checkbox_text = (TextView)findViewById(R.id.checkbox_result);
                if(isChecked) {
                    checkbox_text.setText("Is checked");
                }
                else {
                    checkbox_text.setText("Not checked");
                }

                ProgressBar progress = (ProgressBar)findViewById(R.id.progressBar);
                progress.setProgress(100);
            }
        });


    }


    public void onClick(View v)
    {

        ProgressBar progress = (ProgressBar)findViewById(R.id.progressBar);
        progress.setProgress(50);


    }
}
