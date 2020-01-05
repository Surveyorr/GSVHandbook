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
    CardView ison;
    CardView ma;
    CardView okwa;
    CardView ekwere;
    CardView ono;
    CardView ochi;
    CardView nde;
    CardView eyoefen;
    CardView ibu;
    CardView ikpene;
    CardView inem;
    CardView etuk;
    CardView ubom;
    CardView wog;
    CardView raph;

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
        hod = view.findViewById(R.id.eyoh);
        ekpa = view.findViewById(R.id.ekpa);
        ma = view.findViewById(R.id.ma);
        okwa = view.findViewById(R.id.onuwa);
        ekwere = view.findViewById(R.id.ekwere);
        ono = view.findViewById(R.id.ono);
        inem = view.findViewById(R.id.inem);
        ibu = view.findViewById(R.id.ibu);
        ubom = view.findViewById(R.id.ubom);
        etuk = view.findViewById(R.id.etu);
        wog = view.findViewById(R.id.wog);
        ikpene = view.findViewById(R.id.ikp);
        eyoefen = view.findViewById(R.id.eyoe);
        ochi = view.findViewById(R.id.ochi);
        nde = view.findViewById(R.id.nde);
        raph = view.findViewById(R.id.raph);
        ison = view.findViewById(R.id.ison);

        hod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = "Lecturer I/Head of Department (HOD)";
                message = getString(R.string.anie);
                showInfo(getContext(), title, message);
            }
        });

        ekpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                title = "Lecturer I/SIWES Coordinator";
                message = getString(R.string.ekp);
                showInfo(getContext(), title, message);
            }
        });
        ison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = "Senior Lecturer";
                message = getString(R.string.iso);
                showInfo(getContext(), title, message);
            }
        });
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = "Graduate Assistant";
                message = getString(R.string.mu);
                showInfo(getContext(), title, message);
            }
        });
        okwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = " ";
                message = " ";
                showInfo(getContext(), title, message);
            }
        });
        ekwere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = " ";
                message = " ";
                showInfo(getContext(), title, message);
            }
        });
        inem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = " ";
                message = " ";
                showInfo(getContext(), title, message);
            }
        });
        ono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = " ";
                message = " ";
                showInfo(getContext(), title, message);
            }
        });
        ochi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = " ";
                message = " ";
                showInfo(getContext(), title, message);
            }
        });
        ibu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = " ";
                message = " ";
                showInfo(getContext(), title, message);
            }
        });
        ubom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = " ";
                message = " ";
                showInfo(getContext(), title, message);
            }
        });
        etuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = " ";
                message = " ";
                showInfo(getContext(), title, message);
            }
        });
        eyoefen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = " ";
                message = " ";
                showInfo(getContext(), title, message);
            }
        });
        nde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = " ";
                message = " ";
                showInfo(getContext(), title, message);
            }
        });
        ono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = " ";
                message = " ";
                showInfo(getContext(), title, message);
            }
        });
        raph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = " ";
                message = " ";
                showInfo(getContext(), title, message);
            }
        });
        wog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = " ";
                message = " ";
                showInfo(getContext(), title, message);
            }
        });

        return view;
    }
}
