package com.example.anuj.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class FragmentThree extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_three, container, false);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("Fragment 3","Attach");
        Toast.makeText(getContext(),"Fragment 3 Attach",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Fragment 3","Pause");
        Toast.makeText(getContext(),"Fragment 3 paused",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Fragment 3","DestroyView");
        Toast.makeText(getContext(),"Fragment 3 destroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("Fragment 3","Detached");
    }
}
