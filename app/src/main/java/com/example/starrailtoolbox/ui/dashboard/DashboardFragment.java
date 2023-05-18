package com.example.starrailtoolbox.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.starrailtoolbox.R;
import com.example.starrailtoolbox.databinding.FragmentDashboardBinding;
import com.example.starrailtoolbox.userStatus.Info;
import com.example.starrailtoolbox.userStatus.Switcher;
import com.google.android.material.snackbar.Snackbar;

public class DashboardFragment extends Fragment {
    Switcher switcher;
    Info info;
    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        if(switcher.loginStatus == 1){
            TextView textView = (TextView) view.findViewById(R.id.textView);
            textView.setText("UID:" + info.userUID);
        }
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}