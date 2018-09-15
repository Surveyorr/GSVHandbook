package gsvhandbook.bdevelopers.lini.com.gsvhandbook.Year_Two;


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
public class seconSem2 extends Fragment {

    public WebView webView;

    public seconSem2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_secon_sem2, container, false);
        webView = view.findViewById(R.id.ss);
        webView.loadUrl("file:///android_asset/y2ss.htm");
        return view;
    }

}
