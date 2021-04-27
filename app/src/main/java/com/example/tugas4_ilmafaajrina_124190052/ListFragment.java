package com.example.tugas4_ilmafaajrina_124190052;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<PlayerModel> listItem = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.rvlist);
        recyclerView.setHasFixedSize(true);
        listItem.addAll(PlayerData.getListDataModel());

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        PlayerAdapter playerAdapter = new PlayerAdapter(PlayerData.getListDataModel(), getActivity());
        recyclerView.setAdapter(playerAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }
}