package iak.don.beginner.miwok.model;

import android.graphics.drawable.Drawable;

/**
 * Created by don on 11/29/2016.
 */
public class Colors {
    private String english;
    private String miwok;
    private Drawable image;
    private String audio;

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public Colors(String english, String miwok, Drawable image) {
        this.english = english;
        this.miwok = miwok;
        this.image = image;
    }

    public Colors(String english, String miwok) {
        this.english = english;
        this.miwok = miwok;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMiwok() {
        return miwok;
    }

    public void setMiwok(String miwok) {
        this.miwok = miwok;
    }
}
