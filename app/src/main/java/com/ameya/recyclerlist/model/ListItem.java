package com.ameya.recyclerlist.model;

/**
 * Java representation of our data to be displayed in the RecyclerView
 * Created by 0411a on 3/31/2017.
 */

public class ListItem {
    private String title;
    private int imageResID;
    private boolean favorite = false;
    private String subTitle;

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public int getImageResID() {
        return imageResID;
    }

    public void setImageResID(int imageResID) {
        this.imageResID = imageResID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
