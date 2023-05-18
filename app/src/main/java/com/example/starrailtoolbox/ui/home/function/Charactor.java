package com.example.starrailtoolbox.ui.home.function;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.example.starrailtoolbox.R;
import com.example.starrailtoolbox.userStatus.Switcher;
import com.google.android.material.snackbar.Snackbar;

public class Charactor extends AppCompatActivity {
    Switcher switcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charactor);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            Spannable text = new SpannableString("角色一览");
            text.setSpan(new ForegroundColorSpan(Color.rgb(255,218,130)) , 0 , text.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
            actionBar.setTitle(text);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        if (switcher.loginStatus == 0) {
            Snackbar.make(findViewById(R.id.characotrframe) , "未登录，开拓者先去绑定UID哦！", Snackbar.LENGTH_LONG).setAction("Action", null).show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == 16908332){
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
