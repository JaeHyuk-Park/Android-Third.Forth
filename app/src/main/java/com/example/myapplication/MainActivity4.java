package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        EditText edit = (EditText) findViewById(R.id.editText);
        Button btn = (Button) findViewById(R.id.addbutton);
        Spinner spn = (Spinner) findViewById(R.id.spinner2);

        List<String> list = new ArrayList<String>();
        ArrayAdapter<String> line = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.add(edit.getText().toString());
                spn.setAdapter(line);

                edit.setText("");
            }
        });
    }
}