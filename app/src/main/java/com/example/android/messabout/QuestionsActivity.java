package com.example.android.messabout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import static android.view.ViewGroup.FOCUS_BLOCK_DESCENDANTS;

/**
 * Created by dell on 07/03/2017.
 */



public class QuestionsActivity extends AppCompatActivity {
    /**
     * Adapter for the list of news articles
     */

    private QuestionAdaptor mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_list);


        final ArrayList<Question> Questions = new ArrayList<Question>();
        Questions.add(new Question("What is a Mayonaisse?", "Emulsion", "Mother sauce", "potato", "Emulsion", 1));
        Questions.add(new Question("What is a Romesco?", "Sauce", "Veg", "potato", "Sauce", 0));
        Questions.add(new Question("What is a Deba?", "Fish", "Knife", "potato", "Knife", 0));
        Questions.add(new Question("What is a Commis?", "Cunt", "Useless", "Lowlevel chef", "Lowlevel chef", 0));
        Questions.add(new Question("What is a Hollandaise?", "dressing", "Mother sauce", "potato", "Mother sauce", 0));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        QuestionAdaptor adapter = new QuestionAdaptor(this, Questions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setDescendantFocusability(FOCUS_BLOCK_DESCENDANTS);


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}






























//    public void checkAns1(View view) {
//
//        TextView Ans1 = (TextView) findViewById(R.id.Ans1);
//        TextView Ans2 = (TextView) findViewById(R.id.Ans2);
//        TextView Ans3 = (TextView) findViewById(R.id.Ans3);
//        String userAns = Ans1.getText().toString();
//        String altAns2 = Ans2.getText().toString();
//        String altAns3 = Ans3.getText().toString();
//        TextView trueAns = (TextView) findViewById(R.id.corr);
//        String actAns = trueAns.getText().toString();
//
//        if (actAns.equals(userAns)) {
//            MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
//            mp.start();
//            Ans1.setClickable(false);
//            Ans1.setBackgroundColor(Color.GREEN);
//            Ans2.setClickable(false);
//            Ans3.setClickable(false);
//
//        } else if (actAns.equals(altAns2)) {
//            MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
//            mp.start();
//            Ans1.setClickable(false);
//            Ans1.setBackgroundColor(Color.RED);
//            Ans2.setClickable(false);
//            Ans2.setBackgroundColor((Color.GREEN));
//            Ans3.setClickable(false);
//        } else if (actAns.equals(altAns3)) {
//            MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
//            mp.start();
//            Ans1.setClickable(false);
//            Ans1.setBackgroundColor(Color.RED);
//            Ans2.setClickable(false);
//            Ans3.setClickable(false);
//            Ans3.setBackgroundColor((Color.GREEN));
//        }
//        new CountDownTimer(1000, 2000) {
//            public void onTick(long millisUntilFinished) {
//            }
//
//            public void onFinish() {
//                LinearLayout container = (LinearLayout) findViewById(R.id.Container);
//                container.setVisibility(View.GONE);
//            }
//        }.start();
//    }
//
//    public void checkAns2(View view) {
//        TextView Ans1 = (TextView) findViewById(R.id.Ans1);
//        TextView Ans2 = (TextView) findViewById(R.id.Ans2);
//        TextView Ans3 = (TextView) findViewById(R.id.Ans3);
//        String altAns1 = Ans1.getText().toString();
//        String userAns = Ans2.getText().toString();
//        String altAns3 = Ans3.getText().toString();
//        TextView trueAns = (TextView) findViewById(R.id.corr);
//        String actAns = trueAns.getText().toString();
//
//        if (actAns.equals(altAns1)) {
//            MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
//            mp.start();
//            Ans1.setClickable(false);
//            Ans1.setBackgroundColor(Color.GREEN);
//            Ans2.setClickable(false);
//            Ans2.setBackgroundColor((Color.RED));
//            Ans3.setClickable(false);
//        } else if (actAns.equals(userAns)) {
//            MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
//            mp.start();
//            Ans1.setClickable(false);
//            Ans2.setBackgroundColor(Color.GREEN);
//            Ans2.setClickable(false);
//            Ans3.setClickable(false);
//        } else if (actAns.equals(altAns3)) {
//            MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
//            mp.start();
//            Ans1.setClickable(false);
//            Ans2.setBackgroundColor(Color.RED);
//            Ans2.setClickable(false);
//            Ans3.setClickable(false);
//            Ans3.setBackgroundColor((Color.GREEN));
//        }
//        new CountDownTimer(1000, 2000) {
//            public void onTick(long millisUntilFinished) {
//            }
//
//            public void onFinish() {
//                LinearLayout container = (LinearLayout) findViewById(R.id.Container);
//                container.setVisibility(View.GONE);
//            }
//        }.start();
//    }
//
//    public void checkAns3(View view) {
//        TextView Ans1 = (TextView) findViewById(R.id.Ans1);
//        TextView Ans2 = (TextView) findViewById(R.id.Ans2);
//        TextView Ans3 = (TextView) findViewById(R.id.Ans3);
//        String altAns1 = Ans1.getText().toString();
//        String altAns2 = Ans2.getText().toString();
//        String userAns = Ans3.getText().toString();
//        TextView trueAns = (TextView) findViewById(R.id.corr);
//        String actAns = trueAns.getText().toString();
//
//        if (actAns.equals(userAns)) {
//            MediaPlayer mp = MediaPlayer.create(this, R.raw.right);
//            mp.start();
//            Ans1.setClickable(false);
//            Ans2.setClickable(false);
//            Ans3.setClickable(false);
//            Ans3.setBackgroundColor(Color.GREEN);
//
//        } else if (actAns.equals(altAns1)) {
//            MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
//            mp.start();
//            Ans1.setClickable(false);
//            Ans1.setBackgroundColor(Color.GREEN);
//            Ans2.setClickable(false);
//            Ans3.setBackgroundColor((Color.RED));
//            Ans3.setClickable(false);
//        } else if (actAns.equals(altAns2)) {
//            MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong);
//            mp.start();
//            Ans1.setClickable(false);
//            Ans2.setBackgroundColor(Color.RED);
//            Ans2.setClickable(false);
//            Ans3.setClickable(false);
//            Ans2.setBackgroundColor((Color.GREEN));
//        }
//        new CountDownTimer(1000, 2000) {
//            public void onTick(long millisUntilFinished) {
//            }
//
//            public void onFinish() {
//                LinearLayout container = (LinearLayout) findViewById(R.id.Container);
//                container.setVisibility(View.GONE);
//            }
//        }.start();
//    }







