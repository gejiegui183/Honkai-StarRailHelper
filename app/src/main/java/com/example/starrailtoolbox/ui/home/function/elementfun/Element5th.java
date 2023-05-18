package com.example.starrailtoolbox.ui.home.function.elementfun;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.starrailtoolbox.databinding.Fragment5thEleBinding;
import org.jetbrains.annotations.NotNull;

public class Element5th extends Fragment {
    private static final String sectionNum = "section_nunmber";
    private PageViewModel pageViewModel;
    private Fragment5thEleBinding binding;

    public static Element5th newInstance(){
        Element5th fragment = new Element5th();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = new ViewModelProvider(this).get(PageViewModel.class);
        int index = 5;
        if (getArguments() != null) {
            index = getArguments().getInt(sectionNum);
        }
        pageViewModel.setIndex(index);
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = Fragment5thEleBinding.inflate(inflater , container , false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}
