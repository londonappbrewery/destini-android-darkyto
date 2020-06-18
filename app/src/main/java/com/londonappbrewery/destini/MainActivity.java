package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static Integer mStoryIndex = 1;
    // TODO: Steps 4 & 8 - Declare member variables here:
    public TextView storyTextView;
    public Button buttonTop;
    public Button buttonBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = findViewById(R.id.storyTextView);
        buttonTop = findViewById(R.id.buttonTop);
        buttonBottom = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        View.OnClickListener mClickListenerTop = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Clicked on TOP");

                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    storyTextView.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3) {
                    storyTextView.setText(R.string.T6_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                }
            }
        };
        buttonTop.setOnClickListener(mClickListenerTop);

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        View.OnClickListener mClickListenerBottom = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Clicked on Bottom");

                if (mStoryIndex == 1) {
                    storyTextView.setText(R.string.T2_Story);
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    storyTextView.setText(R.string.T4_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                } else if (mStoryIndex == 3) {
                    storyTextView.setText(R.string.T5_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                }
            }
        };
        buttonBottom.setOnClickListener(mClickListenerBottom);

    }
}
