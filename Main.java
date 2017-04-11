import java.util.Scanner;
 
public class Main {
 
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int a, s;
System.out.println("Введіть довжину сторони а: ");
a = (int) in.nextDouble();
s =a*a;
System.out.printf("Площа квадрата = " + s);
}
}