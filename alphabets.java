import java.util.Scanner;
class numbers {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
char ch =  in.next().charAt(0);

if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
System.out.println("Vowel");
}
else if(ch == 'b' || ch == 'c' || ch == 'd' || ch == 'f' || ch =='g' || ch == 'h' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'n' || ch == 'p' || ch == 'q' || ch == 'r' || ch == 's' || ch == 't' || ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
System.out.println("Consonant");
}
else {
System.out.println("invalid");
}
}
}
