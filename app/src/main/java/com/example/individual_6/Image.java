package com.example.individual_6;

public class Image {
    private String name;
    private String imageUrl;

    // Constructor
    public Image(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for imageUrl
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
