package exam;

import java.util.Scanner;

/*
 * 实现工资个人所得税
 */
public class exam2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("请输入工资:");
		int salary=sc.nextInt();//工资
		double ownerValue;//纳税所得额
		if (salary>=0&&salary<1500) {
			ownerValue=(double)(salary-0-3500)*0.03;
			
		}else if (salary>=1500&&salary<4500) {
			ownerValue=(double)(salary-0-3500)*0.1-105;
			
		}else if(salary>=4500&&salary<9000){
			ownerValue=(double)(salary-0-3500)*0.2-555;
			
		}else if (salary>=9000&&salary<35000) {
			ownerValue=(double)(salary-0-3500)*0.25-1005;
			
		}else if (salary>=35000&&salary<55000) {
			ownerValue=(double)(salary-0-3500)*0.3-2755;
			
		}else if (salary>=55000&&salary<80000) {
			ownerValue=(double)(salary-0-3500)*0.35-5505;
		}else {
			ownerValue=(double)(salary-0-3500)*0.45-13505;
		}
		System.out.println("所需要交纳的税费为"+ownerValue);
	}
	}
}
