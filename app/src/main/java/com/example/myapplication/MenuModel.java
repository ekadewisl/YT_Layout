package com.example.myapplication;

public class MenuModel {
    private String menu;
    private int imgMenu;

    public MenuModel(String menu, int imgMenu) {
        this.menu = menu;
        this.imgMenu = imgMenu;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getImgMenu() {
        return imgMenu;
    }

    public void setImgMenu (int imgMenu) { this.imgMenu = imgMenu; }

}
