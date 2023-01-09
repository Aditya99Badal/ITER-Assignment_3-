package assinment3;

public class A3q4 {
public static void main(String[] args) {
int a,b,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=Integer.parseInt(args[2]);
if(a==b&&b==c&&c==a)
System.out.println("Equal");
else
System.out.println("Not Equal");
}
}