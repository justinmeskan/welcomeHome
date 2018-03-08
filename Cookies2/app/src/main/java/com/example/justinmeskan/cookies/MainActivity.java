package com.example.justinmeskan.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        ImageView img = (ImageView) findViewById(R.id.android_cookie_image_view);
        img.setImageResource(R.drawable.after_cookie);
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        TextView word = (TextView) findViewById(R.id.status_text_view);
        word.setText("I'm so full!!");
        // TODO: Find a reference to the TextView in the layout. Change the text.
        Log.i("justindude.java", "alright Justin this is the real deal message eat my  shorts");
    }
}