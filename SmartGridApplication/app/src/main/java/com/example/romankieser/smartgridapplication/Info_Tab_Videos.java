package com.example.romankieser.smartgridapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

/**
 * Created by Roman Kieser on 21.10.2015.
 */
public class Info_Tab_Videos extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lamp_video, container, false);
        playVideo(view);
        return view;
    }

    public void playVideo(View view)
    {
    }
}