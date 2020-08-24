package com.example.drcloudcovid_19;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import java.util.List;

public class GuidelineAdapter extends ExpandableRecyclerViewAdapter <GuidelineViewHolder,ArticlesViewHolder>{

    public GuidelineAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public GuidelineViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.guideline_layout,parent,false);
        return new GuidelineViewHolder(view);
    }

    @Override
    public ArticlesViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.article_layout, parent,false);
        return new ArticlesViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(ArticlesViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {

        final Articles articles = ((Guideline) group).getItems().get(childIndex);

//        Log.d("Children", "Child index => "+ childIndex);

        holder.setArticlesTitle(articles.getName());
    }

    @Override
    public void onBindGroupViewHolder(GuidelineViewHolder holder, int flatPosition,
                                      ExpandableGroup group) {

        holder.setGuidelineTitle(group);

    }
}
