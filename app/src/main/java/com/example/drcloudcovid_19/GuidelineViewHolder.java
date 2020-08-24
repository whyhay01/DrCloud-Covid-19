package com.example.drcloudcovid_19;

import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import static android.view.animation.Animation.RELATIVE_TO_SELF;

public class GuidelineViewHolder extends GroupViewHolder {
    TextView tv_guideline;
    ImageButton dropIcon;

    public GuidelineViewHolder(View itemView) {
        super(itemView);

        tv_guideline = itemView.findViewById(R.id.txt_guideline);
        dropIcon = itemView.findViewById(R.id.img_dropdown);
    }

    public void setGuidelineTitle(ExpandableGroup guidelineTitle){
        if (guidelineTitle instanceof Guideline) {
            tv_guideline.setText(guidelineTitle.getTitle());
//            dropIcon.setBackgroundResource(((Guideline) guidelineTitle).getDropdown());
        }
    }


    @Override
    public void expand() {
        animateExpand();
    }

    @Override
    public void collapse() {
        animateCollapse();
    }

    private void animateExpand() {
        RotateAnimation rotate =
                new RotateAnimation(360, 180, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        dropIcon.setAnimation(rotate);
    }

    private void animateCollapse() {
        RotateAnimation rotate =
                new RotateAnimation(180, 360, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        dropIcon.setAnimation(rotate);
    }
}
