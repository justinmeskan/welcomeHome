package com.example.justinmeskan.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.justinmeskan.menu.R;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        TextView one = (TextView) findViewById(R.id.menu_item_1);
        one.setText("fuck you justin");
        TextView two = (TextView) findViewById(R.id.menu_item_2);
        TextView three = (TextView) findViewById(R.id.menu_item_3);
        Log.i("mainActivity", one.toString());
        Log.i("mainActivity", two.toString());
        Log.i("mainActivity", three.toString());
        // Find first menu item TextView and print the text to the logs

        // Find second menu item TextView and print the text to the logs

        // Find third menu item TextView and print the text to the logs

    }
}
