package com.example.drcloudcovid_19;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class MyJourneyProgressViewHolder extends ChildViewHolder {
    TextView progress;
    CheckBox isSelected;
public MyJourneyProgressViewHolder(View itemView) {
    super(itemView);
    progress = itemView.findViewById(R.id.progress);
    isSelected = itemView.findViewById(R.id.checkbox);
    }

    public void setMyJourneyProgress (String journeyProgress){

        progress.setText(journeyProgress);
    }
}
