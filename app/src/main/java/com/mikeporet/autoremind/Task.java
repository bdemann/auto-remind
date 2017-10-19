package com.mikeporet.autoremind;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by mikeporet on 10/11/17.
 */

class Task implements Serializable {

    private String title;
    private int image;
    private int interval;
    private int difficulty;
    private int num_people;
    private ArrayList<String> steps;
    private ArrayList<Supply> supplies;
    private String video_url;


    public Task(String title, int image, int interval, char difficulty, short num_people, ArrayList<String> steps, ArrayList<Supply> supplies, String video_url) {
        this.title = title;
        this.image = image;
        this.interval = interval;
        this.difficulty = difficulty;
        this.num_people = num_people;
        this.steps = steps;
        this.supplies = supplies;
        this.video_url = video_url;
    }

    public ArrayList<Supply> getSupplies() {
        return supplies;
    }

    public void setSupplies(ArrayList<Supply> supplies) {
        this.supplies = supplies;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setNum_people(int num_people) {
        this.num_people = num_people;
    }

    public void setSteps(ArrayList<String> steps) {
        this.steps = steps;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public int getInterval() {

        return interval;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getNum_people() {
        return num_people;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }

    public String getVideo_url() {
        return video_url;
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
