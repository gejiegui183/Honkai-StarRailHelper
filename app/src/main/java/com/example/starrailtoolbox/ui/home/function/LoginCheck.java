package com.example.starrailtoolbox.ui.home.function;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.starrailtoolbox.ui.home.HomeFragment;
import com.example.starrailtoolbox.userStatus.Switcher;

public class LoginCheck extends AppCompatActivity {
    public String userUID;
    Switcher switcher;

    public void setUserUID(String userUID){
        this.userUID = userUID;
        if(userUID.equals("12123")){
            switcher.loginStatus = 1;
        }
    }

    public void check(){

    }
}
