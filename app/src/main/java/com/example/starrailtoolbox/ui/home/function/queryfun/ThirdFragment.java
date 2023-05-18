package com.example.starrailtoolbox.ui.home.function.queryfun;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.starrailtoolbox.databinding.FragmentQuery3Binding;
import org.jetbrains.annotations.NotNull;

public class ThirdFragment extends Fragment {
    private static final String sectionNum = "section_number";
    private PageViewModel pageViewModel;
    private FragmentQuery3Binding binding3;

    public static ThirdFragment newInstance(){
        ThirdFragment fragment = new ThirdFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = new ViewModelProvider(this).get(PageViewModel.class);
        int index = 3;
        if (getArguments() != null) {
            index = getArguments().getInt(sectionNum);
        }
        pageViewModel.setIndex(index);
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding3 = FragmentQuery3Binding.inflate(inflater , container , false);
        View root = binding3.getRoot();
        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding3 = null;
    }
}
