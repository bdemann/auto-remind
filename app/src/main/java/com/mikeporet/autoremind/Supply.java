package com.mikeporet.autoremind;

/**
 * Created by mikeporet on 10/18/17.
 */

public class Supply {

    private String title;
    private int image;

    public Supply(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
