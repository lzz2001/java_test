package atguigu;

public class Java024_Class_CustomTool {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    class ArrayUtil{
        //	求数组最大值
        public int max(int[] arr){
            int max = arr[0];
            for(int i:arr){
                if(max < i){
                    max = i;
                }
            }
            return max;
        }

        //	求数组最小值
        public int min(int[] arr){
            int min = arr[0];
            for(int i:arr){
                if(min > i){
                    min = i;
                }
            }
            return min;
        }

        //	求数组总和
        public int sum(int[] arr){
            int sum = 0;
            for(int i:arr){
                sum += i;
            }
            return sum;
        }

        //	求数组平均值
        public int avg(int[] arr){
            return sum(arr)/arr.length;

        }
//	反转数组
        // 有问题

        public void reverseArr(int[] arr){
            for(int i = 0;i < (arr.length - 1)/2;i ++){
                int temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }
        }
        //	复制数组
        public int[] copyArr(int[] arr1)
        {
            int[] arr2 = new int[arr1.length];
            for(int i = 0;i < arr1.length;i ++){
                arr2[i] = arr1[i];
            }
            return arr2;
        }

        //	数组排序
        public void sortArr(int[] arr){
            for(int i = 0;i < arr.length - 1;i ++){
                for(int j = 0;j < arr.length - i - 1;j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[i];
                        arr[j] = arr[j+1];
                        arr[j + 1] = temp;

                    }
                }
            }
        }
        //	遍历数组       ----------------[1,2,3]
        public void printArr(int[] arr){
            for(int i:arr){
                System.out.println(i+"\t");
            }
            System.out.println();
        }

        //	查找数值
        public int binarySearch(int[] arr,int val){
            int index = 0;
            int start = 0;
            int end = arr.length - 1;
            int middle = (start + end)/2;
            while(start <= end){
                if(arr[middle] > val){
                    start = middle + 1;
                }else if(arr[middle] < val){
                    end = middle - 1;
                }else return middle;

                middle = (start + end)/2;
            }

            return -1;

        }
    }

}
//	自定义工具类
