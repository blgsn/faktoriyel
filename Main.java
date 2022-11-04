import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
		int k;
		int total=1;
		Scanner input=new Scanner(System.in);
		System.out.print("Faktoriyel sayısı:");
		k=input.nextInt();
		for(int i=1; i<=k;i++) {
				total*=i;
		}
		System.out.print(k + ".Faktoriyel:" + total);
}}
