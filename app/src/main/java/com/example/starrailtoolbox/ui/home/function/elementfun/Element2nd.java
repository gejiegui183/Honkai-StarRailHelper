package com.example.starrailtoolbox.ui.home.function.elementfun;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.starrailtoolbox.databinding.Fragment2ndEleBinding;
import org.jetbrains.annotations.NotNull;

public class Element2nd extends Fragment {
    private static final String sectionNum = "section_number";
    private PageViewModel pageViewModel;
    private Fragment2ndEleBinding binding;

    public static Element2nd newInstance(){
        Element2nd fragment = new Element2nd();
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
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = Fragment2ndEleBinding.inflate(inflater , container , false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}
