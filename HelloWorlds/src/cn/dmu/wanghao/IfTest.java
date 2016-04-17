package cn.dmu.wanghao;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int a = Integer.valueOf(line);
		if(a==1){
			System.out.println("A==1");
		}else{
			System.out.println("A<>1");
		}
	}
}
