package atguigu;

import java.io.PrintStream;

public class Java026_Class_Function07_Reshape2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		基本数据类型值传递的示范
		OverLoading04 o = new OverLoading04();
		int m,n;
		m = 2;
		n = 1;
		System.out.println("m = "+m+" n = "+ n);
		o.swap(m,n);
		System.out.println("m = "+m+" n = "+ n);
		
		
		String s1 = "abc";
		String s2 = "bcdeffff";
		System.out.println("s1 = "+ s1 + "\ns2 = "+ s2 + "\n");
		o.swap01(s1, s2);
		System.out.println("s1 = "+ s1 + "\ns2 = "+ s2 + "\n");
		
		Data d1 = new Data(),d2 = new Data();
		d1.val = 1;
		d2.val = 100;
		System.out.println("d1.val = "+d1.val+" d2.val = "+d2.val);
		o.swap02(d1, d2);
		System.out.println("d1.val = "+d1.val+" d2.val = "+d2.val);
	}
	
	public void test01(){
		//  貌似是值传递的问题
		int a = 10;
		int b = 10;
		method01(a,b);// 调用完此方法后，打印出a = 100,b = 200
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	} 
	public void method01(int a,int b){
//		直接结束程序
		a *= 10;
		b *= 10;
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.exit(0);//结束程序
	}
	
	public void method02(int a,int b){
		// 修改打印流
		PrintStream ps = new PrintStream(System.out){
			public void println(String str){
				if("a=10".equals(str)){
					str = "a=100";
				}else if("b=10".equals(str)){
					str = "b=200";
				}
				super.println(str);
			}
		};
		System.setOut(ps);
	}
	

}
class OverLoading04{
	// 值传递机制
//	交换两个变量的值
public void swap03(int[] arr,int i, int j){
//	交换数组中两个值
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
public void swap02(Data d1,Data d2){
//	交换对象中的属性
//	可以完成交换
	int temp = d1.val;
	d1.val = d2.val;
	d2.val = temp;
}

public void swap01(String s1,String s2){
//	引用数据类型
//	交换两个变量的值
//	无法交换
	String temp = s1;
	s1 = s2;
	s2 = temp;
	System.out.println("SWAP::s1 = "+ s1 + "\ns2 = "+ s2 + "\n");
}

public void swap(int a,int b){
//	基本数据类型交换
//	调用函数后，无法交换两个的值
	
	int temp = a;
	a = b;
	b = temp;
}
}
class Data{
public int val;
}


