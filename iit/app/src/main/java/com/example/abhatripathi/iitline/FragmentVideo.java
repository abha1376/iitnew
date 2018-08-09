package com.example.abhatripathi.iitline;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import static android.content.ContentValues.TAG;

public class FragmentVideo extends Fragment {
    RecyclerView recyclerView;
    List<itemVideo> youtubevideos;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_video,container,false);
        RecyclerView recyclerView = v.findViewById(R.id.rvVideo);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        Bundle bundle = getActivity().getIntent().getExtras();
        if(bundle!=null) {
            Log.e(TAG, "onCreateView:bundle is not null " );
            youtubevideos =  bundle.getParcelableArrayList("video");
            videoAdapter videoAdapter = new videoAdapter(youtubevideos);
            recyclerView.setAdapter(videoAdapter);

        }

        return v;
    }
}
