package main.ex2;

public  class Square extends Rectangle{
    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        width = side;
        length = side;
    }
    public void setLength(double side){
        width = side;
        length = side;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}