package cn.dmu.wanghao;

public class NineNine {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}
