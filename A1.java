import java.util.Scanner;
class numbers {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();

if(n%2 == 0) {
System.out.println("Even");
}
else if(n%2 < 0) {
System.out.println("invalid");
}
else {
System.out.println("Odd");
}
}
}
