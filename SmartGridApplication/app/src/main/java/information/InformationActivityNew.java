package information;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.romankieser.smartgridapplication.R;

import video.VideoPlayerActivity;

/**
 * Created by Roman on 02.12.2015.
 */
public class InformationActivityNew extends Activity {

    String videoLink1;
    String videoLink2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_window);

        String key = getIntent().getExtras().getString("object");
        setInformations(key);
        instateVideoIntent1();
    }

    private void setInformations(String object)
    {
        TextView textField = (TextView)findViewById(R.id.infoText);
        TextView link1 = (TextView)findViewById(R.id.link1);
        TextView link2 = (TextView)findViewById(R.id.link2);
        switch(object)
        {
            case "lamp":
                textField.setText("Hallo, du hast die Lampe gewählt");
                break;

            case "watercolumn":
                textField.setText("Hallo, du hast die Wassersäule gewählt");
                videoLink1 = "mnt/sdcard/movies/Film_Wassersäule.mp4";
                link1.setText("wwww.wassercolumn.ch");
        }
    }

    private void instateVideoIntent1()
    {
        Button video1 = (Button)findViewById(R.id.vid1);
        video1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vidIntent = new Intent(v.getContext(), VideoPlayerActivity.class);
                vidIntent.putExtra("url", videoLink1);
                startActivity(vidIntent);
            }
        });




    }
}
