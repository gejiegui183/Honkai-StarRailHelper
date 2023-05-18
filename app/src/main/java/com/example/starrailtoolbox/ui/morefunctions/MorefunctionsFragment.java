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

        //抽卡排行
        ImageButton drawCard = (ImageButton) getActivity().findViewById(R.id.imageButton6);
        drawCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDrawCard = new Intent(getActivity() , DrawCardRank.class);
                startActivity(intentDrawCard);
            }
        });

        //伤害排行
        ImageButton damageRank = (ImageButton) getActivity().findViewById(R.id.imageButton8);
        damageRank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDamageRank = new Intent(getActivity() , DamageRank.class);
                startActivity(intentDamageRank);
            }
        });

        //光锥排行
        ImageButton elementRank = (ImageButton) getActivity().findViewById(R.id.imageButton9);
        elementRank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEle = new Intent(getActivity() , ElementRank.class);
                startActivity(intentEle);
            }
        });

        //大数据统计
        ImageButton statistic = (ImageButton) getActivity().findViewById(R.id.imageButton10);
        statistic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentStatistic = new Intent(getActivity() , Statistic.class);
                startActivity(intentStatistic);
            }
        });

        //角色喜爱度
        ImageButton favorite = (ImageButton) getActivity().findViewById(R.id.imageButton11);
        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFavorite = new Intent(getActivity() , Favorite.class);
                startActivity(intentFavorite);
            }
        });

        //抽卡历史
        ImageButton drawCardHistory = (ImageButton) getActivity().findViewById(R.id.imageButton12);
        drawCardHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHistory = new Intent(getActivity() , DrawCardHistory.class);
                startActivity(intentHistory);
            }
        });

        //抽卡玄学
        ImageButton drawCardMethod = (ImageButton)  getActivity().findViewById(R.id.imageButton17);
        drawCardMethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentdrawMethod = new Intent(getActivity() , DrawCardMethod.class);
                startActivity(intentdrawMethod);
            }
        });

        //成就
        ImageButton achievement = (ImageButton) getActivity().findViewById(R.id.imageButton14);
        achievement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAchieve = new Intent(getActivity() , Achievement.class);
                startActivity(intentAchieve);
            }
        });

        //抽卡模拟
        ImageButton simulator = (ImageButton) getActivity().findViewById(R.id.imageButton18);
        simulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSimulator = new Intent(getActivity() , DrawCardSimulator.class);
                startActivity(intentSimulator);
            }
        });

        //喜爱度评分
        ImageButton score = (ImageButton) getActivity().findViewById(R.id.imageButton19);
        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentScore = new Intent(getActivity() , Score.class);
                startActivity(intentScore);
            }
        });

        //抽卡预测
        ImageButton predict = (ImageButton) getActivity().findViewById(R.id.imageButton21);
        predict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPredict = new Intent(getActivity() , Predict.class);
                startActivity(intentPredict);
            }
        });
    }
}
