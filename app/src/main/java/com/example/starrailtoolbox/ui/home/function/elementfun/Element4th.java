package com.example.starrailtoolbox.ui.home.function.elementfun;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.starrailtoolbox.databinding.Fragment4thEleBinding;
import org.jetbrains.annotations.NotNull;

public class Element4th extends Fragment {
    private static final String sectionNum = "section_number";
    private PageViewModel pageViewModel;
    private Fragment4thEleBinding binding;

    public static Element4th newInstance(){
        Element4th fragment = new Element4th();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = new ViewModelProvider(this).get(PageViewModel.class);
        int index = 4;
        if (getArguments() != null) {
            index = getArguments().getInt(sectionNum);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = Fragment4thEleBinding.inflate(inflater , container , false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}
