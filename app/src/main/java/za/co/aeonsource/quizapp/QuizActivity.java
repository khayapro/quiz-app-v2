package za.co.aeonsource.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTrueButton = (Button) findViewById(R.id.true_button_id);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, "True Clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        mFalseButton = ((Button) findViewById(R.id.false_button));
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, "False Clicked!", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate menu on this method
        return true;
    }
}
