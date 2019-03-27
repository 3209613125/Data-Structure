//java 方法重写，与实例化对象的向上转型
//class person {
//    public  void print() {
//        System.out.println("我是爸爸");
//    }
//    }
//    class Student extends  person{
//        @Override
//        public void print() {
//
//            System.out.println("我是儿子");
//        }
//    }
//public class Test{
//    public static void main(String[] args) {
//         person per =new Student();
//            per.print();
//    }
//}


//76234用递归完成
//public  class Test{
//    static private int n;
//    public static void main(String[] args) {
//       Test.n=76234;
//        if(n>=10){
//            System.out.print(n/10);
//        }
//        System.out.print(n%10);
//    }
//}

//题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
//第二天早上又将剩下的桃子吃掉一半，又多吃了一个
//以后每天早上都吃了前一天剩下   的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。
//求第一天共摘了多少。
//n,n/2,n/2-1,...,1
//public class Test
//{
//    public static void main(String[] args)
//    {
//        System.out.println(total(1));
//        System.out.println(total(2));
//        System.out.println(total(3));
//        System.out.println(total(4));
//        System.out.println(total(5));
//        System.out.println(total(6));
//        System.out.println(total(7));
//        System.out.println(total(8));
//        System.out.println(total(9));
//        System.out.println(total(10));
//    }
//    static int total(int day)
//    {
//        if (day == 10)
//        {
//            return 1;
//        }
//        else
//        {
//            return (total(day + 1 )+1)* 2;
//        }
//    }
//}

//方法2 循环
//public class Test {
//    public static void main(String[] args) {
//        int sum = 0, remain = 1;
////每天吃剩的桃子加一个正好是前一天桃子的一半，每天桃子的总数就是前一天剩下桃子的数量
//        for (int day = 9; day >= 1; day--) {
//            sum = (remain + 1) * 2;
//            remain = sum;
//            System.out.println("第" + day + "天还剩" + remain + "个桃子");
//        }
//        System.out.println(sum);
//    }
//}

//抽象方法，指的是声明而未实现的方法，它只不过是在普通的类的基础上扩充了一些抽象类罢了，没有方法体，他所在的类中和方法都要
//用abstract来修饰
//抽象类不象具体类那样描述一类具体事物，它是提取多种具有相似性的具体事物的共同特征而产生的
// 比如，helicoptor, jet, fighter父类plane，有start(),takeOff(),speedUp(),changeDirection()等方法，
// 这是共性，但现实中有一个具体的plane吗？没有，它是抽象出来的，根本不存在。所以实例化一个plane是没有意义的，
// 因此面向对象程序设计机制禁止对象实例化，抽象类中禁止实例化对象
//抽象类一定不能用final声明，因为final不能有子类，而抽象类一定含有子类，相应的，抽象方法也不能含有private来修饰
//因为private修饰的方法不能被覆写，而抽象方法则一定要被覆写
//private和abstract不能同时使用
//抽象类必须有子类，且子类必须重新覆写该抽象父类的抽象方法，例如抽象类Person，子类Student，
// Person per=new Student（),per.fun(实例化子类，向上转型）
//普通方法可以有返回值也可以没有返回值，而构造方法一定没有返回值，也没有static，final，abstract等词的修饰，
// 分为有参构造和无参构造
//abstract class Test {
//    private String name; // 属性
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//
//    }
//}


//java中的输入
//import java.util.Scanner;
//public class Test {
//    public static void main(String[] args) {
//        custom();
//    }
//
//    public static boolean custom()
//
//    {
//        System.out.println("您需要加柠檬吗？ y：需要  n：不需要");
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        if (str.equalsIgnoreCase("y")) {
//
//            System.out.println("客户想要柠檬");
//            return true;
//        } else if(str.equalsIgnoreCase("n")){
//            System.out.println("客户什么都不加");
//            return false;
//        }
//        else{
//            System.out.println("非法输入！");
//            return false;
//        }
//
//    }
//
//}

//代理模式 模拟代购
//interface ISubject {
//    //核心业务是买电脑
//    void buyComputer();
//}
//
////真实业务, 相当于实际上要付款的客户
//class RealSubject implements ISubject {
//    public void buyComputer() {
//        System.out.println("2.买一台mac电脑，付款");
//    }
//}
//
////辅助真实业务的实现, 相当于代购
//class ProxySubject implements ISubject {
//    //传入的是接口对象
//    private ISubject subject;
//    //传入真实业务对象
//    public ProxySubject(ISubject subject) {
//        this.subject = subject;
//    }
//
//    public void beforeBuyComputer() {
//        System.out.println("1.到美国苹果店排队");
//    }
//    public void afterBuyComputer() {
//        System.out.println("3.将电脑快递回客户手中");
//    }
//
//    //业务流程
//    public void buyComputer() {
//        this.beforeBuyComputer();
//        this.subject.buyComputer();
//        this.afterBuyComputer();
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        ISubject subject = new ProxySubject(new RealSubject());
//        subject.buyComputer();
//    }
//}


//简单的实例化对象直接赋值
//class Test{
//    public static void main(String[]args){
//        Person person=new Person();
//        person.name="何浩源";
//        person.age=21;
//        person.salary=380000;
//        person.fun();
//    }
//}
//
//     class Person{
//         String name;
//         int age;
//         int salary;
//        void fun(){
//        System.out.println("性名:"+name );
//            System.out.println("年龄:"+age);
//            System.out.println("年薪:"+salary);
//        }
//
//        }
//


//getter setter用法

//class Test{
//    public static void main(String[]args){
//        Person person=new Person();
//        person.age=22;
//        person.setName("何浩源");
//        person.setSalary(390000);
//
//        System.out.println("姓名为:"+person.getName());
//        System.out.println("年龄为:"+person.age);
//        System.out.println("年薪为:"+person.getSalary());
//    }
//}
//class Person{
//    int age;
//    String name;
//    int salary;
//
//    public int getAge() {
//        return age;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//}



//内外部类的调用
//    class Father {
//
//        private String name = "zhangjun";
//
//
//        class Child {
//
//            public String intoFather() {
//
//                return Father.this.name;
//            }
//
//        }
//
//
//
//    }
//public class Test{
//    public static void main(String[] args) {
//        Father.Child per = new Father().new Child();
//
//        System.out.println(per.intoFather());
//    }
//}


// class A {
//     int y = 6;
//
//   class Inner {
//         int y = 3;//编译不过，1.static finally 2.int y=3
//
//        void show() {
//            System.out.println(y);
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//        A.Inner inner = new A().new Inner();
//        inner.show();
//    }
//}


//class A{
//        A(){
//        System.out.println("A");
//        }
//        }
//
//class B extends A{
//    B(){
//        System.out.println("B");
//    }
//
//    public static void main(String[] args){
//        B b=new B();
//    }
//}


//打印100-999水仙花数
//class Test {
//    public static void main(String[] args) {
//
//        for (int num = 100; num < 1000; num++) {
//                int gewei = num % 10;
//                int shiwei = (num / 10) % 10;
//                int baiwei = num / 100;
//
//                    int total = gewei * gewei * gewei + shiwei * shiwei * shiwei + baiwei * baiwei * baiwei;
//                    if (total == num) {
//                        System.out.println(num);
//
//                    }
//                }
//
//
//        }
//    }



//用抽象类模拟星巴克咖啡机制作过程
//import java.util.Scanner;
//class Test {
//
//
//    public static void main(String[] args) {
//        coffee per = new coffee();
//        per.shaoshui();
//        per.receipt();
//        per.custom();
//        per.jiaoban();
//        per.dicha();
//    }
//}
//
//    abstract  class beverage{
//       private  void shaoshui(){
//            System.out.println("烧开水");
//    }
//        abstract  void receipt();
//      private  void jiaoban(){
//            System.out.println("搅拌饮料");
//        }
//
//        void dicha(){
//            System.out.println("给大佬递饮料");
//        }
//    }
//    class coffee extends beverage{
//          void shaoshui(){
//            System.out.println("烧开水");
//
//        }
//         void receipt() {
//             System.out.println("加一包秘制咖啡粉");
//         }
//
//         public static boolean custom(){
//
//             //String a=null;
//             //System.out.println(a);
//            System.out.println("需要加牛奶吗？");
//            Scanner scanner=new Scanner(System.in);
//            String str=scanner.nextLine();
////             Scanner scanner1=new Scanner(System.in);
////             String str1=scanner1.nextLine();
//            // String str1=null;
////             System.out.println(str1.equals(null));
//
//            if(str!=" "&&str==null&&str.equalsIgnoreCase("y")){
//                System.out.println("加一包牛奶");
//                return true;
//            }
//            else if (str.equalsIgnoreCase("n")){
//                System.out.println("客户不需要加牛奶");
//                return false;
//            }
//            else{
//                System.out.println("非法输入");
//                return false;
//            }
//
//        }
//        void jiaoban(){
//            System.out.println("搅拌饮料");
//        }
//        void dicha(){
//            System.out.println("给大佬递咖啡");
//        }
//    }




//代理模式 模拟代购
//interface ISubject {
    //核心业务是买电脑
  //  void buyComputer();
//}

//真实业务, 相当于实际上要付款的客户
//class RealSubject implements ISubject {
//    public void buyComputer() {
//        System.out.println("2.买一台mac电脑，付款");
//    }
//}
//
////辅助真实业务的实现, 相当于代购
//class ProxySubject implements ISubject {
//    //传入的是接口对象
//    private ISubject subject;
//    //传入真实业务对象
//    public ProxySubject(ISubject subject) {
//        this.subject = subject;
//    }
//
//    public void beforeBuyComputer() {
//        System.out.println("1.到美国苹果店排队");
//    }
//    public void afterBuyComputer() {
//        System.out.println("3.将电脑快递回客户手中");
//    }
//
//    //业务流程
//    public void buyComputer() {
//        this.beforeBuyComputer();
//        this.subject.buyComputer();
//        this.afterBuyComputer();
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        ISubject subject = new ProxySubject(new RealSubject());
//        subject.buyComputer();
//    }
//}
//
//


//代购 买aj

//interface Isubject{
//    void buyAJ();
//}
//class realsubject implements Isubject{
//    public void buyAJ(){
//        System.out.println("买一双AJ，在代购平台付款");
//    }
//}
//
//class proxysubject implements Isubject{
//    private Isubject subject;
//    //这里也是一样，方法名称与类名相同，相当于构造方法，没有返回值，甚至连void也没有，相当于new
//   public    proxysubject(Isubject subject){
//        this.subject=subject;
//
//    }
//
//
//   public void beforebuy(){
//            System.out.println("去美国AJ专卖店排队抽号");
//        }
//public void afterbuy(){
//    System.out.println("快递到客户手上");
//    }
//    //这里切记一定过程方法一定要是buyAJ的形式，不能用其他字符名字来代替
//    //代购：代理，真实客户，还有接口，其中接口只是定义了一个较为抽象的方法，该方法由真实客户去重写，并且在代理类中去完善方法
//    //也就是要在代理中去具体实现方法，其中传递实例对象是通过代理类的构造方法传入实例，其中，首先要在代理中private一个接口的的
//    // 对象，然后再将主方法中实例出来的对象传递给它，this .接口对象=实例对象，这都是在代理的构造方法中传入的，构造方法的参数
//    //列表内，形参是 接口.对象名称,一旦传入了实例对象就可以在代理类中去具体“代理方法”,也就是经过 接口定义方法->真实操作的方法->代理方法
//    //来逐步完善 buy something（）.
//    public void buyAJ(){
//        beforebuy();
//         subject. buyAJ();
//        afterbuy();
//    }
//}
//public class Test{
//
//    public static void main(String[] args) {
//        Isubject subject=new proxysubject(new realsubject());
//        subject.buyAJ();
//    }
//
//}


//        定义一个抽象的"Role"类，有姓名，年龄，性别等成员变量
//        1）要求尽可能隐藏所有变量(能够私有就私有,能够保护就不要公有)，
//        再通过GetXXX()和SetXXX()方法对各变量进行读写。具有一个抽象的play()方法，
//        该方法不返回任何值，同时至少定义两个构造方法。Role类中要体现出this的几种用法。
//        2）从Role类派生出一个"Employee"类，该类具有Role类的所有成员（构造方法除外），
//        并扩展salary成员变量，同时增加一个静态成员变量“职工编号（ID）”。
//        同样要有至少两个构造方法，要体现出this和super的几种用法，还要求覆盖play()方法，
//        并提供一个final sing()方法。
//        3）"Manager"类继承"Employee"类，有一个final成员变量"vehicle"
//        在main()方法中制造Manager和Employee对象,并测试这些对象的方法。
//this 的三大属性，调用属性，调用方法，表示当前对象



//abstract class Role
//{
//    private String name;
//    private int age;
//    private String sex;
//    public Role()
//    {
//        System.out.println("******Role构造方法1*****");
//    }
//    public Role(String n)
//    {
//        System.out.println("*******Role构造方法2*****");
//        System.out.println(n + this);
//    }
//    public void setName(String name) {
//        this.name = name;//this调用本类属性
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//    public void getPersonInfo()
//    {
//        System.out.println("姓名："+name+" 年龄： "+age + "  性别："+sex);
//    }
//    public abstract void play();
//}
//class Employee extends Role
//{
//    private int  salary;
//    static int ID;
//    public Employee()
//    {
//        System.out.println("******Employee构造方法1*****");
//    }
//    public Employee(int x)
//    {
//        this();//this调用本类方法
//        System.out.println("******Employee构造方法2*****");
//        this.salary = x;
//        System.out.println("salary is " +salary);
//    }
//    public void Role(String n,int a )
//    {
//        this.ID = a;
//        System.out.println("*******子类覆写Role构造方法2*****");
//        System.out.println(n + this);//this表当前对象
//    }
//
//    final void sing()
//    {
//        //super.(n);
//        System.out.println("sing a song");
//    }
//    public void play()
//    {
//        System.out.println("play football");
//    }
//
//}
//class Manager extends Employee
//{
//    public final String vehicle = "can not exchange";
//}
// class Text {
//    public static void main(String[] args)
//    {
//        Employee per = new Employee(1000);
//        Manager per1 = new Manager();
//        per.setName("张三");
//        per.setAge(33);
//        per.setSex("男");
//        per.getPersonInfo();
//        per.Role("six",11111111);
//        per.play();
//        per.sing();
//    }
//}


//练习
//class Test{
//
//    public static void main(String[] args) {
//
//        city acity=new city();
//        acity.country("北京");
//        acity.tary();
//
//    }
//}
// abstract class country{
//    private String country1="英国";
//  String country2="中国";
//    //若不加上花括号，则会被提示为缺少方法体，或者应该声明上修饰词abstract
//     void  country(){
//
//     }
//     void tary(){
//         System.out.println(country1);
//     }
//
////若父类的属性为private私有的话，那么该属性便不可以被子类访问
//}
//class city extends country{
//    String city1="伦敦";
//    String city2="西安";
//
//    //父类private的属性和方法子类可以继承但是不能访问和重写，在子类开辟的时候，内存会分配一个空间在子类的外部写上
//    //父类的属性和方法，包括私有属性和私有方法，在子类的内部空间写上它自己的数性和方法，两者加在一起就构成了子类的完整
//    //但是也可以通过父类的方法调用来访问其私有属性，但前提是父类方法中本身就包含其私有属性和私有方法的话，而且该方法不可以是私有的
//    //可以用父类的public方法来间接使用其私有属性
//        void tary(){
//
//        super.tary();
//    }
//
//
//    void country(String acity) {
////可以直接赋值city1，2的值给变量h，也可以通过super.country1,2的方法来调用父类的属性
//String h=super.country2;
//        System.out.println(acity);
//        System.out.println(super.country2);
//    }
//}


//接口的修饰词默认是public（因为接口就是需要具体实现才有意义），而其子类的修饰词权限不能小于public，所有子类方法中只能用public
////接口的大写I一定要正确
////接口中的属性对所有实现类只有一份所以要用static，也就是接口中只能有常量，不能又变量（不能让别的类去修改），常量用static，final，
////修饰
////接口下的子类函数尽量用public
////private 接口 接口对象
////
//interface Isubject{
//    void buyadidas();
//}
//class realsubject implements Isubject{
//    public void buyadidas(){
//        System.out.println("买一双阿迪达斯，在代购平台付款");
//    }
//
//}
//class proxysubject implements Isubject{
//    private Isubject subject;
//
//    //此处不能加void
//    //因为此时this相当于返回值，而返回值不能加this
//    //百度：
//
//    //返回的是调用this所处方法的那个对象的引用，
//    //
//    //  一点点分析的话，主干是“返回的是引用”；
//    //
//    //  什么引用呢？“那个对象的引用”；
//    //
//    //  哪个对象呢？“调用方法的那个对象”；
//    //
//    //  调用的哪个方法呢？“调用的是this所位于的方法”；这样就清楚了。
//    //
//    //  再总结一下就是，this作为返回值时，返回的是调用某方法的对象的引用，
//    // 这个方法正是包含“return this;”这行命令的那个方法；更简单点说，
//    // 就是谁调用返回的就是谁。由于返回的是对象引用，
//    // 所以this不能用在静态成员方法中，只能在非静态成员方法中出现
//    //https://www.cnblogs.com/chanchan/p/7812166.html
//   public    proxysubject(Isubject subject){
//        this.subject=subject;
//    }
//  public void beforebuy(){
//       System.out.println("去阿迪达斯专卖店排队");
//
//    }
//   public void afterbuy(){
//        System.out.println("快递给客户");
//
//    }
//  public void buyadidas(){
//       this.beforebuy();
//        this.subject.buyadidas();
//       this.afterbuy();
//
//    }
//
//}
//class Test{
//    public static void main(String[]args){
//    Isubject subject=new proxysubject(new realsubject());
//    subject.buyadidas();
//}
//
//}


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


//斐波那契数列
//0 1 1 2 3 5 8
//n=(n-1)+(n-2)
//打印20以内斐波那契数列
//class Test {
//
//    public static void main(String[] args) {
////
//        feibo j=new feibo();
//       for (int n = 1; n < 20; n++) {
//            System.out.println(j.hh(n));
//       }
//
//    }
//}
//   class feibo {
//
//
//     static int hh(int n) {
//
//            if (n == 2||n==1) {
//              return 1;
//            } else {
//        return hh(n - 2) + hh(n - 1);
//
//        }
//
//
//
//
//        }
//        }


//利用java接口实现计算器，实现加减乘除的功能
//import java.util.Scanner;
//class Test {
//    public static void main(String[] args) {
//        fun i = new fun();
//        jiafa s1 = new jiafa();
//        jianfa s2 = new jianfa();
//        chengfa s3 = new chengfa();
//        chufa s4 = new chufa();
//        System.out.println("请输入你要计算的两个数字:");
//        Scanner scanner = new Scanner(System.in);
//        Scanner scanner2 = new Scanner(System.in);
//        int str = scanner.nextInt();
//        int str2 = scanner2.nextInt();
//        int a = str;
//        int b = str2;
//        System.out.println("请输入您想要计算的方式(+，-，*，/):");
//        Scanner scanner3 = new Scanner(System.in);
//        String zifu1 = scanner3.next();
//        //next()不能读取空格，nextline()可以读取
//        //在实现字符窗口的输入时，我个人更喜欢选择使用扫描器Scanner，它操作起来比较简单。
//        // 在写作业的过程中，我发现用Scanner实现字符串的输入有两种方法，一种是next（），
//        // 一种nextLine(),但是这两种方法究竟有什么区别呢？
//        // 首先，next（）一定要读取到有效字符后才可以结束输入，对输入有效字符之前遇到的空格键、Tab键或Enter键等结束符，
//        // next（）方法会自动将其去掉，只有在输入有效字符之后，next（）方法才将其后输入的空格键、
//        // Tab键或Enter键等视为分隔符或结束符。简单地说，next（）查找并返回来自此扫描器的下一个完整标记。
//        // 完整标记的前后是与分隔模式匹配的输入信息，
//        // 所以next方法不能得到带空格的字符串而nextLine（）方法的结束符只是Enter键，
//        // 即nextLine（）方法返回的是Enter键之前的所有字符，它是可以得到带空格的字符串的。
//        //nextLine（）自动读取了被next（）去掉的Enter作为他的结束符，所以没办法给s2从键盘输入值。
//        // 经过验证，其他的next的方法，如double nextDouble()  ，
//        // float nextFloat() ， int nextInt() 等与nextLine（）连用时都存在这个问题，
//        // 解决的办法是：在每一个 next（）、nextDouble()  、 www.gzlij.com（）、nextFloat()、nextInt()
//        // 等语句之后加一个nextLine（）语句，将被next（）去掉的Enter结束符过滤掉
//        scanner3.nextLine();
//        while(true) {
//            if (zifu1.equals("+")) {
//
//                System.out.print("加法结果:");
//                i.func(s1, a, b);
//                break;
//
//            } else if (zifu1.equals("-")) {
//                System.out.print("减法结果:");
//                i.func(s2, a, b);
//                break;
//
//            } else if (zifu1.equals("*")) {
//                System.out.print("乘法结果:");
//                i.func(s3, a, b);
//                break;
//            } else if (zifu1.equals("/")) {
//                System.out.print("除法结果:");
//                i.func(s4, a, b);
//                break;
//
//            }
//            else {
//                System.out.println("非法输入!");
//                break;
//            }
//        }
//
//    }
//}
//
//    interface Ijisuanqi {
//        int jisuan(int a, int b);
//
//    }
//
//    class fun {
//        public void func(Ijisuanqi per, int a, int b) {
//            System.out.println(per.jisuan(a, b));
//        }
//
//    }
//
//    class jiafa implements Ijisuanqi {
//        public int jisuan(int a, int b) {
//            return a + b;
//        }
//    }
//
//    class jianfa implements Ijisuanqi {
//        public int jisuan(int a, int b) {
//            return a - b;
//        }
//    }
//
//    class chengfa implements Ijisuanqi {
//        public int jisuan(int a, int b) {
//            return a * b;
//        }
//    }
//
//    class chufa implements Ijisuanqi {
//        public int jisuan(int a, int b) {
//            if (b == 0) {
//
//                return -1;
//            } else {
//                return a / b;
//            }
//        }
//    }

//一道阿里校招题
//class HelloA {
//
//       public HelloA(){
//           System.out.println("Hello A!父类构造方法");
//       }
//
//      {        System.out.println("i'm A class.父类非静态代码块");
//
//
//      }
//      static{
//           System.out.println("static A 父类静态代码块");
//       }
//}
//
//     class HelloB extends HelloA {
//        public HelloB(){
//            System.out.println("Hello B! 构造方法");
//        }
//        {
//            System.out.println("i'm B class.非静态代码块");
//        }
//        static{
//            System.out.println("static B 静态代码块");
//        }
//        public static void main(String[] args) {
//            System.out.println("---start---");
//            new HelloB();
//            new HelloB();
//            System.out.println("---end---");
//        }
//}
//

//实现：比较几种代码块的执行顺序：普通代码块，，构造块，静态代码块
//class A{
//    public  A(){
//        System.out.println("A.普通代码块");
//    }
//    {
//        System.out.println("A.构造块");
//    }
//    static {
//        System.out.println("A.静态块");
//    }
//
//}
//class B extends A{
//    public void B(){
//        System.out.println("B.普通代码块");
//    }
//    {
//        System.out.println("B.构造块");
//    }
//    static {
//        System.out.println("B.静态块");
//    }
//
//}
//
//
//class Test{
//    public static void main(String[] args) {
//        System.out.println("*******start*******");
//        new B();
//        new B();
//        System.out.println("*******end*******");
//    }
//}


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



//***在Java中final被称为终结器。
//***使用final修饰类、方法、属性 final成员变量必须在声明的时候初始化或者在构造器中初始化，
//***否则就会报编译错误 使用final定义的类不能有子类(String类便是使用final定义) final一旦修饰一个类之后，
//***该类的所有方法默认都会加nal修饰。(不包含成员变量)


////接口Person
//
// interface Person {
//    public void eat();
//}
//
////实现类People
//
//// class People implements Person {
////    private int a=0;
////    @Override
////    public void eat() {
////        System.out.println("======"+a);
////
////    }
////
////}
////
//////子类xiaoming：
////
//// class xiaoming extends People {
////    private String name;
////
////    @Override
////    public void eat() {
////        System.out.println("+++++++++");
////    }
////}
////
//////主函数
////class  Test {
////    public static void main(String[] args) {
////        People p = new People();
////        xiaoming x = new xiaoming();
////        System.out.println(p instanceof Person);
////        System.out.println(p instanceof xiaoming);
////        System.out.println(x instanceof Person);
////        System.out.println(x instanceof People);
////    }
////}
////

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


//另外，抽象类也分为外部抽象类和内部抽象类，外部抽象类无法用static来修饰，而内部抽象类可以用static来修饰

//模板设计模式，ocp原则，开闭原则，以咖啡机例子为例

//final表示最终的意思，它修饰的类是不能被继承的；final修饰的方法能被继承（Math类里就有），
// 但是不能够被重写。其实关系并不复杂，你只需要记住这样一句话：final可用于声明属性、方法和类，
// 分别表示属性不可变，方法不可重写，类不可继承。
//但是final修饰的方法可以被方法重载
//子类向上转型为父类实例化对象，如果子类覆写了父类的方法，则实例化对象后，引用子类的方法，如果没有覆写父类的方法
//则使用父类的方法


//方法1
//interface A
//{
//    static double PI = 3.14;
//    abstract double area();
//}
//
//interface B
//{
//    abstract void setColor(String c);
//}
//
//interface C extends A,B
//{
//    abstract void volume();
//}
//
//class Cylinder implements C
//{
//    double radius;
//    int height;
//    String color;
//    public void setColor(String color)
//    {
//        this.color = color;
//        System.out.println("The cylinder's color is "+color);
//    }
//    public void volume()
//    {
//        System.out.println("The cylinder's volume is "+PI* radius*radius* height);
//    }
//    public double area()
//    {
//        System.out.println("The cylinder's area is "+2*PI *radius*radius
//                + 2*PI *radius*height);
//        return 0;
//    }
//
//}
//
//class Test
//{
//    public static void main(String[] args)
//    {
//        Cylinder cylinder = new Cylinder();
//        //cylinder.color = "red";
//        cylinder.height = 15;
//        cylinder.radius = 3.3;
//        cylinder.area();
//        cylinder.setColor(cylinder.color = "red");
//        cylinder.volume();
//    }
//}


//方法2
//3.按如下要求编写Java程序：
//        （1）定义接口A，里面包含值为3.14的常量PI和抽象方法double area()。
//        （2）定义接口B，里面包含抽象方法void setColor(String c)。
//        （3）定义接口C，该接口继承了接口A和B，里面包含抽象方法void volume()。
//        （4）定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底圆半径radius、
//        圆柱体的高height、颜色color。
//        （5）创建主类来测试类Cylinder。
//import java.util.Scanner;
//class Test {
//    public static void main(String[] args) {
//        fangfa i = new fangfa();
//        Cylinder s1 = new Cylinder();
//        Cylinder s2 = new Cylinder();
//        Cylinder s3 = new Cylinder();
//
//        System.out.print("容积:");
//        i.shixian(s1, 5.0, 6.0);
//        System.out.print("面积:");
//        i.shixian1(s2, 5.0);
//        System.out.println("你想要什么颜色的容器？");
//        Scanner scanner = new Scanner(System.in);
//        //nextine中的L注意大写
//        String str1 = scanner.nextLine();
//        String color = str1;
//        while (true) {
//            if (str1.equals(null)) {
//                System.out.println("重新输入");
//                continue;
//            } else {
//
//                System.out.print("我想要:");
//                //将str变量传给字符串，不需要用双引号将变量包起来
//                i.shixian2(s3, str1);
//                break;
//            }
//
//        }
//
//    }
//}
//class Cylinder implements C{
//    public double volume(double radius,double height) {
//        return radius * radius * pi * height;
//    }
//    public double area(double radius1){
//        return radius1*radius1*pi;
//    }
//    public String setcolor(String color){
//        return color;
//    }
//
//
//}
//class fangfa{
//    public double shixian(C per,double radius,double height){
//        System.out.println(per.volume(radius,height));
//        return 1;
//
//    }
//    public double shixian1(C per1,double radius1){
//        System.out.println(per1.area(radius1));
//        return 2;
//    }
//    public String shixian2(C per2,String color){
//        System.out.println(per2.setcolor(color));
//        return "hehe";
//    }
//}
//interface A{
//    public static double pi=3.14;
//     double area(double radius1);
//
//}
//interface B{
//    String setcolor(String color);
//
//}
//
//interface C extends A,B{
//    double volume(double radius,double height);
//
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

//catch(Exception e){e.printStackTrace()}


//单例模式
//class Singleton{
//    // 在类的内部可以访问私有结构，所以可以在类的内部产生实例化对象
//   private static Singleton instance = new Singleton() ;
//   private Singleton() {
//       // private声明构造
//         }
//         public static Singleton getInstance() {
//       return instance ;
//   }
//   public void print() {
//       System.out.println("Hello World");
//   }
//}
// class SingletonTest {
//    public static void main(String[] args) {
//        Singleton singleton = null ; // 声明对象
//            singleton = Singleton.getInstance() ;
//            singleton.print();
//    }
//}


//饿汉式单例模式
//class Singleton{
//    // 在类的内部可以访问私有结构，所以可以在类的内部产生实例化对象
//      private final static Singleton INSTANCE = new Singleton() ;
//      private Singleton() {
//          // private声明构造
//           }
//           public static Singleton getInstance() {
//          return INSTANCE ;
//      }
//      public void print() {
//          System.out.println("Hello World");
//      }
//      }
//
//class SingletonTest {
//     public static void main(String[] args) {
//         Singleton singleton = null; // 声明对象
//         singleton = Singleton.getInstance();
//         singleton.print();
//
//     }
// }

//饿汉式单例
//class Singleton{
//    private static Singleton instance ;
//    private Singleton() {
//        // private声明构造
//         }
//         public static Singleton getInstance() {
//        if (instance==null) {
//            // 表示此时还没有实例化
//                    instance = new Singleton() ;
//        }        return instance ;
//    }
//    public void print() {
//        System.out.println("Hello World");
//    }
//}
//class SingletonTest {
//    Object
//    public static void main(String[] args) {
//        Singleton singleton = null ; // 声明对象
//           singleton = Singleton.getInstance() ;
//           singleton.print();
//    }
//}

//懒汉式存在多线程安全问题，而饿汉式不会。）
//单例模式是一个重点，重点，重点。虽然代码量不大，但是概念用到的很多。

//单例设计模式
//class Test{
//    public static void main(String[] args) {
//        singleton s1=singleton.getinstance();
//        singleton s2=singleton.getinstance();
//        System.out.println(s1);
//        System.out.println(s2);
//
//    }
//}
//class singleton{
//
// private final static singleton per=new singleton();
//    private singleton (){};
//下面这个取得内部类实例对象的getinstance方法前面必须有类singleton修饰，否则编译会报错，java方法声明无效，需要返回
//类型
//    public  static singleton getinstance(){
//        return per;
//    }
//
//}



//单例设计模式
//class Singleton{
//    // 在类的内部可以访问私有结构，所以可以在类的内部产生实例化对象
//    static Singleton instance = new Singleton() ;
//    private Singleton() {
//        // private声明构造
//    }
//    public void print() {
//        System.out.println("Hello World");
//    }
//}
//class SingletonTest {
//    public static void main(String[] args) {
//        Singleton singleton = null ;
//        // 声明对象
//        singleton = Singleton.instance ;
//        singleton.print();
//    }
//}


//Integer的自动拆装箱  自java1.5之后引入了自动拆装箱
//class Test{
//    public static void main(String[] args) {
//        //自动装箱
//        Integer integer=10;
//        //自动拆箱
//        System.out.println(integer+10);
//    }
//}


//阿里面试题 ，判断interger的两个值是否相同
//class Test{
//    public static void main(String[] args) {
//        //引入常量池的概念，当Interger的值在[-127，128)之间时候，Interger不必开辟新的空间去给新的变量赋值，而是
//        //引入常量池的概念，直接从常量池中去找-218到127之间的值赋给新的变量，那么地址也必然是一样的
//        //equals比的是值的大小，==比较的是地址
//        Integer a=1279;
//        Integer b=1279;
//        System.out.println(a.equals(b));
//    }
//}

//写一个简单的工厂模式设计
//测试类
//class Test{
//    public static void main(String[] args) {
//
//    }
//
//}
//用接口实现

//interface Icomputer{
//     abstract void print(String per){};
//}
//class factory{
//
//}
//class lenovo implements Icomputer{
//    public lenovo get(String per){
//        lenovo per1=new lenovo();
//        String str="lenovo";
//
//        return per1.str;
//    }
//}
//class acer implements Icomputer{
//
//}
//class Deil implements Icomputer{
//
//}

//练习
//class Test{
//    public static void main(String[] args) {
//        tom per=new tom();
//        per.fangfa(6);
//        System.out.println(tom.n);
//
//    }
//}
//class tom{
//    static  Integer n=100;
//    public tom(){
//
//    }
//    public static Integer fangfa(Integer n){
//        //System.out.println(n);
//        //System.out.println(this.n);
//        //return this.n;
//        return 1;
//    }
//}




//验证静态方法可以不直接实例化对象，通过类来调用
//以及虽然通过主方法像构造方法里面传递参数，但是在类里面若定义了该属性的参数，那么this.属性的值依然还是类里面初始化的值


//