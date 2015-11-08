package start;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.romankieser.smartgridapplication.R;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import informations.Info_Tab_Info;
import main.MainActivity;

/**
 * Created by Roman Kieser on 08.11.2015.
 */
public class ChooseService extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_service);
        qrCodeClicked();
        manualClicked();
        changeFont();
    }

    public void changeFont()
    {
        TextView welcomingText = (TextView)findViewById(R.id.chooseService);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/COPRGTB.TTF");
        welcomingText.setTypeface(custom_font);
    }

    public void qrCodeClicked()
    {
        Button qrCode = (Button)findViewById(R.id.qr_button);
        qrCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scan();
            }
        });
    }

    public void scan()
    {
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.initiateScan();
    }

    public void manualClicked()
    {
        Button manButton = (Button)findViewById(R.id.manual_button);
        manButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChoice();
            }
        });
    }

    public void openChoice()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent)
    {
        IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
        if(scanResult != null)
        {
            String barcode;

            barcode = scanResult.getContents();
            
            Intent codeIntent = new Intent(this, Info_Tab_Info.class);
            codeIntent.putExtra("object", barcode);
            startActivity(codeIntent);

        }

    }
}
