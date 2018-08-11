package com.example.karno.penerimaintentimplisit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        Uri uri = intent.getData();

        if (uri != null) {
            TextView textView = (TextView) findViewById(R.id.text_uri_message);
            String uri_string = "URI: " + uri.toString();
            textView.setText(uri_string);

        }
    }
}
