package com.mikeporet.autoremind;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mikeporet on 10/16/17.
 */

public class Car implements Parcelable{

    private String make;
    private String model;
    private int year;
    private int image;

    public Car(String make, String model, int year, int image) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return (year == 0 ? "": year + " ") + make + " " + model;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(make);
        parcel.writeString(model);
        parcel.writeInt(year);
        parcel.writeInt(image);
    }

    // this is used to regenerate your object. All Parcelables must have a CREATOR that implements these two methods
    public static final Parcelable.Creator<Car> CREATOR = new Parcelable.Creator<Car>() {
        public Car createFromParcel(Parcel in) {
            return new Car(in);
        }

        public Car[] newArray(int size) {
            return new Car[size];
        }
    };

    // example constructor that takes a Parcel and gives you an object populated with it's values
    private Car(Parcel in) {
        make = in.readString();
        model = in.readString();
        year = in.readInt();
        image = in.readInt();
    }
}
