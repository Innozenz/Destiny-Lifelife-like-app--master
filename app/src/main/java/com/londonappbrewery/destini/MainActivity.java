package com.londonappbrewery.destini;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Member variations declaration
    private TextView mStoryTextView;
    private Button topButton;
    private Button downButton;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Wire up member variables
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        downButton = (Button) findViewById(R.id.buttonBottom);


        // Top button click
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    downButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else {
                    mStoryTextView.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);
                    downButton.setVisibility(View.GONE);
                }
            }
        });


        // Bottom button click
        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1) {
                    mStoryTextView.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    downButton.setText(R.string.T2_Ans2);
                } else if (mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T4_End);
                    topButton.setVisibility(View.GONE);
                    downButton.setVisibility(View.GONE);
                } else {
                    mStoryTextView.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);
                    downButton.setVisibility(View.GONE);
                }
            }


        });
    }
}
