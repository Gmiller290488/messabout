package com.example.android.messabout;

import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.android.messabout.R.id.Ans1;
import static com.example.android.messabout.R.id.Ans2;
import static com.example.android.messabout.R.id.Ans3;

/**
 * Created by dell on 07/03/2017.
 */

public class QuestionAdaptor extends ArrayAdapter<Question> {


    public QuestionAdaptor(Context context, ArrayList<Question> pQuestions) {
        super(context, 0, pQuestions);
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHolder mainViewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.question_item, parent, false);

            ViewHolder viewHolder = new ViewHolder();
            viewHolder.Question = (TextView) convertView.findViewById(R.id.Question);
            viewHolder.Ans1 = (Button) convertView.findViewById(Ans1);
            viewHolder.Ans2 = (Button) convertView.findViewById(Ans2);
            viewHolder.Ans3 = (Button) convertView.findViewById(Ans3);
            convertView.setTag(viewHolder);
        }
        mainViewHolder = (ViewHolder) convertView.getTag();
        mainViewHolder.Question.setText((CharSequence) getItem(position));

                /*   TextView question = (TextView) convertView.findViewById(R.id.Question);
            question.setText(currentQuestion.getQuestion());

            Button Ans1 = (Button) convertView.findViewById(R.id.Ans1);
            Ans1.setText(currentQuestion.getAnswer1());
            Ans1.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                if (currentQuestion.getAnswer1() == currentQuestion.getCorrectAnswer()) {
                    correctAns(v);
                } else {
                    incorrectAns(v);
                }
            }

        });

        Button Ans2 = (Button) convertView.findViewById(R.id.Ans2);
        Ans2.setText(currentQuestion.getAnswer2());
        Ans2.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                if (currentQuestion.getAnswer2() == currentQuestion.getCorrectAnswer()) {
                    correctAns(v);
                } else {
                    incorrectAns(v);
                }
            }

        });

        Button Ans3 = (Button) convertView.findViewById(R.id.Ans3);
        Ans3.setText(currentQuestion.getAnswer3());
        Ans3.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                if (currentQuestion.getAnswer3() == currentQuestion.getCorrectAnswer()) {
                    correctAns(v);
                } else {
                    incorrectAns(v);
                }
            }

        });*/
        /*viewHolder.Ans2 = (Button) convertView.findViewById(R.id.Ans2);
        viewHolder.Ans2.setText(currentQuestion.getAnswer2());
        viewHolder.Ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Question currentQuestion = getItem(position);
                if (currentQuestion.getAnswer2() == currentQuestion.getCorrectAnswer()) {
                    correctAns(v);
                } else {
                    incorrectAns(v);
                }
            }
        });
        viewHolder.Ans3 = (Button) convertView.findViewById(R.id.Ans3);
        viewHolder.Ans3.setText(currentQuestion.getAnswer3());
        viewHolder.Ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Question currentQuestion = getItem(position);
                if (currentQuestion.getAnswer3() == currentQuestion.getCorrectAnswer()) {
                    correctAns(v);
                } else {
                    incorrectAns(v);
                }
            }
        });
        convertView.setTag(viewHolder);
*/



            //final Question currentQuestion = getItem(position);

       /* LinearLayout Container = (LinearLayout) listView.findViewById(R.id.Container);


        final TextView Question = (TextView) listView.findViewById(R.id.Question);
        Question.setText(currentQuestion.getQuestion());


        final TextView Ans1 = (TextView) listView.findViewById(R.id.Ans1);
        Ans1.setText(currentQuestion.getAnswer1());

            final TextView Ans2 = (TextView) listView.findViewById(R.id.Ans2);
        Ans2.setText(currentQuestion.getAnswer2());

        final TextView Ans3 = (TextView) listView.findViewById(R.id.Ans3);
        Ans3.setText(currentQuestion.getAnswer3());

        final TextView correctAns = (TextView) listView.findViewById(R.id.corr);
        correctAns.setText(currentQuestion.getCorrectAnswer());*/



        return convertView;
    }

    public void correctAns(View v) {
        Toast.makeText(getContext(), "Correct", Toast.LENGTH_SHORT).show();
        v.setBackgroundColor(Color.GREEN);
        MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.right);
        mp.start();
    }

    public void incorrectAns(View v) {
        Toast.makeText(getContext(), "Wrong", Toast.LENGTH_SHORT).show();
        MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.wrong);
        mp.start();
        v.setBackgroundColor(Color.RED);
    }

    public class ViewHolder {
        Button Ans1;
        Button Ans2;
        Button Ans3;
        TextView Question;

    }
}




