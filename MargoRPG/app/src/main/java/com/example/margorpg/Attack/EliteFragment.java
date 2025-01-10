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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.margorpg.R;
import com.example.margorpg.TinyDB;

import java.util.ArrayList;

import static com.example.margorpg.Resources.DefaultMagicRes;
import static com.example.margorpg.Resources.DefaultMoney;
import static com.example.margorpg.Resources.SavedMoney;
import static com.example.margorpg.Resources.elite2EnemyList;
import static com.example.margorpg.Resources.eliteEnemyList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link EliteFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link EliteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EliteFragment extends Fragment implements MyRecyclerViewEliteAdapter.ItemClickListener {

    private OnFragmentInteractionListener mListener;

    public EliteFragment() { }

    public static EliteFragment newInstance() {
        return new EliteFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onItemClick(View view, int position) {
        if(eliteEnemyList.length > position){
            TinyDB tinyDB = new TinyDB(getContext());
            if(tinyDB.getInt(SavedMoney, DefaultMoney) >= eliteEnemyList[position][0].getLvl() * 25)
            {
                tinyDB.putInt(SavedMoney, tinyDB.getInt(SavedMoney, DefaultMoney) - eliteEnemyList[position][0].getLvl() * 25);
                Intent intent = new Intent(getContext(), FightActivity.class);
                intent.putExtra("type", "elite");
                intent.putExtra("position", position);
                intent.putExtra("envi", adapter.getItem(position));
                startActivity(intent);
            } else
                Toast.makeText(getContext(), "Unfortunately, you don't have enough money to start this battle (" + eliteEnemyList[position][0].getLvl() * 25 + ")", Toast.LENGTH_SHORT).show();
        }
    }

    MyRecyclerViewEliteAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_elite, container, false);

        ArrayList<String> eliteNames = new ArrayList<>();
        eliteNames.add("Czarna Wilczyca");
        eliteNames.add("Vulk");
        eliteNames.add("Karhu");
        eliteNames.add("Mrówcza Królowa");
        //eliteNames.add("Astratus");
        //eliteNames.add("Kotołak Tropiciel");
        eliteNames.add("Paladyński Apostata");
        eliteNames.add("Cerber");

        ArrayList<String> eliteLvls = new ArrayList<>();
        eliteLvls.add("Level: 17");
        eliteLvls.add("Level: 20");
        eliteLvls.add("Level: 20");
        eliteLvls.add("Level: 21");
        //eliteLvls.add("Level: 22");
        //eliteLvls.add("Level: 23");
        eliteLvls.add("Level: 23");
        eliteLvls.add("Level: 28");

        ArrayList<Integer> eliteEnvis = new ArrayList<>();
        eliteEnvis.add(R.drawable.envi1);
        eliteEnvis.add(R.drawable.envi4);
        eliteEnvis.add(R.drawable.envi7);
        eliteEnvis.add(R.drawable.envi6);
        //eliteEnvis.add(R.drawable.envi8);
        //eliteEnvis.add(R.drawable.envi2);
        eliteEnvis.add(R.drawable.envi8);
        eliteEnvis.add(R.drawable.envi9);

        ArrayList<Drawable> eliteImages = new ArrayList<>();
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_czwi));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_vu));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_ka));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_mrkr));
        //eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_as));
        //eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_kotr));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_paap));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_ce));

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewElite);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(mLayoutManager);
        adapter = new MyRecyclerViewEliteAdapter(getActivity(), eliteNames, eliteLvls, eliteEnvis, eliteImages);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        return view;
    }

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

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
