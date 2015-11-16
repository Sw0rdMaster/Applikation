package start;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.romankieser.smartgridapplication.R;

/**
 * Created by Roman Kieser on 07.11.2015.
 */
public class WelcomeScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        changeFont();
        buttonClicked();
    }

    public void changeFont()
    {
        TextView welcomingText = (TextView)findViewById(R.id.welcomeView);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/BLESSED.ttf");
        welcomingText.setTypeface(custom_font);
    }

    public void buttonClicked()
    {
        Button wButton = (Button)findViewById(R.id.wButton);
        wButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ChooseService.class);
                startActivity(intent);
            }
        });

        //wButton.setVisibility(View.INVISIBLE);
    }
}
