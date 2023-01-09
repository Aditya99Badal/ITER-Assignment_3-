package assinment3;
import java.util.Scanner;
public class A3q7 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int x1,x2,x3,y1,y2,y3;
System.out.println("Enter the first coordinate (x&y)");
x1=sc.nextInt();
y1=sc.nextInt();
System.out.println("Enter the second coordinate");
x2=sc.nextInt();
y2=sc.nextInt();
System.out.println("Enter the third coordinate");
x3=sc.nextInt();
y3=sc.nextInt();
double slope1=((y2-y1)/(x2-x1));
double slope2=((y3-y2)/(x3-x2));
if(slope1==slope2)
System.out.println("The points are coolinear");
else
System.out.println("The points are not coolinear");

}
}