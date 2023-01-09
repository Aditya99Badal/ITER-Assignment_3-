package assinment3;

import java.util.Scanner;
public class A3q13 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the year of birth of a person ");
int year=sc.nextInt();
if(year>=1966 && year<=1980)
System.out.println("Generation of the person is X");
else if(year>=1981 && year<=1999)
System.out.println("Generation of the person is Y");
else if(year>=2000 && year<=2012)
System.out.println("Generation of the person is Z");

}
}
