package gsvhandbook.bdevelopers.lini.com.gsvhandbook;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import gsvhandbook.bdevelopers.lini.com.gsvhandbook.Year_Five.YearFive;
import gsvhandbook.bdevelopers.lini.com.gsvhandbook.Year_Four.YearFour;
import gsvhandbook.bdevelopers.lini.com.gsvhandbook.Year_One.YearOne;
import gsvhandbook.bdevelopers.lini.com.gsvhandbook.Year_Three.YearThree;
import gsvhandbook.bdevelopers.lini.com.gsvhandbook.Year_Two.YearTwo;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public CardView y1;
    public CardView y2;
    public CardView y3;
    public CardView y4;
    public CardView y5;
    public Button suggest;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_activity, container, false);
        y1 = view.findViewById(R.id.y1);
        y2 = view.findViewById(R.id.y2);
        y3 = view.findViewById(R.id.y3);
        y4 = view.findViewById(R.id.y4);
        y5 = view.findViewById(R.id.y5);
        suggest = view.findViewById(R.id.sug);


        //y1.setClickable(true);
        // y1.setFocusable(true);

        y1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ye1 = new Intent(getActivity(), YearOne.class);
                startActivity(ye1);
            }
        });
        y2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ye2 = new Intent(getActivity(), YearTwo.class);
                startActivity(ye2);

            }
        });
        y3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ye3 = new Intent(getActivity(), YearThree.class);
                startActivity(ye3);
            }
        });
        y4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ye4 = new Intent(getActivity(), YearFour.class);
                startActivity(ye4);
            }
        });
        y5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ye5 = new Intent(getActivity(), YearFive.class);
                startActivity(ye5);
            }
        });
        suggest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendMail = new Intent("android.intent.action.SEND");
                sendMail.setType("text/Email");
                sendMail.putExtra("Subject", 4);
                sendMail.putExtra("android.intent.extra.EMAIL", new String[]{"bdevelopersteam@gmail.com"});
                startActivity(sendMail);

            }
        });

        return view;
    }

}
