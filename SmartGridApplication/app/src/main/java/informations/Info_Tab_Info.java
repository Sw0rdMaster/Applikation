package informations;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.romankieser.smartgridapplication.R;

/**
 * Created by Roman Kieser on 21.10.2015.
 */
public class Info_Tab_Info extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.information_fragment_info, container, false);
        //
        TextView txt = (TextView)view.findViewById(R.id.info_text);
        txt.setText(R.string.lorem_ipsum);
        //
        return view;

    }
}