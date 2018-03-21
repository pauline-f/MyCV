package com.example.pauline.mycv.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pauline.mycv.FileHelper;
import com.example.pauline.mycv.R;
import com.example.pauline.mycv.model.CV;
import com.example.pauline.mycv.model.Objective;
import com.google.gson.Gson;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link ObjectiveFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ObjectiveFragment extends Fragment {
    public static final String FRAGMENT_TAG = "objective";


    public ObjectiveFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment ObjectiveFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ObjectiveFragment newInstance() {
        ObjectiveFragment fragment = new ObjectiveFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String json = FileHelper.readFile("data.json", getContext());
        Objective objective = parseWithGson(json);
        TextView objectiveTextView = view.findViewById(R.id.objective);
        objectiveTextView.setText(objective.getObjective());
    }

    protected Objective parseWithGson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, CV.class).getObjective();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_objective, container, false);
    }



}
