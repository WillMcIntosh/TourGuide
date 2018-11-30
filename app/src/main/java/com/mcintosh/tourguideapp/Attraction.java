package com.mcintosh.tourguideapp;

public class Attraction {
    private String Category;
    private String Name;
    private String Description;
    private int ImageResourceId;

    public Attraction(String Category, String Name, String Description, int ImageResourceId) {
        this.Category = Category;
        this.Name = Name;
        this.Description = Description;
        this.ImageResourceId = ImageResourceId;
    }

    public String getCategory() {
        return Category;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }
}
