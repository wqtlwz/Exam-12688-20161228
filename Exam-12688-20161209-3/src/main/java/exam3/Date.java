package exam3;

import java.util.Scanner;

/**
 * 
 * 输入时间.判断是哪一天
 *
 */
public class Date {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入日期:(yyyy-mm-dd):");
	    String dates=sc.nextLine();
	    String year=dates.substring(0, 4);
	    String month=dates.substring(5,7);
	    String days=dates.substring(8,10);
	    int count=0;
	    switch(month){
	         case "12":
	    	     count += 30;
	    	     break;
	    	  case "11":
	    	     count += 31;
	    	     break;
	    	  case "10":
	    	     count += 30;
	    	     break;
	    	  case "09":
	    	     count += 31;
	    	     break;
	    	  case "08":
	    	     count += 30;
	    	     break;
	    	  case "07":
	    	     count += 31;
	    	     break;
	    	  case "06":
	    	     count += 31;
	    	     break;
	    	  case "05":
	    	     count += 30;
	    	     break;
	    	  case "04":
	    	    count += 31;
	    	    break;
	    	  case "03":
	    	    count += 28;
	    	    break;
	    	  case "02":
	    	    count += 31;
	    	    break;
	    	  case "01":
	    	    count += 0;
	    	    break;
	    	 }
	          int day=Integer.parseInt(days);
	          count+=day;
	          int years=Integer.parseInt(year);
	          int months=Integer.parseInt(month);
	          if (years%4==0&&years%1001==0&&months>=3) {
				count+=1;
	          }
				System.out.println("你输入的日期为当年的第"+count+"天");
			
	}
	}

