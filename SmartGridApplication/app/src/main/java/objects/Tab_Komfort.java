package objects;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import information.InformationActivityNew;
import informations.InformationActivity;
import com.example.romankieser.smartgridapplication.R;
import com.google.zxing.integration.android.IntentIntegrator;

import video.VideoPlayerActivity;

public class Tab_Komfort extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_komfort, container, false);
        lampActivity(v);
        return v;
    }

    public void lampActivity(View v)
    {
        Button lamp = (Button) v.findViewById(R.id.bLamp);
        lamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), InformationActivityNew.class);
                intent.putExtra("object", "lamp");
                startActivity(intent);
            }
        });
    }

}
