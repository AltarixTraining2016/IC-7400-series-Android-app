package com.ics.twoeightnine.a7400_ics;

public class Item {
    private int src;
    private String name;
    private String description;
    private boolean fave;
    private int tags;

    public Item(String name, String desc, int src){
        this.name = name;
        description = desc;
        this.src = src;
    }

    public int getSrc(){
        return src;
    }

    public String getItemName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public boolean isFave(){
        return fave;
    }

    public int getTagMask(){
        return tags;
    }

    public void setFave(boolean f){
        fave = f;
    }

    public void setTags(int tags){
        this.tags = tags;
    }

    public void setItemName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setSrc(int src){
        this.src = src;
    }

}
