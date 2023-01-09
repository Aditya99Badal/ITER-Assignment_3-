package assinment3;

import java.util.*;
public class A3q6 {
public static void main(String[] args) {
char c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character");
c=sc.next().charAt(0);
int n=(int) c;
if(n>=65&&n<=90)
System.out.println("The entered character is an uppercase");
else if(n>=97&&n<=122)
System.out.println("The entered character is a lower case");
else if(n>=48&&n<=57)
System.out.println("It is a digit");
else if((n>=0&&n<=47)||(n>=58&&n<=64)||(n>=91&&n<=96)||(n>=123&&n<=127))
System.out.println("It is a special Character");

}
}