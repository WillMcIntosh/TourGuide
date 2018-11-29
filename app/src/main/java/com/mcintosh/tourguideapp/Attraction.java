package com.mcintosh.tourguideapp;

public class Attraction {
    private String mCategory;
    private String mName;
    private String mDescription;
    private int mImageResourceId;

    public Attraction(String Category, String Name, String Description, int ImageResourceId) {
        this.mCategory = Category;
        this.mName = Name;
        this.mDescription = Description;
        this.mImageResourceId = ImageResourceId;
    }

    public String getCategory() {
        return mCategory;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
