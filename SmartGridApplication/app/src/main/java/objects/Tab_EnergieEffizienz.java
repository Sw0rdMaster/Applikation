package objects;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.romankieser.smartgridapplication.R;

import information.InformationActivityNew;

public class Tab_EnergieEffizienz extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_energieeffizienz, container, false);
        waterColumnActivity(v);
        return v;
    }

    public void waterColumnActivity(View v)
    {
        Button lamp = (Button) v.findViewById(R.id.bWassersäule);
        lamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), InformationActivityNew.class);
                intent.putExtra("object", "watercolumn");
                startActivity(intent);
            }
        });
    }
}