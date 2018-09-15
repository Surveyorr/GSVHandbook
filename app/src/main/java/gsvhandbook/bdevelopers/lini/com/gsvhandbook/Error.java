package gsvhandbook.bdevelopers.lini.com.gsvhandbook;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import static gsvhandbook.bdevelopers.lini.com.gsvhandbook.ResultActivity.CheckInternet;

/**
 * A simple {@link Fragment} subclass.
 */
public class Error extends Fragment {

    Button retry;
    Fragment fragment;

    public Error() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.no_connect, container, false);
        retry = view.findViewById(R.id.retry);
        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CheckInternet(getActivity())) {
                    fragment = new ResultFragment();
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.frame, fragment).commit();
                } else
                    Toast.makeText(getActivity(), "You are still not connected", Toast.LENGTH_LONG)
                            .show();
            }
        });
        return view;
    }

}
