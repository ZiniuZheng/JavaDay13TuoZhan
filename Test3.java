package tuozhan;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Test3 {

	public static void main(String[] args) {
		//获取当前时间
		Date date = new Date();
		
		//获取1971年1月1日 8:00
		
		Date date2 = new Date(1000*60*60*24*365L);
		Date date3 = new Date(0); //代表就是1970 1月1日 8:00东八区时间
		Date date4 = new Date(0);
		date4.setYear(100);
		long time = date4.getTime();
		long result = date.getTime() - time;
		System.out.println(result/(1000*60*60*24L));
		
		/*
		 * 将时间字符串转换成Date对象：
		 * 	1.首先创建SimpleDateFormat(里面的格式需要与时间字符串的格式一致)
		 * 	2.调用SimpleDateFormat的对象的format方法Date对象转换成我们想要的字符串
		 */
		
		Date date5 = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
		String format = dateFormat.format(date5);
		System.out.println(format);
		
		ArrayList list = new ArrayList<>();
		
		//Integer integer = new Integer(1);
		list.add(1);
		String regex = "[1-9][3][0-9]{3,12}";
		String qq = "034565";
		
		boolean matches = qq.matches(regex);
		System.out.println(matches);
		
		String s = ".a.a.a.a.a";
		
		String replace = s.replace(".","b");
		System.out.println(replace);
		
		String replaceAll = s.replaceAll(".", "b");
		System.out.println(replaceAll);
		
		String[] split = s.split("\\.");
		System.out.println(split.length);
		}
}
