package com.example.drcloudcovid_19;

import android.os.Parcel;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class Guideline extends ExpandableGroup<Articles> {
    private int dropdown;

    public Guideline(String title, List<Articles> items, int dropdown) {
        super(title, items);
        this.dropdown = dropdown;
    }

    public Guideline(String title, List<Articles> items){
        super(title, items);

    }

    public int getDropdown() {
        return dropdown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guideline)) return false;

        Guideline guideline = (Guideline) o;

        return getDropdown() == guideline.getDropdown();

    }

    @Override
    public int hashCode() {
        return getDropdown();
    }

    protected Guideline(Parcel in) {
        super(in);
    }
}
