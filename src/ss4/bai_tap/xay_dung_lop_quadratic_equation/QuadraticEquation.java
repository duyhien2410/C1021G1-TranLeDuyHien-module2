package ss4.bai_tap.xay_dung_lop_quadratic_equation;

public class QuadraticEquation {
    double a,b,c;

    public QuadraticEquation(){
    }
    public QuadraticEquation(double a, double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getDiscriminant(){
        return b*b-4*a*c;
    }

    public double getRoot1(){
        return (-b+Math.sqrt(getDiscriminant()))/(2*a);
    }

    public double getRoot2(){
        return (-b-Math.sqrt(getDiscriminant()))/(2*a);
    }
}
