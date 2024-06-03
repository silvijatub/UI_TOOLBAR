package com.example.ui_toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends MenuForAllActivity {

    Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set content view first

        myToolbar = findViewById(R.id.myToolBar); // Ensure the toolbar ID matches
        setSupportActionBar(myToolbar); // Set the toolbar as the action bar

        Button second = (Button) findViewById(R.id.button);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), SecondActivity.class));
            }
        });

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu, menu); // Inflate the menu
//
//        // Find the search menu item
//        MenuItem searchItem = (MenuItem) findViewById(R.id.search);
//        if (searchItem != null) {
//            SearchView searchView = (SearchView) searchItem.getActionView();
//            searchView.setQueryHint("Search here...");
//
//            // Set the OnActionExpandListener
//            searchItem.setOnActionExpandListener(new MenuItem.OnActionExpandListener() {
//                @Override
//                public boolean onMenuItemActionExpand(@NonNull MenuItem item) {
//                    Toast.makeText(MainActivity.this, "Search is expanded", Toast.LENGTH_LONG).show();
//                    return true;
//                }
//
//                @Override
//                public boolean onMenuItemActionCollapse(@NonNull MenuItem item) {
//                    Toast.makeText(MainActivity.this, "Search is collapsed", Toast.LENGTH_LONG).show();
//                    return true;
//                }
//            });
//        }
//
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int id = item.getItemId();
//        if (id == R.id.delete) {
//            Toast toast = Toast.makeText(this, "Delete is pressed", Toast.LENGTH_SHORT);
//            toast.show();
//        } else if (id == R.id.menu) {
//            Toast.makeText(this, "Menu is pressed", Toast.LENGTH_SHORT).show();
//        } else {
//            return super.onOptionsItemSelected(item);
//        }
//        return true;
//    }
}