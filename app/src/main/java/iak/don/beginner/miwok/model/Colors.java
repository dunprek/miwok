package iak.don.beginner.miwok.model;


/**
 * Created by don on 11/29/2016.
 */
public class Colors {
    private int english;
    private int miwok;
    private int image;
    private int audio;


    public int getAudio() {
        return audio;
    }

    public void setAudio(int audio) {
        this.audio = audio;
    }

    public Colors(int miwok, int english, int image,int audio) {
        this.english = english;
        this.miwok = miwok;
        this.image = image;
        this.audio = audio;

    }

    public Colors(int miwok, int english,int audio) {
        this.english = english;
        this.miwok = miwok;
        this.audio = audio;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMiwok() {
        return miwok;
    }

    public void setMiwok(int miwok) {
        this.miwok = miwok;
    }
}
