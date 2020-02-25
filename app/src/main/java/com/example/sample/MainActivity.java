package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pushToSplash(View view){
        startActivity(new Intent(this, SplashScreen.class));
    }

    public void sendMessage(View view) {
        EditText message = findViewById(R.id.message);

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra("MESSAGE", message.getText().toString());
        startActivity(intent);

        message.setText(" ..");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.text:
                startActivity(new Intent(this, Text.class));
                return true;
            case R.id.song:
                startActivity(new Intent(this, Song.class));
                return true;
            case R.id.recycler:
                startActivity(new Intent(this, RViewActivity.class));
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

