package gsvhandbook.bdevelopers.lini.com.gsvhandbook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class About extends Fragment {

    CardView card1;

    public About() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_about, container, false);
        //card1 = view.findViewById(R.id.retry);
        return view;
    }

}
