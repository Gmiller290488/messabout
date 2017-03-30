package com.example.android.messabout;

/**
 * Created by dell on 07/03/2017.
 */

public class Question {



    /*
    * Class for the question and answers
     */

    // The question
    private String mQuestion;

    private String mAnswer1;

    private String mAnswer2;

    private String mAnswer3;

    // This number will be 1, 2 or 3 to indicate which answer is correct
    private String mCorrectAnswer;

    private int mVisible;


    public Question(String question, String ans1, String ans2, String ans3, String correctAns, int visible) {
        mQuestion = question;
        mAnswer1 = ans1;
        mAnswer2 = ans2;
        mAnswer3 = ans3;
        mCorrectAnswer = correctAns;
        mVisible = visible;
    }

    public String getCorrectAnswer() {return mCorrectAnswer; }

    public String getQuestion() {
        return mQuestion;
    }

    public String getAnswer1() {
        return mAnswer1;
    }

    public String getAnswer2() {
        return mAnswer2;
    }

    public String getAnswer3() {
        return mAnswer3;
    }

    public int getVisible() {return mVisible; }

    public int setVisible(int vis) {
        mVisible = vis;
        return mVisible;
    }


}


