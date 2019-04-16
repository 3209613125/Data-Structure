

//this 表示当前对象
//class Person{
//public void print(){
//    System.out.println("[PRINT]方法："+this);
//}
//}
//public class Test {
//    public static void main(String[] args) {
//        Person p1 = new Person();
//        System.out.println("[MAIN]方法：" + p1);
//        p1.print();
//        System.out.println("=================");
//        Person p2 = new Person();
//        System.out.println("[MAIN]方法：" + p2);
//        p2.print();
//    }
//}
//使用static修饰的方法，可以直接用对象.含有static修饰符的方法名称来调用
//static修饰的方法不能访问非static的方法或属性
//所以非satic的方法可以访问static修饰的属性或者方法




//内外部类，观察打印顺序
//class Outer {
//    private String msg = "Hello World";
//
//    static {
//        System.out.println("我第一个打印");
//    }
//
//    public Outer() {
//        System.out.println("嘤嘤嘤");
//    }
//
//    {
//        System.out.println("喃喃喃");
//    }
//    public void he(){
//        System.out.println("呵呵呵");
//    }
//    public String getMsg(){
//              return this.msg ;
//    }
//    public void fun(){
//             Inner in = new Inner(this);
//             in.print();
//         }
//}
//
//    class Inner{
//    private Outer out;
//    static {
//        System.out.println("在继续嘤嘤嘤之前");
//    }
//        {
//            System.out.println("咚咚咚");
//        }
//    public  Inner(Outer out){
//        this.out = out ;
//        System.out.println("继续嘤嘤嘤");
//    }
//    public void print(){
//            System.out.println(out.getMsg());
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        Outer out1 = new Outer();
//              out1.fun();
//                 }
//}
//class Test{
//public static void Swap(int a,int b){
//
//        int c=a;
//
//        a=b;
//
//        b=c;
//
//        System.out.println("a: "+a);
//
//        System.out.println("b: "+b);
//
//        }
//
//
//


//值传递

//public class Test{
//    public static void main(String[] args) {
//        int b=20;
//        hehe(b);
//        System.out.println("b:"+b);
//
//    }
//    public static void hehe(int a){
//        a+=10;
//        System.out.println("a:"+a);
//
//    }
//}

//引用传递
//public class Test {
//
//    public static void Sample(StringBuffer a){
//
//        a.append(" Changed ");
//
//        System.out.println("a: "+a);
//
//    }
//
//
//
//    public static void main(String[] args){
//
//        StringBuffer b=new StringBuffer("This is a test!");
//
//        Sample(b);
//
//        System.out.println("b: "+b);
//
//    }
//
//}



//通过数组实现值之间的交换
//class Test{
//
//public static void swap(int []a){
//    int c=a[0];
//     a[0]=a[1];
//     a[1]=c;
//
//}
//    public static void main(String[] args) {
//    int []a=new int[2];
//    a[0]=10;
//    a[1]=20;
//        swap(a);
////打印的是主函数里面数组的值，与上面形参无关
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//
//    }
//}


//通过数组交换数值
//class Test {
//
//    public static void swap(int[] d) {
//        int c = d[0];
//        d[0] = d[1];
//        d[1] = c;
//        System.out.println(d[0]);
//        System.out.println(d[1]);
//
//    }
//    public static void main(String[] args) {
//        int[] a = new int[2];
//        a[0] = 10;
//        a[1] = 20;
//        swap(a);
//        System.out.println("---------------");
//        System.out.println(a[0]);
//       System.out.println(a[1]);
//       //下面的代码时编译不过的，形参中单东西在形参所在函数执行完毕后，便被java垃圾内存回收站回收了
//        //此代码所做的事情，是通过上面形参函数交换实参里面数组内的两个值。
//       // System.out.println(d[0]);
//        //System.out.println(d[1]);
//
//    }
//}

////java 值传递，交换两个变量的值，没有成功
//public class Test {
//
//    //交换两个变量的值
//
//    public static void Swap(int a,int b){
//
//        int c=a;
//
//        a=b;
//
//        b=c;
//
//        System.out.println("a: "+a);
//
//        System.out.println("b: "+b);
//
//    }
//
//
//
//    public static void main(String[] args){
//
//        int c=10;
//
//        int d=20;
//
//        Swap(c,d);
//
//        System.out.println("After Swap:");
//
//        System.out.println("c: "+c);
//
//        System.out.println("d: "+d);
//
//    }
//
//}
//

//通过对象 的值的交换

//class Te{
//    int x;
//    {
//        System.out.println(x);
//    }
//    public  Te(int x) {
//        this.x = x;
//        System.out.println("...");
//        System.out.println(x);
//    }
//
//}
//public class Test {
//
//    public static void main(String[] args)  {
//        Te test=new Te(1);
//        System.out.println("交换值之前："+test.x);
//        change(test, 4);
//        System.out.println("交换值之后："+test.x);
//    }
//    public static void change(Te test1,int x){
//        test1.x=x;
//    }
//}


//观察子类对象创建，注意执行顺序
//class Person{
//
//    public Person(int i){
//        System.out.println(i);
//         i=0;
//        System.out.println("**Person类对象产生**");
//        i++;
//        System.out.println(i);
//    }
//}
//class Student extends Person{
//    public Student(int i){
//      super( i) ; //若无参数时，此语句在无参时写于不写一样注意：
// //实际上在子类的构造方法之中，相当于隐含了一个语句 super();
// //同时需要注意的是，如果父类里没有提供无参构造，
// //那么这个时候就必须使用super()明确指明你要调用的父类构造 方法
//               System.out.println("**Student类对象产生**");
//        System.out.println(i);
//           }
//}
//public class Test{
//    public static void main(String[] args) {
//        new Student(2);
//    }
//}
//
//
//理解代码的执行顺序
//class Person{
//    {
//          String  name=" Tommy";
//        System.out.println(name);
//    }
//
//String name;
// public String getName() {
//     this.name=name;
//     return name;
// }
// public void setName(String name) {
//     this.name = name;
// }
//}
//class Student extends Person{
//    public void fun(){
//        System.out.println(getName());
//          }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Student student = new Student();
//       // student.setName("Steven");
//        System.out.println(student.getName());
//        student.fun();
//    }
//}


//*****方法重写：子类重写的方法参数类型，名称，个数返回类型完全相同，同时覆写方法的访问权限不能比父类更严格


//属性重写，若属性没有被用private词汇修饰，那么才去就近原则，选择就近被覆盖的属性
//class Person{
//    public String info = "Person";
//}
//
//class Student extends Person{
//    // 按照就近取用原则，肯定找被覆盖的属性。
//   public String info = "Student";
// }
// public class Test{
//    public static void main(String[] args) {
//        System.out.println(new Student().info);
//    }
//}

//class Person{
//    public void print(){
//        System.out.println("1.I am father");
//    }
//}
//
//class Student extends Person{
//    //与上上上个代码程序区分开，下列并非构造方法，
//    // 所以没有 new student();->public Student(){}->super()->public Person(){}
//    //但是写法类似 new student().print()->public void print(){}->super.print()
//    public void print(){
//        super.print();
//        System.out.println("2.I am child");
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        new Student().print();
//    }
//}


//*super调用父类属性
//class Person{
//    public String info = "爸爸！";
//}
//
//class Student extends Person{
//    public String info = "儿子！" ;
//
//    public void print(){
//        //不找本类中的属性
//             System.out.println(super.info);
//             System.out.println(this.info);
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        new Student().print();
//    }
//}




//理解执行顺序
//abstract class A{//5
//    public A(){
//        this.print() ;//6
//    }
//    public abstract void print() ;
//}
//class B extends A{
//    private int num = 100 ;//2
//    public B(int num) {//3
//        super() ;//4
//        this.num = num ;//9
//        System.out.println(this.num) ;//10
//    }
//    public void print() {//7
//        System.out.println(this.num) ;//8
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        new B(40) ;//1
//    }
//}




//**抽象类的方法用final修饰是因为不想让子类覆盖这个方法

////自定义异常类
//class AddException extends Exception{
//    public AddException(String msg){
//        super(msg);
//
//    }
//
//}
//class Test {
//    public static void main(String[] args) throws Exception {
//        int num1=20;
//        int num2=30;
//        if(num1+num2==50){
//            throw new AddException("错误的相加");
//
//        }
//    }
//
//}


