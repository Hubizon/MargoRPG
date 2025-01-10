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
import com.example.margorpg.Resources;
import com.example.margorpg.TinyDB;

import java.util.ArrayList;

import static com.example.margorpg.Resources.DefaultMoney;
import static com.example.margorpg.Resources.SavedMoney;
import static com.example.margorpg.Resources.elite2EnemyList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link EliteIIFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link EliteIIFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EliteIIFragment extends Fragment implements MyRecyclerViewEliteAdapter.ItemClickListener {

    private OnFragmentInteractionListener mListener;
    MyRecyclerViewEliteAdapter adapter;

    public EliteIIFragment() { }

    public static EliteIIFragment newInstance() {
        return new EliteIIFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onItemClick(View view, final int position) {
        if(elite2EnemyList.length > position)
        {
            TinyDB tinyDB = new TinyDB(getContext());
            if(tinyDB.getInt(SavedMoney, DefaultMoney) >= elite2EnemyList[position][0].getLvl() * 80)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setMessage("Do you want to spend " + elite2EnemyList[position][0].getLvl() * 80 + " to start this battle?");
                builder.setCancelable(true);

                builder.setPositiveButton(
                        "Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                TinyDB tinyDB = new TinyDB(getContext());
                                tinyDB.putInt(SavedMoney, tinyDB.getInt(SavedMoney, DefaultMoney) - elite2EnemyList[position][0].getLvl() * 80);

                                Intent intent = new Intent(getContext(), FightActivity.class);
                                intent.putExtra("type", "elite2");
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
                Toast.makeText(getContext(), "Unfortunately, you don't have enough money to start this battle (" + elite2EnemyList[position][0].getLvl() * 80 + ")", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_elite_ii, container, false);

        ArrayList<String> eliteNames = new ArrayList<>();
        eliteNames.add("Mushita");
        eliteNames.add("Shae Phu");
        eliteNames.add("Władca Rzek");
        eliteNames.add("Gobbos");
        eliteNames.add("Razuglag Oklash");
        eliteNames.add("Szczęt Alias Gładki");
        eliteNames.add("Tarmus Wuden");
        eliteNames.add("Foverk Turrim");
        eliteNames.add("Tyrtajos");
        eliteNames.add("Vari Kruger");
        eliteNames.add("Furruk Kozug");
        eliteNames.add("Tollok Atamatu");
        eliteNames.add("Goplana");
        eliteNames.add("Choukker");

        ArrayList<String> eliteLvls = new ArrayList<>();
        eliteLvls.add("Level: 23");
        eliteLvls.add("Level: 30");
        eliteLvls.add("Level: 37");
        eliteLvls.add("Level: 40");
        eliteLvls.add("Level: 47");
        eliteLvls.add("Level: 47");
        eliteLvls.add("Level: 50");
        eliteLvls.add("Level: 57");
        eliteLvls.add("Level: 58");
        eliteLvls.add("Level: 65");
        eliteLvls.add("Level: 66");
        eliteLvls.add("Level: 73");
        eliteLvls.add("Level: 75");
        eliteLvls.add("Level: 80");

        ArrayList<Integer> eliteEnvis = new ArrayList<>();
        eliteEnvis.add(R.drawable.envi1);
        eliteEnvis.add(R.drawable.envi9);
        eliteEnvis.add(R.drawable.envi5);
        eliteEnvis.add(R.drawable.envi8);
        eliteEnvis.add(R.drawable.envi2);
        eliteEnvis.add(R.drawable.envi6);
        eliteEnvis.add(R.drawable.envi7);
        eliteEnvis.add(R.drawable.envi8);
        eliteEnvis.add(R.drawable.envi6);
        eliteEnvis.add(R.drawable.envi14);
        eliteEnvis.add(R.drawable.envi4);
        eliteEnvis.add(R.drawable.envi10);
        eliteEnvis.add(R.drawable.envi1);
        eliteEnvis.add(R.drawable.envi6);

        ArrayList<Drawable> eliteImages = new ArrayList<>();
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_mu));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_shph));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_wlrz));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_go));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_raok));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_szalgl));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_tawu));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_fotu));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_ty));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_vakr));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_fuko));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_toat));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_go2));
        eliteImages.add(getContext().getResources().getDrawable(R.drawable.enemy_ch));

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewEliteIi);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(mLayoutManager);
        adapter = new MyRecyclerViewEliteAdapter(getActivity(), eliteNames , eliteLvls, eliteEnvis, eliteImages);
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
