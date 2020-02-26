package edu.sjsu.patil.sharanbasavaraj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView emailPromptBox = (TextView) findViewById(R.id.textView);
        TextView emailTitleBox = (TextView) findViewById(R.id.textView3);
        EditText emailTextBox = (EditText) findViewById(R.id.editText);
        EditText titleTextBox = (EditText) findViewById(R.id.editText3);

        String emailId = emailTextBox.getText().toString();
        String emailTitle = titleTextBox.getText().toString();


    }
}
