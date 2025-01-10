package com.example.margorpg.Attack;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.margorpg.R;
import com.example.margorpg.TinyDB;

import java.util.ArrayList;

import static com.example.margorpg.Resources.DefaultMoney;
import static com.example.margorpg.Resources.SavedMoney;
import static com.example.margorpg.Resources.elite2EnemyList;
import static com.example.margorpg.Resources.tytanEnemyList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TytansFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TytansFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TytansFragment extends Fragment implements MyRecyclerViewEliteAdapter.ItemClickListener {

    private OnFragmentInteractionListener mListener;
    MyRecyclerViewEliteAdapter adapter;

    public TytansFragment() { }

    public static TytansFragment newInstance() {
        return new TytansFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onItemClick(View view, final int position) {
        if(tytanEnemyList.length > position)
        {
            TinyDB tinyDB = new TinyDB(getContext());
            if(tinyDB.getInt(SavedMoney, DefaultMoney) >= tytanEnemyList[position][0].getLvl() * 750)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setMessage("Do you want to spend " + tytanEnemyList[position][0].getLvl() * 750 + " to start this battle?");
                builder.setCancelable(true);

                builder.setPositiveButton(
                        "Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                TinyDB tinyDB = new TinyDB(getContext());
                                tinyDB.putInt(SavedMoney, tinyDB.getInt(SavedMoney, DefaultMoney) - tytanEnemyList[position][0].getLvl() * 750);

                                Intent intent = new Intent(getContext(), FightActivity.class);
                                intent.putExtra("type", "tytan");
                                intent.putExtra("position", position);
                                intent.putExtra("envi", adapter.getItem(position));
                                startActivity(intent);

                                dialog.cancel();
                            }
                        });

                builder.setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
            else
                Toast.makeText(getContext(), "Unfortunately, you don't have enough money to start this battle (" + tytanEnemyList[position][0].getLvl() * 750 + ")", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tytans, container, false);

        ArrayList<String> eliteNames = new ArrayList<>();
        eliteNames.add("Ame-onna");
        eliteNames.add("Mamlambo");
        eliteNames.add("Kong Ka");
        eliteNames.add("Dziewicza Orlica");
        eliteNames.add("Iluignegil");
        eliteNames.add("Regulus Mętnooki");
        eliteNames.add("Zabójczy królik");
        eliteNames.add("Nure-Onna");
        eliteNames.add("Vuuron");
        eliteNames.add("Umibozu");

        ArrayList<String> eliteLvls = new ArrayList<>();
        eliteLvls.add("Level: 30");
        eliteLvls.add("Level: 36");
        eliteLvls.add("Level: 40");
        eliteLvls.add("Level: 51");
        eliteLvls.add("Level: 60");
        eliteLvls.add("Level: 63");
        eliteLvls.add("Level: 70");
        eliteLvls.add("Level: 70");
        eliteLvls.add("Level: 80");
        eliteLvls.add("Level: 90");

        ArrayList<Integer> eliteEnvis = new ArrayList<>();
        eliteEnvis.add(R.drawable.envi16);
        eliteEnvis.add(R.drawable.envi12);
        eliteEnvis.add(R.drawable.envi13);
        eliteEnvis.add(R.drawable.envi14);
        eliteEnvis.add(R.drawable.envi1);
        eliteEnvis.add(R.drawable.envi6);
        eliteEnvis.add(R.drawable.envi2);
        eliteEnvis.add(R.drawable.envi15);
        eliteEnvis.add(R.drawable.envi9);
        eliteEnvis.add(R.drawable.envi4);

        ArrayList<Drawable> eliteImages = new ArrayList<>();
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_amon));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_ma));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_koka));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_dzor));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_il));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_reme));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_zakr));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_nuon));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_vu2));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_um));

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewTytan);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(mLayoutManager);
        adapter = new MyRecyclerViewEliteAdapter(getActivity(), eliteNames, eliteLvls, eliteEnvis, eliteImages);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
