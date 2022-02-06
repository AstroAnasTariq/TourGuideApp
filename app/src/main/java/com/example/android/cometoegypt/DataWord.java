package com.example.android.cometoegypt;

public class DataWord {
    private int mName;
    private int mLocation;
    private int mImageResourceId;
    private static final int NO_IMAGE_RESOURCE = -1;

    DataWord(int name, int location, int imageResourceId) {
        mName = name;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }
    public int getName() {
        return mName;
    }

    public int getLocation() {
        return mLocation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_RESOURCE;
    }
}
