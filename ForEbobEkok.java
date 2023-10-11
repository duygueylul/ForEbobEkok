package Temel_Kavramlar;


import java.util.Scanner;
public class ForEbobEkok {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s1, s2, ebob = 1, ekok;
		System.out.print("Lütfen Sayıları Giriniz: ");
		s1 = scan.nextInt();
		s2 = scan.nextInt();
		
		int min = (s1 < s2) ? s1 : s2;
		for(int i = min; i > 0; i--) {
			
			if((s1 % i == 0) && (s2 % i == 0)) {
				ebob = i;
				break;
			}
		}
		ekok = (s1 * s2) / ebob;
		System.out.println(s1 + " ve " + s2 + " Sayıları'nın EKOK'u " + ekok);
		System.out.println(s1 + " ve " + s2 + " Sayıları'nın EBOB'u " + ebob);
	}

}
