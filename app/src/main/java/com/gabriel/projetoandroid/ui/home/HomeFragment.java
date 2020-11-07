package com.gabriel.projetoandroid.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.gabriel.projetoandroid.MainActivity;
import com.gabriel.projetoandroid.R;
import com.google.firebase.auth.FirebaseAuth;

public class HomeFragment extends Fragment {

    private Button btn2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        Button btn2 = (Button) root.findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                FirebaseAuth.getInstance().signOut();

                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);

                getActivity().finish();
            }
        });

        return root;
    }

}