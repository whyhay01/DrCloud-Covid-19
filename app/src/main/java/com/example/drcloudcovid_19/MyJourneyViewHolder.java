package com.example.drcloudcovid_19;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class MyJourneyViewHolder extends GroupViewHolder {
    ImageView icon_done;
    TextView myJourney;
    ImageButton dropdown;
    public MyJourneyViewHolder(View itemView) {
        super(itemView);
        icon_done = itemView.findViewById(R.id.icon_done);
        myJourney = itemView.findViewById(R.id.my_journey);
        dropdown = itemView.findViewById(R.id.drop_down);
    }

    public void setMyJourney(ExpandableGroup group){
        myJourney.setText(group.getTitle());
    }
}

