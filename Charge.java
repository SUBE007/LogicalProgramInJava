package com.java;

public class Charge {
    private static double rx;
    private static double ry;
    private static double q;
    //private  final double q;
    public Charge(double x0,double y0,double q0)
    {
        this.rx=x0;
        this.ry=y0;
        this.q=q0;
    }
    private static double  potentialAt(double x, double y)
    {
        double k=8.99e09;
        double dx=x-rx;
        double dy=y-ry;
        return k*q/Math.sqrt(dx*dx + dy*dy);
    }
    public static void main(String args[])
    {
        double x=2.0;
        double y=3.0;
        double q=4.0;
       Charge c1= new Charge( 3,5,7);
        Charge c2=new Charge( 1,3,5);
        double result1=c1.potentialAt(x,y);
        double result2=c2.potentialAt(x,y);
        System.out.println("Value of:"+(result1+result2));
    }
}
