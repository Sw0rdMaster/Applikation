package objects;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import informations.InformationActivity;
import com.example.romankieser.smartgridapplication.R;
import video.VideoPlayerActivity;

public class Tab_Komfort extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_komfort, container, false);
        lampActivity(v);
        //setImage(v);
        return v;
    }

    public void lampActivity(View v)
    {
        Button lamp = (Button) v.findViewById(R.id.bLamp);
        lamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), InformationActivity.class);
                intent.putExtra("lamp", true);
                startActivity(intent);
            }
        });
    }

    public void setImage(View v)
    {
        ImageButton img = (ImageButton) v.findViewById(R.id.imgButton2);
        img.setImageResource(R.mipmap.questionmark);
    }
}
