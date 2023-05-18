package com.example.starrailtoolbox.ui.home.function.elementfun;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.starrailtoolbox.databinding.Fragment8thEleBinding;
import org.jetbrains.annotations.NotNull;

public class Element8th extends Fragment {
    private static final String sctionNum = "section_number";
    private PageViewModel pageViewModel;
    private Fragment8thEleBinding binding;

    public static Element8th newInstance(){
        Element8th fragment = new Element8th();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = new ViewModelProvider(this).get(PageViewModel.class);
        int index = 8;
        if (this.getArguments() != null) {
            index = getArguments().getInt(sctionNum);
        }
        pageViewModel.setIndex(index);
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        binding = Fragment8thEleBinding.inflate(inflater , container , false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}
