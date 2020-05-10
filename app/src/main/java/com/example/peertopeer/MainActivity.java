package com.example.peertopeer;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
    //Sending the user to other activities or fragments
    public  void goA(View g)
    {
        Intent i=new Intent(this,RentABook.class);
        startActivity(i);
    }
    public  void goB(View g)
    {
        Intent i=new Intent(this,MyLibrary.class);
        startActivity(i);
    }
    public  void goC(View g)
    {
        Intent i=new Intent(this,BookShop.class);
        startActivity(i);
    }


}
