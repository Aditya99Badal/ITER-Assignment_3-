package assinment3;

import java.util.Scanner;
public class A3q11 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the weight of a person in kg and height in meter");
double wt=sc.nextDouble();
double ht=sc.nextDouble();
double BMI=wt/(ht*ht);
System.out.println("BMI= "+BMI);
if(BMI<18.5)
System.out.println("Under weight");
else if(BMI>=18.5 &&BMI<25)
System.out.println("Normal weight");
else if(BMI>=25 &&BMI<30)
System.out.println("Over weight");
else
System.out.println("Abese");
}

}