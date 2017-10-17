package com.mikeporet.autoremind;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by mikeporet on 10/11/17.
 */

class Task implements Serializable {

    private String title;
    private int image;

    public Task(String title, int image) {
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
