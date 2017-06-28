package za.co.aeonsource.quizapp;

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(final int textResId, final boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }
}
