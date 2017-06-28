package za.co.aeonsource.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private TextView mTextQuestion;
    private int count = 0;

    private Question [] mQuestions = {
            new Question(R.string.question_africa, true),
            new Question(R.string.question_americas, false),
            new Question(R.string.question_asia, true),
            new Question(R.string.question_mideast, false),
            new Question(R.string.question_oceans, true)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTextQuestion = ((TextView) findViewById(R.id.question_id));
        mTextQuestion.setText(mQuestions[count].getTextResId());

        mTrueButton = (Button) findViewById(R.id.true_button_id);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT)
                        .show();
            }
        });
        mFalseButton = ((Button) findViewById(R.id.false_button));
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, R.string.incorrect_toast, Toast.LENGTH_LONG)
                        .show();
            }
        });

        mNextButton = ((Button) findViewById(R.id.next_button));
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count == mQuestions.length - 1)
                    count = 0;
                Question question = mQuestions[count];
                mTextQuestion.setText(question.getTextResId());
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate menu on this method
        return true;
    }
}
