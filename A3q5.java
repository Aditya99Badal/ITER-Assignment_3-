package assinment3;

import java.util.*;
public class A3q5 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double a,b;
System.out.println("Enter the value of a and b");
a=sc.nextDouble();
b=sc.nextDouble();
boolean res=(a>0&&a<1)&&(b>0&&b<1);
System.out.println(res);
}
}