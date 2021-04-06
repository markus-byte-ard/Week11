package com.example.week11v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentSettings extends Fragment {
    View view;
    Switch switch1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_settings, container, false);
        if (savedInstanceState != null) {
            switch1 = view.findViewById(R.id.switch1);
            switch1.setChecked(savedInstanceState.getBoolean("state"));
        }
        return view;
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Switch switch1 = view.findViewById(R.id.switch1);
        boolean switchState = switch1.isChecked();
        outState.putBoolean("state", switchState);
    }
}
