package com.example.mynotepad;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputNote;
    private Button saveButton;
    private TextView displayNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNote = findViewById(R.id.inputNote);
        saveButton = findViewById(R.id.saveButton);
        displayNote = findViewById(R.id.displayNote);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String note = inputNote.getText().toString();
                displayNote.setText(note.isEmpty() ? "pas de note" : note);
            }
        });
    }
}
