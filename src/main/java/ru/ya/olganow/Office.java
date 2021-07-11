package ru.ya.olganow;

public class Office {
    String address;
    int square;
    int floor;
    char category;

    String getAddress(){
        return address;
    }

    int getFloor(){
        return floor;
    }

    void setCategory(char category){
        this.category = category;
    }

    public String getInfo(){
        return "There are some details about an office: 1. Address:" + address + " 2. Square: " + square +
                "; 3. floor " + floor + "; 4. Category: " + category;
    }

}
