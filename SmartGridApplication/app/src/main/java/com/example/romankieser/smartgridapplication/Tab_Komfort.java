package com.example.romankieser.smartgridapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Tab_Komfort extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.komfort_fragment, container, false);
        lampActivity(v);
        vidActivity(v);
        return v;
    }

    public void lampActivity(View v)
    {
        Button lamp = (Button) v.findViewById(R.id.bLamp);
        lamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LampActivity.class);
                intent.putExtra("lamp", true);
                startActivity(intent);
            }
        });
    }

    public void vidActivity(View v)
    {
        Button vid = (Button) v.findViewById(R.id.vidButton);
        vid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), VideoPlayerActivity.class);

                i.putExtra("url", "link");
                startActivity(i);
            }
        });
    }
}
