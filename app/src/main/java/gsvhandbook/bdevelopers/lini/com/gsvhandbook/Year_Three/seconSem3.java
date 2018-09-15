package gsvhandbook.bdevelopers.lini.com.gsvhandbook.Year_Three;


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
public class seconSem3 extends Fragment {


    public seconSem3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second_sem3, container, false);
        WebView webView = view.findViewById(R.id.ss);
        webView.loadUrl("file:///android_asset/y3ss.htm");
        return view;
    }

}
