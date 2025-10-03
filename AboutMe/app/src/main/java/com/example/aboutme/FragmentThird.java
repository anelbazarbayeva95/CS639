package com.example.aboutme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.fragment.NavHostFragment;
import android.widget.Button;

public class FragmentThird extends Fragment {

    public FragmentThird() {
        super(R.layout.fragment_third); // uses your XML directly
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btnPrev = view.findViewById(R.id.btnPrevious);
        btnPrev.setOnClickListener(v ->
                NavHostFragment.findNavController(FragmentThird.this).navigateUp()
        );
    }
}