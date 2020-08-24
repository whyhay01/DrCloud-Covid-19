package com.example.drcloudcovid_19;

import android.os.Parcel;
import android.os.Parcelable;

public class Articles implements Parcelable {
    private String name;
    private boolean isDropdown;

    public Articles(String name, boolean isDropdown) {
        this.name = name;
        this.isDropdown = isDropdown;
    }

    protected Articles(Parcel in) {
        name = in.readString();
    }

    public String getName() {
        return name;
    }

    public boolean isDropdown() {
        return isDropdown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Articles)) return false;

        Articles articles = (Articles) o;

        if (isDropdown() != articles.isDropdown()) return false;
        return getName() != null ? getName().equals(articles.getName()) : articles.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (isDropdown() ? 1 : 0);
        return result;
    }


    public static final Creator<Articles> CREATOR = new Creator<Articles>() {
        @Override
        public Articles createFromParcel(Parcel in) {
            return new Articles(in);
        }

        @Override
        public Articles[] newArray(int size) {
            return new Articles[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flag) {
        dest.writeString(name);
    }
}
