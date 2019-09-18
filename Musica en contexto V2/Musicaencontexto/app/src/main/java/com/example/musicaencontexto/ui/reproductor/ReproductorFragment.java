package com.example.musicaencontexto.ui.reproductor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.musicaencontexto.R;

public class ReproductorFragment extends Fragment {

    private ReproductorViewModel reproductorViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        reproductorViewModel =
                ViewModelProviders.of(this).get(ReproductorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_reproductor, container, false);
        final TextView textView = root.findViewById(R.id.text_reproductor);
        reproductorViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}