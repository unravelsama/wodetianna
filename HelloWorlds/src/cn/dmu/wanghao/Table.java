package cn.dmu.wanghao;

public class Table {
	public static void main(String[] args) {
		System.out.println("<table border=1>");
		for (int i = 0; i < 100; i++) {
			System.out.println("<tr>");
			for (int j = 0; j < 100; j++) {
				System.out.println("<td>");
				//System.out.println(i*j);
				System.out.println("<image src='https://img.alicdn.com/tps/i2/TB1bNE7LFXXXXaOXFXXwFSA1XXX-292-116.png_145x145.jpg'/>");
				System.out.println("</td>");
			}
			System.out.println("</tr>");
		}
		System.out.println("</table>");
	}
}
