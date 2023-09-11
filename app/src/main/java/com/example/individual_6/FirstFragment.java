package com.example.individual_6;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.individual_6.databinding.FragmentFirstBinding;

import java.util.ArrayList;



public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;

    ArrayList<Image> listImage = new ArrayList<>() ;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private final Adapter adapter=new Adapter();
    private RecyclerView.Adapter<RecyclerView.ViewHolder> infoAdapter;

    public FirstFragment() {
        // Required empty public constructor
    }

    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(getActivity().getLayoutInflater(), container, false);
        initAdapter();
        return binding.getRoot();
    }

    public void initAdapter() {
        adapter.setData(addData());
        binding.recyclerView.setAdapter(adapter);

    }

    public ArrayList<Image>addData() {

        Image image01 = new Image("ZhuoChengyou","https://unsplash.com/photos/UBvtBr_FmrY/download?force=true&w=640");
        listImage.add(image01);
        Image image02 = new Image("billow926","https://unsplash.com/photos/pNoP-qVwBFQ/download?force=true&w=640");
        listImage.add(image02);
        Image image03 = new Image("PhilippDeiß","https://unsplash.com/photos/LfJx0gqqiEc/download?force=true&w=640");
        listImage.add(image03);
        Image image05 = new Image("MelnychukNataliya", "https://unsplash.com/photos/rnPGCe7LsQo/download?force=true&w=640");
        listImage.add(image05);
        Image image06 = new Image("Teagan Maddux", "https://unsplash.com/photos/k2DbTXQ0yrQ/download?force=true&w=640");
        listImage.add(image06);
        Image image07 = new Image("Chen Liu", "https://unsplash.com/photos/kZH8X0q4Nvo/download?force=true&w=640");
        listImage.add(image07);
        Image image08 = new Image("John Fornander", "https://unsplash.com/photos/iNqJx-VOceI/download?force=true&w=640");
        listImage.add(image08);
        Image image09 = new Image("Parker Coffman", "https://unsplash.com/photos/mNWrQ9O6KZw/download?force=true&w=640");
        listImage.add(image09);
        Image image10 = new Image("XPS","https://unsplash.com/photos/8pb7Hq539Zw/download?force=true&w=640");
        listImage.add(image10);
        Image image11 = new Image("Daniel J. Schwarz", "https://unsplash.com/photos/l8BvDmt8Ac4/download?force=true&w=640");
        listImage.add(image11);

        return listImage;
    }

}