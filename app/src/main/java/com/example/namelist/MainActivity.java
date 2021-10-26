package com.example.namelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = findViewById(R.id.submit);
        TextView textview = findViewById(R.id.textview);
        EditText edittext = findViewById(R.id.edittext);
        ListView listview = findViewById(R.id.listview);
        final List<String> data = new ArrayList<>();
        final ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>( this, android.R.layout.simple_expandable_list_item_1, data);
        listview .setAdapter(stringArrayAdapter);
        submit . setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name = submit.getText().toString();
                        data.add(name);
                        stringArrayAdapter.notifyDataSetChanged();
                        edittext.setText("");
                    }
                }

        );
    }
}