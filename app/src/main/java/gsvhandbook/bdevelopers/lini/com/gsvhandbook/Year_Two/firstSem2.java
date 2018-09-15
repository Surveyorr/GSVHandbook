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
public class firstSem2 extends Fragment {

    WebView webView;

    public firstSem2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first_sem2, container, false);
        webView = view.findViewById(R.id.fs);
        webView.loadUrl("file:///android_asset/y2fs.htm");
        return view;
    }

}
