package com.example.whereigo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import net.daum.mf.map.api.MapView;

public class FragmentSearch extends Fragment {
    MapView mapView;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_search, container, false);


            //map api 화면 띄우기 코드
            mapView=new MapView(getActivity());
            ViewGroup mapViewContainer=rootView.findViewById(R.id.map_view);
            mapViewContainer.addView(mapView);

            return rootView;
        }
    }