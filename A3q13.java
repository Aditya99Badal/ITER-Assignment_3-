package assinment3;
import java.util.Scanner;
public class p1 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks of a student out of 100 full mark ");
int mark=sc.nextInt();
if(mark>=90)
System.out.println("O grade");
else if(mark>=80&& mark<90)
System.out.println("A grade");
else if(mark>=70&& mark<80)
System.out.println("B grade");
else if(mark>=60&& mark<70)
System.out.println("C grade");
else if(mark>=50&& mark<60)
System.out.println("D grade");
else if(mark>=40&& mark<50)

System.out.println("E grade");
else
System.out.println("F grade");

}
}
