package com.example.drcloudcovid_19;

import android.os.Parcel;
import android.os.Parcelable;

public class JourneyProgress implements Parcelable {
    private String title;
    private String subTitle;
    private boolean isChecked;

    public JourneyProgress(String title, String subTitle, boolean isChecked) {
        this.title = title;
        this.subTitle = subTitle;
        this.isChecked = isChecked;
    }

    protected JourneyProgress(Parcel in) {
        title = in.readString();
        subTitle = in.readString();
    }

    public static final Creator<JourneyProgress> CREATOR = new Creator<JourneyProgress>() {
        @Override
        public JourneyProgress createFromParcel(Parcel in) {
            return new JourneyProgress(in);
        }

        @Override
        public JourneyProgress[] newArray(int size) {
            return new JourneyProgress[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public boolean isChecked() {
        return isChecked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JourneyProgress)) return false;

        JourneyProgress progress = (JourneyProgress) o;

        if (isChecked() != progress.isChecked()) return false;
        return getTitle() != null ? getTitle().equals(progress.getTitle()) : progress.getTitle() == null;
//        return getSubTitle() != null ? getSubTitle().equals(progress.getSubTitle()) : progress.getSubTitle() == null;

    }

    @Override
    public int hashCode() {
        int result = getTitle() != null ? getTitle().hashCode() : 0;
        result = 31 * result + (isChecked() ? 1 : 0);
        return result;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(subTitle);
    }

}
