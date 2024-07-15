package tuozhan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test2 {

	public static void main(String[] args) throws ParseException {
		String date = "1997_07_01 08:08:08"; //这个字符串
		//SimpleDateFormat dateFormat = new SimpleDateFormat(); //使用默认格式的，不可取
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd HH:mm:ss"); //使用指定格式的，可取
		
		//通过parse方法将字符串解析成Date
		Date parse = dateFormat.parse(date);
		
		long time = parse.getTime();
		time += 1000 * 60 * 60 * 24 * 31L; //一定要L再去改变时间
		Date newDate = new Date(time);
		
		//获取Calendar
		Calendar instance = Calendar.getInstance();
		instance.setTime(parse);
		
		int i = instance.get(Calendar.MONTH);
		System.out.println(i);
		instance.set(Calendar.MONTH, i+1);
		System.out.println(instance.get(Calendar.MONTH));
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		//通过format方法将日期转换成想要的字符串表现形式
		String format = dateFormat2.format(newDate);
		System.out.println(format);
	}
}
