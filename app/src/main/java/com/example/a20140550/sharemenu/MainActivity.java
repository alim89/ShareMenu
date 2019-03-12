package com.example.a20140550.sharemenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
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
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.shareID) {

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject="c programming Apps";
            String body="This ia a programming Language. Here is very interesting";
            intent.putExtra(intent.EXTRA_SUBJECT,subject);
            intent.putExtra(intent.EXTRA_TEXT,body);
            startActivity(intent.createChooser(intent,"Share it"));

        }
        else if(item.getItemId()==R.id.FeedbackID)
        {
           Intent intent=new Intent(getApplicationContext(),FeedbackActivity.class);
           startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}
