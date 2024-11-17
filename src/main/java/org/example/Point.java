package org.example;

    public class Point {
//Sınıfın 2 tane değişkeni olmalı x ve y ikisinin de değeri int olmalı.
//Bu iki değişkene sadece bu sınıf içerisinden erişilebilinmeli.
    private int x;
    private int y;


//Point sınıfı için bir adet constructor tanımlayınız. İki değeri de set edebilmeli.
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
//İlgili iki değişken için getter ve setter metodlarını tanımlayınız.
    public int getX(){
        return this.x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public double distance(Point p) {
        if (p == null) {
            System.out.println("Point objesi null olarak geldi.");
            return 0;
        }
        return distance(p.x , p.y);
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow((this.x - x),2) + Math.pow((this.y - y),2));
    }
}
