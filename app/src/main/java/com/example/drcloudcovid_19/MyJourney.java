package com.example.drcloudcovid_19;

import android.os.Parcel;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class MyJourney extends ExpandableGroup<JourneyProgress> {

    private int iconResId;

    public MyJourney(String title, List<JourneyProgress> items, int iconResId) {

        super(title, items);
        this.iconResId = iconResId;
    }

    public int getIconResId() {
        return iconResId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JourneyProgress)) return false;

        MyJourney journey = (MyJourney) o;

        return getIconResId() == journey.getIconResId();

    }

    @Override
    public int hashCode() {
        return getIconResId();
    }

    protected MyJourney(Parcel in) {
        super(in);
    }
}
