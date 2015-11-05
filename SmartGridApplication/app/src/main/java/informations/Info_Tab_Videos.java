package informations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.romankieser.smartgridapplication.R;

import video.VideoPlayerActivity;

/**
 * Created by Roman Kieser on 21.10.2015.
 */
public class Info_Tab_Videos extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.information_fragment_video, container, false);
        vidActivity(view);
        return view;
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