package atguigu;

public class Java027_Class_Function08_Test {
	public static void main(String[] args) {
//		Java027Test02 j = new Java027Test02();
//		j.test();
		Java027PassObject j = new Java027PassObject();
		System.out.println("Radius\tArea");
		j.printAreas(new Java027Circle(), 5);
		
		
	}
}

class Java027Circle{
//	（1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个
//	findArea()方法返回圆的面积。
	double radius;
	public double findArea(){
		return radius*radius*Math.PI;
	}	
//	（3）在main方法中调用printAreas()方法，调
//	用完毕后输出当前半径值。程序运行结果如图
//	所示。
}
class Java027PassObject{
//	（2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义
//	如下：public void printAreas(Circle c, int time)
	public void printAreas(Java027Circle c, int time){
//		在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
//		例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
		for(int i = 0;i < time;i++){
			c.radius = i + 1;
			System.out.println(c.radius+"\t"+c.findArea());
		}
	}

}

class Java027Test02{
	public int[] arr1 = {1,2,3,4,5};
	public char[] arr2 = {'1','2','3','4','5','6'};
	public void test(){
		System.out.println(arr1);//地址值
		System.out.println(arr2);//字符串---方法重载
	}
}
class Java027Test01{
	//定义一个int型的数组：int[] arr = new int[]{12,3,3,34,56,77,432};
	//让数组的每个位置上的值去除以首位置的元素，得到的结果，作为该位置上的
	//新值。遍历新的数组。
	public int[] arr = new int[]{12,3,3,34,56,77,432};
	public void fun1(){
		int temp = arr[0];
		for(int i = 0; i < arr.length;i++){
			arr[i] = arr[i]/temp;
		}
	}
	public void fun2(){
		for(int i = arr.length - 1;i >= 0;i-- ){
			arr[i] = arr[i]/arr[0]; 
		}
	}
}


