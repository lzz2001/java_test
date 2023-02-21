package atguigu;
//	递归
public class Java028_Class_Function09_Recursion {

	private void mian() {
		// TODO Auto-generated method stub
		
	}
	public int getNum05(int num){
//		快排
		return 0;
	}
	public int getNum04(int num){
//		汉诺塔
		return 0;
	}
	
	
//	已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0
//	的整数，求f(10)的值。
	public int getNum01(int num){
		if(num == 0)return 1;
		if(num == 1)return 4;
		return 2 * getNum01(num - 1) + getNum01(num - 2);
		
	}
//	练习7.3：已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
//	其中n是大于0的整数，求f(10)的值。
	public int getNum02(int n){
		if(n  == 20)return 1;
		if(n == 21)return 4;
		return getNum02(n) - 2 * getNum02(n + 1);
				
	}
//	练习7.4：输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
//	1 1 2 3 5 8 13 21 34 55
//	规律：一个数等于前两个数之和
//	要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
//	[n阶台阶有多少种走法]
	public int getNum03(int n){
		if(n == 1||n == 2)return 1;
		
		return getNum03(n-1) + getNum03(n-2);
	}
	
	public int sum(int num){
//		计算 0~num 的和
		if(num == 0)
			return 0;
		return num + sum(num - 1);
	}
}
