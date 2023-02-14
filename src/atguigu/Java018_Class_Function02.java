package atguigu;

public class Java018_Class_Function02{
    public static void main(String[] args) {
        StudentJava018 stu1 = new StudentJava018();
        stu1.name = "Tom";
        stu1.age = 18;
        stu1.sex = 1;

        stu1.study();
        stu1.showAge();
        int newAge = stu1.addAge(2);
        stu1.showAge();

        StudentJava018 stu2 = new StudentJava018();
        stu2.showAge();
    }
}
class ExerciseClass{}
class StudentJava018{
    String name;
    int age;
    /**
     *  sex = 1 表示男性
     *  sex = 0 表示女性
     * @param i
     * @return
     */
    int sex;

    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println(age);
    }
    public int addAge(int i){
        return age+i;
    }
}
class ExerciseClassStudent{
    String name;
    int age;
    String major;
    String interest;
    public String say(){
        return name+age+major+interest;
    }
}
class ExerciseClassTeacher{}

/*

 */