package com.example.starrailtoolbox.ui.home.function.queryfun;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.starrailtoolbox.databinding.FragmentQuery2Binding;
import org.jetbrains.annotations.NotNull;

public class SecondFragment extends Fragment {
    private static final String sectionNum = "section_number";
    private PageViewModel pageViewModel;
    private FragmentQuery2Binding binding2;

    public static SecondFragment newInstance() {
        SecondFragment fragment = new SecondFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = new ViewModelProvider(this).get(PageViewModel.class);
        int index = 2;
        if (getArguments() != null) {
            index = getArguments().getInt(sectionNum);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding2 = FragmentQuery2Binding.inflate(inflater , container , false);
        View root = binding2.getRoot();
        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding2 = null;
    }
}
