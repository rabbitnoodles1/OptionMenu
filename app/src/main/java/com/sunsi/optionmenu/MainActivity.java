package com.sunsi.optionmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.optionmenu,menu);
        //menu.add(1,100,1,"Menu1");
        MenuItem item = menu.add(1,100,1,"Menu1");
        item.setTitle("sssss");
        item.setIcon(R.mipmap.ic_launcher);
        menu.add(1,101,1,"Menu2");
        menu.add(1,102,1,"Menu3");
        menu.add(1,103,1,"Menu4");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 100:
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                item.setIntent(intent);
                break;
            case 101:
                Toast.makeText(MainActivity.this,"This is menu2",Toast.LENGTH_SHORT).show();
                break;
            case 102:
                Toast.makeText(MainActivity.this,"This is menu3",Toast.LENGTH_SHORT).show();
                break;
            case 103:
                Toast.makeText(MainActivity.this,"This is menu4",Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
