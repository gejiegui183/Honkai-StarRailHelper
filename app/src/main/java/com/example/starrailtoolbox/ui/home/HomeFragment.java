package com.example.starrailtoolbox.ui.home;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.starrailtoolbox.R;
import com.example.starrailtoolbox.ui.home.function.*;
import com.example.starrailtoolbox.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home , null);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
//        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
//        view = null;
    }

    @Override
    public void onActivityCreated(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button login = (Button) getActivity().findViewById(R.id.button4);
        ImageButton query = (ImageButton) getActivity().findViewById(R.id.imageButton);
        ImageButton charactor = (ImageButton) getActivity().findViewById(R.id.imageButton2);
        ImageButton pic = (ImageButton) getActivity().findViewById(R.id.imageButton3);
        ImageButton element = (ImageButton) getActivity().findViewById(R.id.imageButton4);
        ImageButton achive = (ImageButton) getActivity().findViewById(R.id.imageButton5);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogin =new Intent(getActivity(),UserloginActivity.class);//设置切换对应activity
                startActivity(intentLogin);

            }
        });

        query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentQuery = new Intent(getActivity() , QueryActivity.class);
                startActivity(intentQuery);
            }
        });

        charactor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChar = new Intent(getActivity() , Charactor.class);
                startActivity(intentChar);
            }
        });

        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPic = new Intent(getActivity() , PictureGetter.class);
                startActivity(intentPic);
            }
        });

        element.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEle = new Intent(getActivity() , Element.class);
                startActivity(intentEle);
            }
        });

        achive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAchive = new Intent(getActivity() , Achievement.class);
                startActivity(intentAchive);
            }
        });
    }
}