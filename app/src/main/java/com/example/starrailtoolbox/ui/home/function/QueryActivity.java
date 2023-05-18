package com.example.starrailtoolbox.ui.home.function;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.core.content.ContextCompat;
import com.example.starrailtoolbox.R;
import com.example.starrailtoolbox.userStatus.Switcher;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import com.example.starrailtoolbox.ui.home.function.queryfun.SectionsPagerAdapter;
import com.example.starrailtoolbox.databinding.ActivityQueryBinding;

public class QueryActivity extends AppCompatActivity {
    Switcher switcher;
    private ActivityQueryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityQueryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            Spannable text = new SpannableString("跃迁");
            text.setSpan(new ForegroundColorSpan(Color.rgb(255,218,130)) , 0 , text.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
            actionBar.setTitle(text);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        if (switcher.loginStatus == 0) {
            Snackbar.make(findViewById(R.id.queryFrame) , "未登录，开拓者先去绑定UID哦！", Snackbar.LENGTH_LONG).setAction("Action", null).show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == 16908332) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}