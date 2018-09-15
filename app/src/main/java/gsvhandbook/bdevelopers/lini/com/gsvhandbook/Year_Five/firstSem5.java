package gsvhandbook.bdevelopers.lini.com.gsvhandbook.Year_Five;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import gsvhandbook.bdevelopers.lini.com.gsvhandbook.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class firstSem5 extends Fragment {


    public firstSem5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first_sem5, container, false);
        WebView webView = view.findViewById(R.id.fs);
        webView.loadUrl("file:///android_asset/y5fs.htm");
        return view;
    }

}
