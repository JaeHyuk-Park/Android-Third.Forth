package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        EditText edit = (EditText) findViewById(R.id.editText);
        Button btn = (Button) findViewById(R.id.addbutton);
        ListView listview = (ListView) findViewById(R.id.listitem);

        List<String> list = new ArrayList<String>();
        ArrayAdapter<String> line = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.add(edit.getText().toString());
                listview.setAdapter(line);

                edit.setText("");
            }
        });

        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                list.remove(position);
                listview.setAdapter(line);

                return false;
            }
        });
    }
}