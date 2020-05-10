package com.example.peertopeer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.ListViewAutoScrollHelper;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class RentABook extends AppCompatActivity {

    ArrayAdapter<String> arrayAdapter;
    //adding toolbar to this activity
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_a_book);
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        ListView listView = findViewById(R.id.my_list);
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add("Oliver Twist");
        mylist.add("Silmarillion");
        mylist.add("War and Peace");
        mylist.add("Hamlet");
        arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);
        listView.setAdapter(arrayAdapter);

    }

    @Override
    public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
        return super.onCreateThumbnail(outBitmap, canvas);
    }

    //Adding menu on toolbar with inflator
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        MenuItem menuItem = menu.findItem(R.id.search_bar);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter();
                return false;

            }
        });
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
