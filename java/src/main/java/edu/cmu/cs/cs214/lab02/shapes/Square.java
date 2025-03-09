package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen;// private болгож мэдээллийг нууцлах

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    
    public double getArea() {
        return sideLen * sideLen;
    }
}
