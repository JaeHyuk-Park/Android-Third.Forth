package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView) findViewById(R.id.text);
        EditText textT1 = (EditText) findViewById(R.id.editT1);
        EditText textT2 = (EditText) findViewById(R.id.editT2);
        Button btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view2 = View.inflate(MainActivity.this, R.layout.activity_dialog, null);
                EditText id = (EditText) view2.findViewById(R.id.idText);
                EditText email = (EditText) view2.findViewById(R.id.emailText);
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);

                dialog.setView(view2);

                dialog.setNegativeButton("취소", null);
                dialog.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        textT1.setText(id.getText());
                        textT2.setText(email.getText());
                    }
                });

                dialog.show();
            }
        });

    }
}