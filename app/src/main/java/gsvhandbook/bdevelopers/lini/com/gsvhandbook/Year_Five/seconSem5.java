package gsvhandbook.bdevelopers.lini.com.gsvhandbook.Year_Five;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import gsvhandbook.bdevelopers.lini.com.gsvhandbook.R;


public class seconSem5 extends Fragment {


    public seconSem5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_secon_sem5, container, false);
        WebView webView = view.findViewById(R.id.ss);
        webView.loadUrl("file:///android_asset/y5ss.htm");
        return view;
    }

}
