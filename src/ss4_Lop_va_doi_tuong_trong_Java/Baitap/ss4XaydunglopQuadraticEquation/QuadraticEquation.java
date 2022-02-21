package ss4_Lop_va_doi_tuong_trong_Java.Baitap.ss4XaydunglopQuadraticEquation;

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
