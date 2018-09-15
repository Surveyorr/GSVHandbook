package gsvhandbook.bdevelopers.lini.com.gsvhandbook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResultFragment extends Fragment {
    WebView result;
    String url;

    Fragment fragment;

    public ResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container, false);

        result = view.findViewById(R.id.res);

        // if (CheckInternet(getApplicationContext())) {
        url = "http://results.uniuyo.edu.ng/checkresult/s_result.php";
        result.loadUrl(url);
        //result.getSettings().setJavaScriptEnabled(true);
        // }

        return view;
    }


}

