package tuozhan;

public class Test1 {
/*
 * 通过System这个类的arraycopy方法将已知数组int[] arr = {12,234,45,324}中间的两个元素拷贝到另外一个新数组中
 */
	public static void main(String[] args) {
		int[] arr = {12,234,45,324};
		int[] newArr = new int[4];
		System.arraycopy(arr, 1, newArr, 0, 2);
		
		for(int i=0;i<newArr.length;i++) {
			System.out.println(newArr[i]);
		}
		
		for(int i=0;i<100;i++) {
			new Mei();
		}
		System.gc();
	}
}

class Mei{
	@Override
	protected void finalize() throws Throwable{
		System.out.println("我爱学习");
	}
}
