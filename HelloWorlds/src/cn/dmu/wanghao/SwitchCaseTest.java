package cn.dmu.wanghao;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		int i = Integer.valueOf(line);
		
		
		switch (i) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wensday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Some Day");
			break;
		}
		
		
	}

}
