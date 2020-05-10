package com.example.peertopeer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class BookShop extends AppCompatActivity {
    //adding toolbar to this activity
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_shop);
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
    }

    //Adding menu on toolbar with inflator
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return true;
    }
    //  Action bar item clicks are being handled here.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {

            case R.id.action_settings:
                startActivity(new Intent(this,Settings_Activity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
