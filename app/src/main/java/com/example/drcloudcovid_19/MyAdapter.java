package com.example.drcloudcovid_19;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class MyAdapter extends ExpandableRecyclerViewAdapter<MyJourneyViewHolder, MyJourneyProgressViewHolder> {

    public MyAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public MyJourneyViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View view = inflater.inflate(R.layout.parent_layout, parent, false);
            return new MyJourneyViewHolder(view);
    }

    @Override
    public MyJourneyProgressViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.children_layout, parent, false);
        return new MyJourneyProgressViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(MyJourneyProgressViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final JourneyProgress progress = ((MyJourney) group).getItems().get(childIndex);
        holder.setMyJourneyProgress(progress.getTitle());
    }

    @Override
    public void onBindGroupViewHolder(MyJourneyViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setMyJourney((MyJourney) group);

    }
}



