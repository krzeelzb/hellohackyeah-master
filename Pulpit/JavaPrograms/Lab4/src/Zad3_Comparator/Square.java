package Zad3_Comparator;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println(".........");
        System.out.println(".       .");
        System.out.println(".       .");
        System.out.println(".       .");
        System.out.println(".       .");
        System.out.println(".       .");
        System.out.println(".........");
    }
    public void add(){
        list.add(this);
    };
}
