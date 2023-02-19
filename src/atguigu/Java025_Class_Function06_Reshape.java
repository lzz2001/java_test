package atguigu;

public class Java025_Class_Function06_Reshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		值传递的示范
		OverLoading03 o = new OverLoading03();
		int m,n;
		m = 2;
		n = 1;
		System.out.println("m = "+m+" n = "+ n);
		o.swap(m,n);
		System.out.println("m = "+m+" n = "+ n);
		
	}

}

class OverLoading03{
		// 值传递机制
//		交换两个变量的值
//	调用函数后，无法交换两个的值
	public void swap(int a,int b){
		int temp = a;
		a = b;
		b = temp;
	}
}
	
class OverLoading02{
//	2.编写程序，定义三个重载方法并调用。方法名为mOL。
//	三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别
//	执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
//	在主类的main ()方法中分别用参数区别调用三个方法。
	public void mOL(int i){
		System.out.println(i * i);
	}
	public void mOL(int i,int j){
		System.out.println(i * j);
	}
	public void mOL(String s){
		System.out.println(s);
	}
//	3.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方
//	法求两个double值中的最大值，第三个方法求三个double值中的最大值，
//	并分别调用三lic个方法。
	public int max(int i, int j){
		return (i > j)? i : j;
	}
	public double max(double i, double j){
		return (i > j)? i : j;
	}
	public double max(double i, double j,double k){
		return (max(i,j)>max(j,k)) ? max(i,j) : max(j,k);
	}
	
	
}
class OverLoading01{
//	public void getSum(int i,int j){
//		System.out.println(1);
//	} //  如果没有对应的参数，则（自动）向上转型
	
	public void getSum(double d1,double d2){
		System.out.println(2);
	}
	
	public void getSum(String s, int i ){
		System.out.println(3);
	}
	public void getSum(int i,String s){
		System.out.println(4);
	}
	
}


 
/*
// 方法重载（overloading）
 * 
 *  同一个类中允许存在多个同名方法，只要他们的参数类型和参数个数不同即可 
 *  1.两同一不同      同一个类同一个方法名，参数不同
 *  针对不同参数，使用相同方法
 *  2.判断是否重载：与权限修饰符，返回值类型，形参变量名，方法体都没有关系
 *  3.通过对象调用方法时如何确定某一个方法：方法名，参数列表
 *  
// 可变形参，不确定个数的形参
 * 
 *  JDK5.0之后新增
 *  格式：
 *  	形参列表（String ... strs）//输入任意参数
 *  					strs.length
 *  	优先考虑重载的确定个数形参的方法进行调用
 *  	特别的 String[] strs 与 String ...strs 不够重载
 *  	调用String[]  strs时  使用 new String[]{"a","b","c"} 
 *  	可变形参只能声明在末尾，并且只能有一个
 *  
// 方法的值传递机制
 * 
 * 		Java中只有一种传递方式：值传递
 * 			基本数据类型：值传值
 * 			引用数据类型：传递地址
 * 		实参：方法调用时，实际传递给形参的值
 * 
// 递归方法
 * 

 
 
*/
