package iak.don.beginner.miwok.model;

/**
 * Created by don on 11/27/2016.
 */
public class Model {
    private String english;
    private String miwok;
    private String image;
    private String audio;

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public Model(String english, String miwok, String image) {
    }

    public Model(String english, String miwok) {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
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
