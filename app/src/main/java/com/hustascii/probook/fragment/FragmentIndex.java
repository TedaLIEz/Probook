package com.hustascii.probook.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hustascii.probook.R;

/**
 * Created by neokree on 24/11/14.
 */
public class FragmentIndex extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //TextView text = new TextView(this.getActivity());
        //text.setText("Section");
        //text.setGravity(Gravity.CENTER);
        //return text;
        View view = inflater.inflate(R.layout.activity_main, null, false);
        return view;
    }

}
