package atguigu;

public class Java029_Class_Package01 {
	public static void main(String[] args) {
		
	}
}
class Animal{
	String name;
	int age;
	private int legs;// 外界不能直接使用【看不到】[is not visible]
	public void setLegs(int i){
		if(i >= 0 && i % 2 ==0 ){
			legs = i;
		}else {
			legs = 0;
			// 或者抛出异常
		}
	}

	public int getLegs() {
		// 对属性的获取
		return legs;
	}

	public void eat(){
		System.out.println("eat ...");
	}
	public void move(){
		System.out.println("move ...");
	}
}
class Java029_Person{
	private  int age;

	public void setAge(int age) {
		if(age > 140 || age < 0){
			System.out.println("illegal");
			return;
		}
		else this.age = age;
	}

	public int getAge() {
		return age;
	}
}

// 一般是一个文件写一个类

/*
	面向对象：封装与隐藏
		程序设计追求的是（高内聚，低耦合）
		将必须隐藏的隐藏起来，需要暴漏的暴漏出来【通过权限修饰符】
	对象.属性进行操作时，要注意适用范围，和条件约束，就要使用到方法进行约束，
	从而要用权限修饰符限制属性的访问--体现了封装性

	封装性的体现：
			将属性私有化，使用公有方法去访问-------不等同于封装性
			不对外暴露的私有方法，构造器【单例模式】等

	封装性的体现需要权限修饰符的配合

		权限修饰符，从小到大 private【类内】 缺省【同包】 protected【不同包的子类】 public【同一个工程】
		可以修饰，属性，方法，构造器，内部类
		修饰类时，只能使用缺省和public

	总结：Java提供了四种权限修饰符，体现了类及类内部在调用时可见性的大小

	绝对不要将get，set写在一个方法中
 */