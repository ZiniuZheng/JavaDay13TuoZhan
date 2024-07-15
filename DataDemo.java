package tuozhan;

import java.util.Date;

public class DataDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date date = new Date(); //默认获取的是当前系统时间
		String localeString = date.toLocaleString();
		System.out.println(localeString);
		
		Date date1 = new Date(0); //获取的是当前时区所代表的1970/1/1的时差时间
		String localeString1 = date1.toLocaleString();
		System.out.println(localeString1);
	}
}
