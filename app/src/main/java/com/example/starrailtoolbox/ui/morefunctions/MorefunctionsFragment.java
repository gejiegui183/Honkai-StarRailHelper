package com.example.starrailtoolbox.ui.morefunctions;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.starrailtoolbox.R;
import com.example.starrailtoolbox.databinding.FragmentMorefunctionsBinding;
import com.example.starrailtoolbox.ui.home.function.Achievement;
import com.example.starrailtoolbox.ui.morefunctions.functions.*;

public class MorefunctionsFragment extends Fragment {
    private FragmentMorefunctionsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentMorefunctionsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onActivityCreated(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageButton drawCard = (ImageButton) getActivity().findViewById(R.id.imageButton6);
        drawCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDrawCard = new Intent(getActivity() , DrawCardRank.class);
                startActivity(intentDrawCard);
            }
        });

        ImageButton damageRank = (ImageButton) getActivity().findViewById(R.id.imageButton8);
        damageRank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDamageRank = new Intent(getActivity() , DamageRank.class);
                startActivity(intentDamageRank);
            }
        });

        ImageButton elementRank = (ImageButton) getActivity().findViewById(R.id.imageButton9);
        elementRank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEle = new Intent(getActivity() , ElementRank.class);
                startActivity(intentEle);
            }
        });

        ImageButton statistic = (ImageButton) getActivity().findViewById(R.id.imageButton10);
        statistic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentStatistic = new Intent(getActivity() , Statistic.class);
                startActivity(intentStatistic);
            }
        });

        ImageButton favorite = (ImageButton) getActivity().findViewById(R.id.imageButton11);
        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFavorite = new Intent(getActivity() , Favorite.class);
                startActivity(intentFavorite);
            }
        });

        ImageButton drawCardHistory = (ImageButton) getActivity().findViewById(R.id.imageButton12);
        drawCardHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHistory = new Intent(getActivity() , DrawCardHistory.class);
                startActivity(intentHistory);
            }
        });

        ImageButton drawCardMethod = (ImageButton)  getActivity().findViewById(R.id.imageButton13);
        drawCardMethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentdrawMethod = new Intent(getActivity() , DrawCardMethod.class);
                startActivity(intentdrawMethod);
            }
        });

        ImageButton achievement = (ImageButton) getActivity().findViewById(R.id.imageButton14);
        achievement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAchieve = new Intent(getActivity() , Achievement.class);
                startActivity(intentAchieve);
            }
        });

        ImageButton simulator = (ImageButton) getActivity().findViewById(R.id.imageButton15);
        simulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSimulator = new Intent(getActivity() , DrawCardSimulator.class);
                startActivity(intentSimulator);
            }
        });

        ImageButton score = (ImageButton) getActivity().findViewById(R.id.imageButton16);
        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentScore = new Intent(getActivity() , Score.class);
                startActivity(intentScore);
            }
        });

        ImageButton predict = (ImageButton) getActivity().findViewById(R.id.imageButton17);
        predict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPredict = new Intent(getActivity() , Predict.class);
                startActivity(intentPredict);
            }
        });
    }
}
