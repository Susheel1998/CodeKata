import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		boolean flag = false;
		if(year % 400 == 0) {
			flag = true;
		}
		else if(year % 100 == 0) {
			flag = false;
		}
		else if(year % 4 == 0) {
			flag = true;
		}
		else
		{
			flag = false;
		}
		if(flag) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
