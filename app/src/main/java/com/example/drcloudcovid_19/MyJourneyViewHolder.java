package com.example.drcloudcovid_19;

import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import static android.view.animation.Animation.RELATIVE_TO_SELF;

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

    public void setMyJourney(ExpandableGroup journey) {

        if (journey instanceof MyJourney) {
            myJourney.setText(journey.getTitle());
            icon_done.setBackgroundResource(journey.hashCode());
        }
    }
        @Override
        public void expand () {
            animateExpand();
        }

        @Override
        public void collapse () {
            animateCollapse();
        }

    private void animateExpand() {
        RotateAnimation rotate =
                new RotateAnimation(360, 180, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        dropdown.setAnimation(rotate);
    }

    private void animateCollapse() {
        RotateAnimation rotate =
                new RotateAnimation(180, 360, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        dropdown.setAnimation(rotate);
    }
}

