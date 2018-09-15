package gsvhandbook.bdevelopers.lini.com.gsvhandbook;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class LecturersFragment extends Fragment {


    public String title;
    public String message;
    public View view;
    CardView hod;
    CardView ekpa;

    public LecturersFragment() {
        // Required empty public constructor
    }

    public static void showInfo(Context context, String title, String message) {
        AlertDialog.Builder details = new AlertDialog.Builder(context);
        details.setTitle(title);
        details.setMessage(message);
        details.show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_lecturers, container, false);
        hod = view.findViewById(R.id.hod);
        ekpa = view.findViewById(R.id.ekpa);

        hod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = "Head of Department (HOD)";
                message = "He Handles the following courses\n Remote Sensing I and II \n Survey Laws \n Okay";
                showInfo(getContext(), title, message);
            }
        });

        ekpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                title = "SIWES Coordinator";
                message = "<b>He Handles the following courses</b>\nHydrography";
                showInfo(getContext(), title, message);
            }
        });
        return view;
    }
}
