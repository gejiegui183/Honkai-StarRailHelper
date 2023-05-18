package com.example.starrailtoolbox.ui.home;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.starrailtoolbox.R;
import com.example.starrailtoolbox.ui.dashboard.DashboardFragment;
import com.example.starrailtoolbox.ui.home.function.*;
import com.example.starrailtoolbox.databinding.FragmentHomeBinding;
import com.example.starrailtoolbox.userStatus.Info;
import com.example.starrailtoolbox.userStatus.Switcher;


public class HomeFragment extends Fragment{
    private FragmentHomeBinding binding;
    private static final String name = "ARG_PARAM1";
    Switcher switcher;
    Info info;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.fragment_home , null);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        if (switcher.loginStatus == 1) {
            TextView textView = (TextView) root.findViewById(R.id.userUID);
            textView.setText("UID:" + info.userUID);
            Button button = (Button) root.findViewById(R.id.button4);
            button.setText("退出");
        }
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
//        view = null;
    }

    @Override
    public void onActivityCreated(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button login = (Button) getActivity().findViewById(R.id.button4);
        ImageButton query = (ImageButton) getActivity().findViewById(R.id.imageButton);
        ImageButton charactor = (ImageButton) getActivity().findViewById(R.id.imageButton2);
        ImageButton pic = (ImageButton) getActivity().findViewById(R.id.imageButton3);
        ImageButton element = (ImageButton) getActivity().findViewById(R.id.imageButton4);
        ImageButton achive = (ImageButton) getActivity().findViewById(R.id.imageButton5);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switcher.loginStatus == 0){
                    loginDialog();
                }
                else if(switcher.loginStatus == 1){
                    logoutDialog();

                }
            }
        });

        query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentQuery = new Intent(getActivity() , QueryActivity.class);
                startActivity(intentQuery);
            }
        });

        charactor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChar = new Intent(getActivity() , Charactor.class);
                startActivity(intentChar);
            }
        });

        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPic = new Intent(getActivity() , PictureGetter.class);
                startActivity(intentPic);
            }
        });

        element.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEle = new Intent(getActivity() , ElementActivity.class);
                startActivity(intentEle);
            }
        });

        achive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAchive = new Intent(getActivity() , Achievement.class);
                startActivity(intentAchive);
            }
        });
    }

    public void loginDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getActivity());
        builder.setTitle("用户登录");
        builder.setMessage("输入UID");

        final EditText input = new EditText(this.getActivity());
        input.setInputType(2);

        builder.setView(input);

        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                LoginCheck loginCheck = new LoginCheck();
                loginCheck.setUserUID(input.getText().toString());

                if(switcher.loginStatus == 1){
                    TextView textView = (TextView) getActivity().findViewById(R.id.userUID);
                    textView.setText("UID:" + input.getText().toString());
                    info.userUID = input.getText().toString();
                    Button button = (Button) getActivity().findViewById(R.id.button4);
                    button.setText("退出");
                    sendUID(input.getText().toString());
                }
            }
        });

        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();
    }

    public void logoutDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getActivity());
        builder.setTitle("提示");
        builder.setMessage("是否要退出登录");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switcher.loginStatus = 0;
                if (switcher.loginStatus == 0) {
                    TextView textView = (TextView) getActivity().findViewById(R.id.userUID);
                    textView.setText("UID:");
                    Button button = (Button) getActivity().findViewById(R.id.button4);
                    button.setText("登录");
                }
            }
        });

        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();
    }

    public void sendUID(String uid){
        info.userUID = uid;

    }

}