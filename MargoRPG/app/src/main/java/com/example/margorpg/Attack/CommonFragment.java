package com.example.margorpg.Attack;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.margorpg.R;

import java.util.ArrayList;

import static com.example.margorpg.Resources.commonEnemyLists;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CommonFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CommonFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CommonFragment extends Fragment implements MyRecyclerViewAdapter.ItemClickListener {

    private OnFragmentInteractionListener mListener;

    public CommonFragment() { }

    public static CommonFragment newInstance() {
        return new CommonFragment();
    }

    MyRecyclerViewAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    public void onItemClick(View view, int position) {
        if (commonEnemyLists.length > position) {
            Intent intent = new Intent(getContext(), FightActivity.class);
            intent.putExtra("type", "common");
            intent.putExtra("position", position);
            intent.putExtra("envi", adapter.getItem(position));
            startActivity(intent);
        }

        //Toast.makeText(getActivity(), "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_common, container, false);
         View view = inflater.inflate(R.layout.fragment_common, container, false);

//        ArrayList<String> eliteNames = new ArrayList<>();
//        eliteNames.add("Forest Thicket [1-5]");
//        eliteNames.add("The Lost Backyard [6-10]");
//        eliteNames.add("Crossroads [11-15]");
//        eliteNames.add("Deep Creep [16-20]");
//        eliteNames.add("Virgin Thick Forest [21-25]");
//        eliteNames.add("Zulu Settlement [26-30]");
//        eliteNames.add("Robbers' Headquarters [31-35]");
//        eliteNames.add("Ghoul Village [36-40]");

        ArrayList<String> environmentNames = new ArrayList<>();
        environmentNames.add("Forest Thicket [1-5]");
        environmentNames.add("The Lost Backyard [6-10]");
        environmentNames.add("Crossroads [11-15]");
        environmentNames.add("Deep Creep [16-20]");
        environmentNames.add("Virgin Thick Forest [21-25]");
        environmentNames.add("Zulu Settlement [26-30]");
        environmentNames.add("Goblins' Campus [31-35]");
        environmentNames.add("Ghoul Village [36-40]");

        ArrayList<Integer> environmentImages = new ArrayList<>();
        environmentImages.add(R.drawable.envi1);
        environmentImages.add(R.drawable.envi2);
        environmentImages.add(R.drawable.envi3);
        environmentImages.add(R.drawable.envi4);
        environmentImages.add(R.drawable.envi2);
        environmentImages.add(R.drawable.envi5);
        environmentImages.add(R.drawable.envi6);
        environmentImages.add(R.drawable.envi7);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new MyRecyclerViewAdapter(getActivity(), environmentNames, environmentImages);
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

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
