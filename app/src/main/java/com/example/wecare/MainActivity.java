package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

   }

    public void clickme(View view) {
//        Intent start = new Intent(this, UserProfileActivity.class);
//        startActivity(start);

//        Intent start = new Intent(this, SubscribedNgoListActivity.class);
//        startActivity(start);

        Intent start = new Intent(this, CreatePost.class);
        startActivity(start);
    }
}

