package com.intuit;

public class Company {

    private String hq;
    private long size;

    public void setHq(String hq) {
        this.hq = hq;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getHq() {
        return hq;
    }

    public long getSize() {
        return size;
    }


    public Company(){
        System.out.println("Company instantiated");
    }
    public Company(String constructorName){
        System.out.println("Name of my Company is  : "+constructorName);
    }
}
