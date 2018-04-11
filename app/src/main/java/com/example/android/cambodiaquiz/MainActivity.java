package com.example.android.cambodiaquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view) {

        // count correct answers only
        int count = 0;

        // collect states of checkboxes, radiobuttons, and user text

        // Question 1
        CheckBox q1a2correct = (CheckBox) findViewById(R.id.q1a2); // 3 correct CheckBoxes
        CheckBox q1a3correct = (CheckBox) findViewById(R.id.q1a3);
        CheckBox q1a4correct = (CheckBox) findViewById(R.id.q1a4);

        // get checked state of correct answers
        boolean q1a2 = q1a2correct.isChecked();
        boolean q1a3 = q1a3correct.isChecked();
        boolean q1a4 = q1a4correct.isChecked();

        // increment count if correct
        if (q1a2 && q1a3 && q1a4) {
            count++; }

        // Question 2
        RadioButton q2correct = (RadioButton) findViewById(R.id.q2a3); // 1 RadioButton can be checked in a RadioGroup
        boolean q2 = q2correct.isChecked();
        if (q2) {
            count++; }

        // Question 3
        EditText q3correct = (EditText) findViewById(R.id.q3_answer); // user supplied text with EditText

        // getText returns Char Sequence, convert to String, trim all whitespace
        String q3Guess = q3correct.getText().toString().trim();
        if (q3Guess.equalsIgnoreCase("Khmer")) { // allow any number of capitalized letters
            count++;
        }

        // Question 4 (1 RadioButton can be checked in a RadioGroup)
        RadioButton q4correct = (RadioButton) findViewById(R.id.q4a1);
        boolean q4 = q4correct.isChecked();
        if (q4) {
            count++;
        }

        // Question 5
        RadioButton q5correct = (RadioButton) findViewById(R.id.q5a3);
        boolean q5 = q5correct.isChecked();
        if (q5) {
            count++;
        }

        // Question 6
        RadioButton q6correct = (RadioButton) findViewById(R.id.q6a4);
        boolean q6 = q6correct.isChecked();
        if (q6) {
            count++;
        }

        // Question 7
        RadioButton q7correct = (RadioButton) findViewById(R.id.q7a2);
        boolean q7 = q7correct.isChecked();
        if (q7) {
            count++;
        }

        // Display toast message with quiz results ... "You scored (6) out 7!"
        Toast.makeText(getApplicationContext(), getString(R.string.correctMessage, Integer.toString(count)), Toast.LENGTH_SHORT).show();

    }
}
