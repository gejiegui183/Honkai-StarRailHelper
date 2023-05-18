package com.example.starrailtoolbox.ui.home.function.elementfun;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.starrailtoolbox.databinding.Fragment1stEleBinding;
import com.example.starrailtoolbox.databinding.Fragment6thEleBinding;
import org.jetbrains.annotations.NotNull;

public class Element6th extends Fragment {
    private static final String sectionNum = "section_number";
    private PageViewModel pageViewModel;
    private Fragment6thEleBinding binding;

    public static Element6th newInstance(){
        Element6th fragment = new Element6th();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = new ViewModelProvider(this).get(PageViewModel.class);
        int index = 6;
        if (getArguments() != null) {
            index = getArguments().getInt(sectionNum);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        binding = Fragment6thEleBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}

