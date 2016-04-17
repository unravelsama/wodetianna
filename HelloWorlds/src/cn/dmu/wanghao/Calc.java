package cn.dmu.wanghao;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// 声明一个对象
		// 对象的名字叫sc
		// 对象负责从System.in读取
		// System.in 是系统控制台
		Scanner sc = new Scanner(System.in);
		
		//nextLine是从控制台读取
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		
		// 把String类型，变换成int类型
		int a = Integer.valueOf(line1);
		int b = Integer.valueOf(line2);
		
		System.out.println(a+b);
	}

}
