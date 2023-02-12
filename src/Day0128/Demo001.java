package Day0128;

public class Demo001 {
    public static void main(String[] args) {
    int result = fun( 10 );
        System.out.println(result);
    }
    //报错。栈满溢出错误
    static int fun(int n){
        n = n%2==0?n-1:n;
        if(1==n)
        return  1;
        return n+fun(n-2);
    }
}
class use {
    final int i=0;
    final int fun(){
        return 0;
    }
    int fun(int i){
        return 0;
    }

}