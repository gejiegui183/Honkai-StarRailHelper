package com.example.starrailtoolbox.ui.home.function;

import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toolbar;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.starrailtoolbox.R;

public class UserloginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("UID查询");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        ImageButton login = (ImageButton) findViewById(R.id.imageButton20);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textAreaGetter();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == 16908332){
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void textAreaGetter(){
        EditText UIDInput = (EditText) findViewById(R.id.et_username);
        String uid = UIDInput.getText().toString();
        System.out.println(uid+"<<DebugAndroid");
    }
}