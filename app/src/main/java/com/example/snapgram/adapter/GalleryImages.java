package com.example.snapgram.adapter;

import android.net.Uri;

public class GalleryImages {

    public Uri picUri;
    public String date;

    public GalleryImages(Uri picUri) {
        this.picUri = picUri;
        this.date = date;
    }

    public GalleryImages() {
    }

    public Uri getPicUri() {
        return picUri;
    }

    public void setPicUri(Uri picUri) {
        this.picUri = picUri;
    }

}
