package models;

public class Rectangle {
    public int length;
    public int width;
    public String color;

    // overloaded constructor
    public Rectangle(int length, int width, String color){
        this.length = length;
        this.width = width;
        this.color = color;
    }

    /*public void setData(int l, int w, String c){
        length = l;
        width = w;
        color = c;
    }*/

    int calArea(){
        int area = length * width;
        return area;
    }

    public Rectangle(){ // default constructor(automatically added by the compiler)
        this.length = 0;
        this.width = 0;
        this.color = "";
    }
}
/*
*
*
* */