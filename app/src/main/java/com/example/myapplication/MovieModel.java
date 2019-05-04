package com.example.myapplication;

public class MovieModel {
    private String tittle;
    private int imgDrawable;

    public MovieModel(String tittle, int imgDrawable) {
        this.tittle = tittle;
        this.imgDrawable = imgDrawable;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getImgDrawable() {
        return imgDrawable;
    }

    public void setImgDrawable(int imgDrawable) {
        this.imgDrawable = imgDrawable;
    }

}
