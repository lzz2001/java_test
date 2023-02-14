package atguigu;

import java.util.Arrays;
import java.util.Scanner;

public class Java013_ArrayUse {


    public static void main(String args[]) {
//		arrayUseDoubleAarray();
//		arrayUseQuestion10();
        arrayUseArrayUtil();

    }

    static void arrayUseQuestion() {}
    static void arrayUseQuestionExceptions() {

    }
    static void arrayUseArrayUtil() {
        int[]  sortArr1 = {1,2,3};
        int[]  sortArr2 = {1,2,3};
        int[]  sortArr3 = {1,3,2};
//		比较两个数组中各个位置的元素是否相等
        boolean isEquals = Arrays.equals(sortArr1,sortArr2);
        System.out.println(isEquals);
//		输出
        System.out.println(sortArr1.toString());
        System.out.println(Arrays.toString(sortArr1));
//		填补指定数值到数组中
        Arrays.fill(sortArr2,2);
        System.out.println(Arrays.toString(sortArr2));
//		排序
        Arrays.sort(sortArr3);
        System.out.println(Arrays.toString(sortArr3));
//		二分查找
        int deIndex = Arrays.binarySearch(sortArr1, 1);
        System.out.println(deIndex);
    }
    static void arrayUseQuestion11_() {
//		快速排序
        int[]  sortArr = new int[]{1,4,5,6,2,3,8,8};
        int low,hight,temp;
        for(int i:sortArr){
            System.out.print(i+"\t");
        }

        for(int i:sortArr){
            System.out.print(i+"\t");
        }
    }
    static void arrayUseQuestion10() {
//		冒泡排序
        int[]  sortArr = new int[]{1,4,5,6,2,3,8,8};
        for(int i:sortArr){
            System.out.print(i+"\t");
        }
        System.out.println();
//		从小到大
        for(int i = 0;i < sortArr.length - 1;i++){
            for(int j = 0;j < sortArr.length - i - 1;j++){
                if(sortArr[j] > sortArr[j + 1]){
                    int temp = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = temp;
                }
            }
        }
        for(int i:sortArr){
            System.out.print(i+"\t");
        }
    }
    static void arrayUseQuestion09() {
//		查找[二分法查找(需要有序)][暴力遍历]
//		用目标数据减去第一个元素的差   /   最后一个元素减去第一个元素的差
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int start = 0;
        int end = arr1.length - 1;
        int destNum = 5;
        int middle = (start + end) / 2;
        while(start <= end){
            if(arr1[middle] == destNum){
                System.out.println("数字已经找到，索引位置为"+middle);
                break;
            }else if(arr1[middle] > destNum){
                end = middle - 1;
            }else if(arr1[middle] < destNum){
                start = middle + 1;
            }
            middle = (start + end) / 2;
        }


    }
    static void arrayUseQuestion08() {
//		使用简单数组
//		(1)创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，
//		他们是int[]类型的数组。
//		(2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
//		(3)显示array1的内容。
//		(4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值
//		(如array[0]=0,array[2]=2)。打印出array1。
//		思考：array1和array2是什么关系？
//		拓展：修改题目，实现array2对array1数组的复制

//		反转交换
        int[] arr1 = new int[]{2,3,5,7,11,13,17,19};
        int temp = 0;
        for(int i = 0; i < arr1.length/2 ; i++){
            temp = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = temp;
        }
        for(int i = 0 ;i < arr1.length;i++ ){
            System.out.println(arr1[i]);
        }

//		复制
//		int[] arr1 = new int[]{2,3,5,7,11,13,17,19};
//		int[] arr2 = new int[arr1.length];
//		for(int i = 0 ;i < arr1.length;i++ ){
//			arr2[i] = arr1[i];
//		}
//		for(int i = 0 ;i < arr1.length;i++ ){
//			System.out.print(arr2[i]+"+");
//		}
//

//		赋值 ！= 复制   arr1与arr2是指向同一个数组
//		int[] arr1 =  new int[]{2,3,5,7,11,13,17,19};
//		for(int i : arr1){
//			System.out.print(i+"\t");
//		}
//		System.out.println();
//		int[] arr2 =  arr1;
//		for(int i = 0;i < arr2.length;i+=2){
//			arr2[i] = i;
//		}
//		for(int i : arr1){
//			System.out.print(i+"\t");
//		}

    }
    static void arrayUseQuestion07_() {
//		从控制台输入3 打印：       从控制台输入5 打印：   回形数
//		1 2 3					1  2  3  4  5
//		8 9 4					16 17 18 19 6
//		7 6 5					15 24 25 20 7
//								14 23 22 21 8
//								13 12 11 10 9


    }
    static void arrayUseQuestion06_() {
//		创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时，要求
//		元素的值各不相同。
        int intArr[] = new int[6];

    }
    static void arrayUseQuestion05() {
//       [m,n]----[0,1)*(n-m+1)+m
//		定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
//		然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
//		要求：所有随机数都是两位数
        int intArr[] = new int[10];
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE,sum = 0;
        double avg = 0.0;
        for(int i = 0;i < intArr.length;i++){
            //[0,1) -> [10,99]
            intArr[i] = (int)(Math.random()*90+10);
            if( max < intArr[i] )max = intArr[i];
            if( min > intArr[i] )min = intArr[i];
            sum += intArr[i];
        }
        System.out.println( "max = " + max
                + "\tmin = " + min
                +	"\t\tsum = " + sum
                + "\tavg = " + (double)sum/intArr.length);
    }
    static void arrayUseQuestion04() {
//		使用二维数组打印一个 10 行杨辉三角。
//		【提示】
//		1		1. 第一行有 1 个元素, 第 n 行有 n 个元素
//		1 1		2. 每一行的第一个元素和最后一个元素都是 1
//		1 2 1	3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。
//		1 3 3 1
//		即：yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
        int row = 10;
        //浪费空间
        int [][] yangHuiTriangle = new int[row][row];
        //合理
        int [][] yangHuiTriangle01 = new int[row][];
        for(int i = 0;i < yangHuiTriangle01.length;i++){
            yangHuiTriangle01[i] = new int[i + 1];
            //for(int j = 0;j < yangHuiTriangle01[i].length;j++ ){
            yangHuiTriangle01[i][0] = 1;
            yangHuiTriangle01[i][i] = 1;
            for(int j = 1;j < yangHuiTriangle01[i].length - 1;j++ )
            {
                yangHuiTriangle01[i][j]=yangHuiTriangle01[i-1][j-1]+yangHuiTriangle01[i-1][j];
            }
            //}
        }
//		for(int i = 0;i < yangHuiTriangle.length;i++){
//			for(int j = 0;j < yangHuiTriangle[i].length;j++ ){
//				yangHuiTriangle[i][0] = 1;
//				yangHuiTriangle[i][i] = 1;
//
//			}
//		}
//		for(int i = 2;i < yangHuiTriangle01.length;i++){
//			for(int j = 1;j < i;j++ ){
//				yangHuiTriangle01[i][j]=yangHuiTriangle01[i-1][j-1]+yangHuiTriangle01[i-1][j];
//			}
//		}
        for(int i = 0;i < yangHuiTriangle01.length;i++){
            for(int j = 0;j <= i;j++ ){
                System.out.print(yangHuiTriangle01[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static void arrayUseDoubleAarray() {
//		声明和初始化同时（静态初始化[可以类型推断]）
        int[][] doubleArr = new int[][]{{1,2,3},{4,5,6,7},{23,45}};
//		动态初始化			//  必须有行标
//		标准写法
        String[][] stringDArr = new String[3][];

//		正确写法
        String[] strArr[] = new String[2][3];//-------
        String strArr2[][] = new String[4][];

//		调用数组元素
        System.out.println(doubleArr[1][1]);
        System.out.println(strArr[1]);
//		System.out.println(strArr[1][0]); //java.lang.NullPointerException
        strArr[1] = new String[2];
        System.out.println(strArr[1][0]);

//		获取数组的长度
        System.out.println(strArr.length);//
        System.out.println(strArr[1].length);

//		遍历二维数组
        for(int i = 0;i < strArr.length;i++){
            for(int j = 0;j < strArr[i].length;j++){
                System.out.print(strArr[i][j]+"\t");
            }
            System.out.println();
        }

//		默认初始化值 int[][] arr = new int[2][2];
//			外层：arr[0],arr[1]         地址值或者null

//			内层：arr[0][0],arr[1][1]	真实数值 0 false 0.0 或者
//										空指针异常（引用类型）

//		内存解析（结构）


    }
    static void arrayUseQuestion03() {
//		2. 从键盘读入学生成绩，找出最高分，
//		并输出学生成绩等级。
//		成绩>=最高分-10 等级为’A’
//		成绩>=最高分-20 等级为’B’
//		成绩>=最高分-30 等级为’C’
//		其余 等级为’D’
//		提示：先读入学生人数，根据人数创建int数组，
//		存放学生成绩。
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入學生人數：");
        int studentNum = sc.nextInt();
        int []studentsArr = new int[studentNum];
        int maxScore = 0;

        System.out.println("请输入"+studentNum+"个成绩");
        for(int i = 0;i < studentsArr.length;i++){
            studentsArr[i] = sc.nextInt();

            if(studentsArr[i] > maxScore ){
                maxScore = studentsArr[i];
            }
        }

        for (int i = 0 ;i < studentsArr.length;i++) {
            if(studentsArr[i] >= (maxScore-10)){
                System.out.println("student "+i+ ": score is "+studentsArr[i]+ " ,grade is A");
            }else if(studentsArr[i] >= (maxScore-20) ){
                System.out.println("student "+i+ ": score is "+studentsArr[i]+ " ,grade is B");
            }else if(studentsArr[i] >= (maxScore-30) ){
                System.out.println("student "+i+ ": score is "+studentsArr[i]+ " ,grade is C");
            }else{
                System.out.println("student "+i+ ": score is "+studentsArr[i]+ " ,grade is D");
            }

        }
        System.out.println("最高分是： "+ maxScore);

    }
    static void arrayUseQuestion02() {
        // 升景坊单间短期出租4个月，550元/月（水电煤公摊，网费35元/月），
        // 空调、卫生间、厨房齐全。屋内均是IT行业人士，喜欢安静。
        // 所以要求来租者最好是同行或者刚毕业的年轻人，爱干净、安静。
        int[] arr = new int[] { 8, 2, 1, 0, 3 };
        int[] index = new int[] { 2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3 };
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }
        System.out.println("联系方式：" + tel);
        // 180 138 201 00

    }
    static void arrayUse01() {
        // 静态初始化
        int[] arrInt = null;
        arrInt = new int[] { 1, 2, 3 };

        // 动态初始化
        String[] stringArr = new String[5];

        // 调用数组中指定位置的元素
        arrInt[0] = 0;
        stringArr[0] = "王明";
        stringArr[1] = "张学良";
        stringArr[2] = "周洋";
        stringArr[3] = "瓦格里和";
        stringArr[4] = "瓦格里和";
        // stringArr[5] = "瓦格里和"; //报错：java.lang.ArrayIndexOutOfBoundsException

        // 获取数组的长度
        System.out.println(stringArr.length);

        // 遍历
        for (int i = 0; i < 5; i++) {
            System.out.println(stringArr[i]);
        }

        // 数组元素默认初始化值
        int arr[] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}

/*
 * Array（数组）：常见概念 数字名，下表（索引），
 * 		元素，数据类型，数组长度
 *
 * 数组属于引用数据类型， 数组中的元素可以时任何类型，
 * 		是一片连续的空间，长度一旦确定不能修改 加长----只能再造一个
 *
 * 分类：可以按照维数，按照存储数据的数据类型
 *
 * 一维数组的使用： 	声明，
 * 					初始化，数组一旦初始化--->长度就确定了
 * 					调用指定数组元素，数组的索引就是从0开始 获取数组长度，
 * 					如何遍历，
 * 					数组元素的默认初始化:所有整形初始化是0，浮点型0.0 char类型 0（\u0000）boolean类型false 引用数据类型 null
 * 					数组的内存解析： 内存分为 是JVM分配 栈（stack）：
 * 						栈（stack）：局部变量
 * 						堆（heap）：new出来的对象，数组
 * 						方法区：常量池 和 静态域 类加载信息
 * 					(引用计数算法)【垃圾清理算法】（不确定的时间回收）
 *
 */



/* 并没有所谓的二维数组。他只是一个数组中的元素对象是数组而已
 * 		声明和初始化
 * 		索引
 * 		获取数组长度
 * 		遍历数组
 * 		初始化默认值
 * 				  int[][] arr = new int[2][2];
 *			外层：arr[0],arr[1]         地址值
 *
 *			内层：arr[0][0],arr[1][1]	真实数值 0 false 0.0
 *
 * 				int[][] arr = new int[2][];
 * 			外层：null
 * 			内层：空指针异常（引用类型）
 *
 * 		内存解析
 *
 *    引用类型不仅存的是地址值，还有类型
 *
 *    查找：线性查找
 *
 *    排序  -  	内部排序和外部排序[需要借助于磁盘]
 *    			目的是为了快速查找
 *     			高效率（时间按复杂度低） 低存储（空间复杂度低）  稳定性【对二次排序影响大】
 *    10种
 *    选择：直接选择，[堆排序]
 *    交换：[冒泡]，[快速]
 *    插入：直接插入，折半插入，希尔排序
 *    [归并排序]
 *    桶排序
 *    基数排序
 *
 *    操作数组的工具类 java.util.Arrays
 *
 *    数组中的常见异常 【一旦出现异常就终止执行】
 *    		索引越界      	ArrayIndexOutOfBoundsException	左右两边都算越界
 *    		空指针异常  	NullPointException
 */
