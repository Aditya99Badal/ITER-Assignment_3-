package assinment3;

import java.util.Scanner;
public class A3q10 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

double a,b,c,d,r1=0,r2=0;
System.out.println("Enter a, b and c");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
if(a==0)
{
System.out.println("not a quadratic equation");
}else
{
d=b*b-4*a*c;
if(d==0)
{
r1=r2=-b/(2*a);
System.out.println("root1=root2= "+r1);
}else if(d>=0)
{
r1=-b+Math.sqrt(d)/(2*a);
r2=-b-Math.sqrt(d)/(2*a);
System.out.println("root1= "+r1+" root2 = "+r2);
}else
{
System.out.println("roots are imaginary");
}
}
}
}