package com.example.abhatripathi.iitline;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class itemVideo implements Parcelable {
    public itemVideo(){

    }
    public itemVideo(String videourl) {
        this.videourl = videourl;
    }


    protected itemVideo(Parcel in) {
        videourl = in.readString();
    }

    public static final Creator<itemVideo> CREATOR = new Creator<itemVideo>() {
        @Override
        public itemVideo createFromParcel(Parcel in) {
            return new itemVideo(in);
        }

        @Override
        public itemVideo[] newArray(int size) {
            return new itemVideo[size];
        }
    };

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    String videourl;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(videourl);
    }
}
