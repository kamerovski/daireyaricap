package bukodyazilmadanogrenilmez;

import java.util.Scanner;

public class daireyaricap {

	public static void main(String[] args) {
		double r, a;
		double pi = 3.14;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("yaricap giriniz: ");
		r = scan.nextDouble();
		
		System.out.println("merkez aciyi giriniz: ");
		a = scan.nextDouble();
		
		double alan = (pi*(r*r)*a) / 360;
		System.out.println("daire dilim alani: " + alan);

	}

}
