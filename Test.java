//java ������д����ʵ�������������ת��
//class person {
//    public  void print() {
//        System.out.println("���ǰְ�");
//    }
//    }
//    class Student extends  person{
//        @Override
//        public void print() {
//
//            System.out.println("���Ƕ���");
//        }
//    }
//public class Test{
//    public static void main(String[] args) {
//         person per =new Student();
//            per.print();
//    }
//}


//76234�õݹ����
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

//��Ŀ�����ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ��
//�ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ��
//�Ժ�ÿ�����϶�����ǰһ��ʣ��   ��һ����һ��������10���������ٳ�ʱ����ֻʣ��һ�������ˡ�
//���һ�칲ժ�˶��١�
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

//����2 ѭ��
//public class Test {
//    public static void main(String[] args) {
//        int sum = 0, remain = 1;
////ÿ���ʣ�����Ӽ�һ��������ǰһ�����ӵ�һ�룬ÿ�����ӵ���������ǰһ��ʣ�����ӵ�����
//        for (int day = 9; day >= 1; day--) {
//            sum = (remain + 1) * 2;
//            remain = sum;
//            System.out.println("��" + day + "�컹ʣ" + remain + "������");
//        }
//        System.out.println(sum);
//    }
//}

//���󷽷���ָ����������δʵ�ֵķ�������ֻ����������ͨ����Ļ�����������һЩ��������ˣ�û�з����壬�����ڵ����кͷ�����Ҫ
//��abstract������
//�����಻���������������һ��������������ȡ���־��������Եľ�������Ĺ�ͬ������������
// ���磬helicoptor, jet, fighter����plane����start(),takeOff(),speedUp(),changeDirection()�ȷ�����
// ���ǹ��ԣ�����ʵ����һ�������plane��û�У����ǳ�������ģ����������ڡ�����ʵ����һ��plane��û������ģ�
// ���������������ƻ��ƽ�ֹ����ʵ�������������н�ֹʵ��������
//������һ��������final��������Ϊfinal���������࣬��������һ���������࣬��Ӧ�ģ����󷽷�Ҳ���ܺ���private������
//��Ϊprivate���εķ������ܱ���д�������󷽷���һ��Ҫ����д
//private��abstract����ͬʱʹ��
//��������������࣬������������¸�д�ó�����ĳ��󷽷������������Person������Student��
// Person per=new Student��),per.fun(ʵ�������࣬����ת�ͣ�
//��ͨ���������з���ֵҲ����û�з���ֵ�������췽��һ��û�з���ֵ��Ҳû��static��final��abstract�ȴʵ����Σ�
// ��Ϊ�вι�����޲ι���
//abstract class Test {
//    private String name; // ����
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


//java�е�����
//import java.util.Scanner;
//public class Test {
//    public static void main(String[] args) {
//        custom();
//    }
//
//    public static boolean custom()
//
//    {
//        System.out.println("����Ҫ�������� y����Ҫ  n������Ҫ");
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        if (str.equalsIgnoreCase("y")) {
//
//            System.out.println("�ͻ���Ҫ����");
//            return true;
//        } else if(str.equalsIgnoreCase("n")){
//            System.out.println("�ͻ�ʲô������");
//            return false;
//        }
//        else{
//            System.out.println("�Ƿ����룡");
//            return false;
//        }
//
//    }
//
//}

//����ģʽ ģ�����
//interface ISubject {
//    //����ҵ���������
//    void buyComputer();
//}
//
////��ʵҵ��, �൱��ʵ����Ҫ����Ŀͻ�
//class RealSubject implements ISubject {
//    public void buyComputer() {
//        System.out.println("2.��һ̨mac���ԣ�����");
//    }
//}
//
////������ʵҵ���ʵ��, �൱�ڴ���
//class ProxySubject implements ISubject {
//    //������ǽӿڶ���
//    private ISubject subject;
//    //������ʵҵ�����
//    public ProxySubject(ISubject subject) {
//        this.subject = subject;
//    }
//
//    public void beforeBuyComputer() {
//        System.out.println("1.������ƻ�����Ŷ�");
//    }
//    public void afterBuyComputer() {
//        System.out.println("3.�����Կ�ݻؿͻ�����");
//    }
//
//    //ҵ������
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


//�򵥵�ʵ��������ֱ�Ӹ�ֵ
//class Test{
//    public static void main(String[]args){
//        Person person=new Person();
//        person.name="�κ�Դ";
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
//        System.out.println("����:"+name );
//            System.out.println("����:"+age);
//            System.out.println("��н:"+salary);
//        }
//
//        }
//


//getter setter�÷�

//class Test{
//    public static void main(String[]args){
//        Person person=new Person();
//        person.age=22;
//        person.setName("�κ�Դ");
//        person.setSalary(390000);
//
//        System.out.println("����Ϊ:"+person.getName());
//        System.out.println("����Ϊ:"+person.age);
//        System.out.println("��нΪ:"+person.getSalary());
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



//���ⲿ��ĵ���
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
//         int y = 3;//���벻����1.static finally 2.int y=3
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


//��ӡ100-999ˮ�ɻ���
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



//�ó�����ģ���ǰͿ˿��Ȼ���������
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
//            System.out.println("�տ�ˮ");
//    }
//        abstract  void receipt();
//      private  void jiaoban(){
//            System.out.println("��������");
//        }
//
//        void dicha(){
//            System.out.println("�����е�����");
//        }
//    }
//    class coffee extends beverage{
//          void shaoshui(){
//            System.out.println("�տ�ˮ");
//
//        }
//         void receipt() {
//             System.out.println("��һ�����ƿ��ȷ�");
//         }
//
//         public static boolean custom(){
//
//             //String a=null;
//             //System.out.println(a);
//            System.out.println("��Ҫ��ţ����");
//            Scanner scanner=new Scanner(System.in);
//            String str=scanner.nextLine();
////             Scanner scanner1=new Scanner(System.in);
////             String str1=scanner1.nextLine();
//            // String str1=null;
////             System.out.println(str1.equals(null));
//
//            if(str!=" "&&str==null&&str.equalsIgnoreCase("y")){
//                System.out.println("��һ��ţ��");
//                return true;
//            }
//            else if (str.equalsIgnoreCase("n")){
//                System.out.println("�ͻ�����Ҫ��ţ��");
//                return false;
//            }
//            else{
//                System.out.println("�Ƿ�����");
//                return false;
//            }
//
//        }
//        void jiaoban(){
//            System.out.println("��������");
//        }
//        void dicha(){
//            System.out.println("�����еݿ���");
//        }
//    }




//����ģʽ ģ�����
//interface ISubject {
    //����ҵ���������
  //  void buyComputer();
//}

//��ʵҵ��, �൱��ʵ����Ҫ����Ŀͻ�
//class RealSubject implements ISubject {
//    public void buyComputer() {
//        System.out.println("2.��һ̨mac���ԣ�����");
//    }
//}
//
////������ʵҵ���ʵ��, �൱�ڴ���
//class ProxySubject implements ISubject {
//    //������ǽӿڶ���
//    private ISubject subject;
//    //������ʵҵ�����
//    public ProxySubject(ISubject subject) {
//        this.subject = subject;
//    }
//
//    public void beforeBuyComputer() {
//        System.out.println("1.������ƻ�����Ŷ�");
//    }
//    public void afterBuyComputer() {
//        System.out.println("3.�����Կ�ݻؿͻ�����");
//    }
//
//    //ҵ������
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


//���� ��aj

//interface Isubject{
//    void buyAJ();
//}
//class realsubject implements Isubject{
//    public void buyAJ(){
//        System.out.println("��һ˫AJ���ڴ���ƽ̨����");
//    }
//}
//
//class proxysubject implements Isubject{
//    private Isubject subject;
//    //����Ҳ��һ��������������������ͬ���൱�ڹ��췽����û�з���ֵ��������voidҲû�У��൱��new
//   public    proxysubject(Isubject subject){
//        this.subject=subject;
//
//    }
//
//
//   public void beforebuy(){
//            System.out.println("ȥ����AJר�����Ŷӳ��");
//        }
//public void afterbuy(){
//    System.out.println("��ݵ��ͻ�����");
//    }
//    //�����м�һ�����̷���һ��Ҫ��buyAJ����ʽ�������������ַ�����������
//    //������������ʵ�ͻ������нӿڣ����нӿ�ֻ�Ƕ�����һ����Ϊ����ķ������÷�������ʵ�ͻ�ȥ��д�������ڴ�������ȥ���Ʒ���
//    //Ҳ����Ҫ�ڴ�����ȥ����ʵ�ַ��������д���ʵ��������ͨ��������Ĺ��췽������ʵ�������У�����Ҫ�ڴ�����privateһ���ӿڵĵ�
//    // ����Ȼ���ٽ���������ʵ�������Ķ��󴫵ݸ�����this .�ӿڶ���=ʵ�������ⶼ���ڴ���Ĺ��췽���д���ģ����췽���Ĳ���
//    //�б��ڣ��β��� �ӿ�.��������,һ��������ʵ������Ϳ����ڴ�������ȥ���塰��������,Ҳ���Ǿ��� �ӿڶ��巽��->��ʵ�����ķ���->������
//    //�������� buy something����.
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


//        ����һ�������"Role"�࣬�����������䣬�Ա�ȳ�Ա����
//        1��Ҫ�󾡿����������б���(�ܹ�˽�о�˽��,�ܹ������Ͳ�Ҫ����)��
//        ��ͨ��GetXXX()��SetXXX()�����Ը��������ж�д������һ�������play()������
//        �÷����������κ�ֵ��ͬʱ���ٶ����������췽����Role����Ҫ���ֳ�this�ļ����÷���
//        2����Role��������һ��"Employee"�࣬�������Role������г�Ա�����췽�����⣩��
//        ����չsalary��Ա������ͬʱ����һ����̬��Ա������ְ����ţ�ID������
//        ͬ��Ҫ�������������췽����Ҫ���ֳ�this��super�ļ����÷�����Ҫ�󸲸�play()������
//        ���ṩһ��final sing()������
//        3��"Manager"��̳�"Employee"�࣬��һ��final��Ա����"vehicle"
//        ��main()����������Manager��Employee����,��������Щ����ķ�����
//this ���������ԣ��������ԣ����÷�������ʾ��ǰ����



//abstract class Role
//{
//    private String name;
//    private int age;
//    private String sex;
//    public Role()
//    {
//        System.out.println("******Role���췽��1*****");
//    }
//    public Role(String n)
//    {
//        System.out.println("*******Role���췽��2*****");
//        System.out.println(n + this);
//    }
//    public void setName(String name) {
//        this.name = name;//this���ñ�������
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
//        System.out.println("������"+name+" ���䣺 "+age + "  �Ա�"+sex);
//    }
//    public abstract void play();
//}
//class Employee extends Role
//{
//    private int  salary;
//    static int ID;
//    public Employee()
//    {
//        System.out.println("******Employee���췽��1*****");
//    }
//    public Employee(int x)
//    {
//        this();//this���ñ��෽��
//        System.out.println("******Employee���췽��2*****");
//        this.salary = x;
//        System.out.println("salary is " +salary);
//    }
//    public void Role(String n,int a )
//    {
//        this.ID = a;
//        System.out.println("*******���าдRole���췽��2*****");
//        System.out.println(n + this);//this��ǰ����
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
//        per.setName("����");
//        per.setAge(33);
//        per.setSex("��");
//        per.getPersonInfo();
//        per.Role("six",11111111);
//        per.play();
//        per.sing();
//    }
//}


//��ϰ
//class Test{
//
//    public static void main(String[] args) {
//
//        city acity=new city();
//        acity.country("����");
//        acity.tary();
//
//    }
//}
// abstract class country{
//    private String country1="Ӣ��";
//  String country2="�й�";
//    //�������ϻ����ţ���ᱻ��ʾΪȱ�ٷ����壬����Ӧ�����������δ�abstract
//     void  country(){
//
//     }
//     void tary(){
//         System.out.println(country1);
//     }
//
////�����������Ϊprivate˽�еĻ�����ô�����Ա㲻���Ա��������
//}
//class city extends country{
//    String city1="�׶�";
//    String city2="����";
//
//    //����private�����Ժͷ���������Լ̳е��ǲ��ܷ��ʺ���д�������࿪�ٵ�ʱ���ڴ�����һ���ռ���������ⲿд��
//    //��������Ժͷ���������˽�����Ժ�˽�з�������������ڲ��ռ�д�����Լ������Ժͷ��������߼���һ��͹��������������
//    //����Ҳ����ͨ������ķ���������������˽�����ԣ���ǰ���Ǹ��෽���б���Ͱ�����˽�����Ժ�˽�з����Ļ������Ҹ÷�����������˽�е�
//    //�����ø����public���������ʹ����˽������
//        void tary(){
//
//        super.tary();
//    }
//
//
//    void country(String acity) {
////����ֱ�Ӹ�ֵcity1��2��ֵ������h��Ҳ����ͨ��super.country1,2�ķ��������ø��������
//String h=super.country2;
//        System.out.println(acity);
//        System.out.println(super.country2);
//    }
//}


//�ӿڵ����δ�Ĭ����public����Ϊ�ӿھ�����Ҫ����ʵ�ֲ������壩��������������δ�Ȩ�޲���С��public���������෽����ֻ����public
////�ӿڵĴ�дIһ��Ҫ��ȷ
////�ӿ��е����Զ�����ʵ����ֻ��һ������Ҫ��static��Ҳ���ǽӿ���ֻ���г����������ֱ����������ñ����ȥ�޸ģ���������static��final��
////����
////�ӿ��µ����ຯ��������public
////private �ӿ� �ӿڶ���
////
//interface Isubject{
//    void buyadidas();
//}
//class realsubject implements Isubject{
//    public void buyadidas(){
//        System.out.println("��һ˫���ϴ�˹���ڴ���ƽ̨����");
//    }
//
//}
//class proxysubject implements Isubject{
//    private Isubject subject;
//
//    //�˴����ܼ�void
//    //��Ϊ��ʱthis�൱�ڷ���ֵ��������ֵ���ܼ�this
//    //�ٶȣ�
//
//    //���ص��ǵ���this�����������Ǹ���������ã�
//    //
//    //  һ�������Ļ��������ǡ����ص������á���
//    //
//    //  ʲô�����أ����Ǹ���������á���
//    //
//    //  �ĸ������أ������÷������Ǹ����󡱣�
//    //
//    //  ���õ��ĸ������أ������õ���this��λ�ڵķ�����������������ˡ�
//    //
//    //  ���ܽ�һ�¾��ǣ�this��Ϊ����ֵʱ�����ص��ǵ���ĳ�����Ķ�������ã�
//    // ����������ǰ�����return this;������������Ǹ����������򵥵�˵��
//    // ����˭���÷��صľ���˭�����ڷ��ص��Ƕ������ã�
//    // ����this�������ھ�̬��Ա�����У�ֻ���ڷǾ�̬��Ա�����г���
//    //https://www.cnblogs.com/chanchan/p/7812166.html
//   public    proxysubject(Isubject subject){
//        this.subject=subject;
//    }
//  public void beforebuy(){
//       System.out.println("ȥ���ϴ�˹ר�����Ŷ�");
//
//    }
//   public void afterbuy(){
//        System.out.println("��ݸ��ͻ�");
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


//this ��ʾ��ǰ����
//class Person{
//public void print(){
//    System.out.println("[PRINT]������"+this);
//}
//}
//public class Test {
//    public static void main(String[] args) {
//        Person p1 = new Person();
//        System.out.println("[MAIN]������" + p1);
//        p1.print();
//        System.out.println("=================");
//        Person p2 = new Person();
//        System.out.println("[MAIN]������" + p2);
//        p2.print();
//    }
//}
//ʹ��static���εķ���������ֱ���ö���.����static���η��ķ�������������
//static���εķ������ܷ��ʷ�static�ķ���������
//���Է�satic�ķ������Է���static���ε����Ի��߷���


//쳲���������
//0 1 1 2 3 5 8
//n=(n-1)+(n-2)
//��ӡ20����쳲���������
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


//����java�ӿ�ʵ�ּ�������ʵ�ּӼ��˳��Ĺ���
//import java.util.Scanner;
//class Test {
//    public static void main(String[] args) {
//        fun i = new fun();
//        jiafa s1 = new jiafa();
//        jianfa s2 = new jianfa();
//        chengfa s3 = new chengfa();
//        chufa s4 = new chufa();
//        System.out.println("��������Ҫ�������������:");
//        Scanner scanner = new Scanner(System.in);
//        Scanner scanner2 = new Scanner(System.in);
//        int str = scanner.nextInt();
//        int str2 = scanner2.nextInt();
//        int a = str;
//        int b = str2;
//        System.out.println("����������Ҫ����ķ�ʽ(+��-��*��/):");
//        Scanner scanner3 = new Scanner(System.in);
//        String zifu1 = scanner3.next();
//        //next()���ܶ�ȡ�ո�nextline()���Զ�ȡ
//        //��ʵ���ַ����ڵ�����ʱ���Ҹ��˸�ϲ��ѡ��ʹ��ɨ����Scanner�������������Ƚϼ򵥡�
//        // ��д��ҵ�Ĺ����У��ҷ�����Scannerʵ���ַ��������������ַ�����һ����next������
//        // һ��nextLine(),���������ַ���������ʲô�����أ�
//        // ���ȣ�next����һ��Ҫ��ȡ����Ч�ַ���ſ��Խ������룬��������Ч�ַ�֮ǰ�����Ŀո����Tab����Enter���Ƚ�������
//        // next�����������Զ�����ȥ����ֻ����������Ч�ַ�֮��next���������Ž��������Ŀո����
//        // Tab����Enter������Ϊ�ָ�������������򵥵�˵��next�������Ҳ��������Դ�ɨ��������һ��������ǡ�
//        // ������ǵ�ǰ������ָ�ģʽƥ���������Ϣ��
//        // ����next�������ܵõ����ո���ַ�����nextLine���������Ľ�����ֻ��Enter����
//        // ��nextLine�����������ص���Enter��֮ǰ�������ַ������ǿ��Եõ����ո���ַ����ġ�
//        //nextLine�����Զ���ȡ�˱�next����ȥ����Enter��Ϊ���Ľ�����������û�취��s2�Ӽ�������ֵ��
//        // ������֤��������next�ķ�������double nextDouble()  ��
//        // float nextFloat() �� int nextInt() ����nextLine��������ʱ������������⣬
//        // ����İ취�ǣ���ÿһ�� next������nextDouble()  �� www.gzlij.com������nextFloat()��nextInt()
//        // �����֮���һ��nextLine������䣬����next����ȥ����Enter���������˵�
//        scanner3.nextLine();
//        while(true) {
//            if (zifu1.equals("+")) {
//
//                System.out.print("�ӷ����:");
//                i.func(s1, a, b);
//                break;
//
//            } else if (zifu1.equals("-")) {
//                System.out.print("�������:");
//                i.func(s2, a, b);
//                break;
//
//            } else if (zifu1.equals("*")) {
//                System.out.print("�˷����:");
//                i.func(s3, a, b);
//                break;
//            } else if (zifu1.equals("/")) {
//                System.out.print("�������:");
//                i.func(s4, a, b);
//                break;
//
//            }
//            else {
//                System.out.println("�Ƿ�����!");
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

//һ������У����
//class HelloA {
//
//       public HelloA(){
//           System.out.println("Hello A!���๹�췽��");
//       }
//
//      {        System.out.println("i'm A class.����Ǿ�̬�����");
//
//
//      }
//      static{
//           System.out.println("static A ���ྲ̬�����");
//       }
//}
//
//     class HelloB extends HelloA {
//        public HelloB(){
//            System.out.println("Hello B! ���췽��");
//        }
//        {
//            System.out.println("i'm B class.�Ǿ�̬�����");
//        }
//        static{
//            System.out.println("static B ��̬�����");
//        }
//        public static void main(String[] args) {
//            System.out.println("---start---");
//            new HelloB();
//            new HelloB();
//            System.out.println("---end---");
//        }
//}
//

//ʵ�֣��Ƚϼ��ִ�����ִ��˳����ͨ����飬������飬��̬�����
//class A{
//    public  A(){
//        System.out.println("A.��ͨ�����");
//    }
//    {
//        System.out.println("A.�����");
//    }
//    static {
//        System.out.println("A.��̬��");
//    }
//
//}
//class B extends A{
//    public void B(){
//        System.out.println("B.��ͨ�����");
//    }
//    {
//        System.out.println("B.�����");
//    }
//    static {
//        System.out.println("B.��̬��");
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


//���ⲿ�࣬�۲��ӡ˳��
//class Outer {
//    private String msg = "Hello World";
//
//    static {
//        System.out.println("�ҵ�һ����ӡ");
//    }
//
//    public Outer() {
//        System.out.println("������");
//    }
//
//    {
//        System.out.println("���");
//    }
//    public void he(){
//        System.out.println("�ǺǺ�");
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
//        System.out.println("�ڼ���������֮ǰ");
//    }
//        {
//            System.out.println("������");
//        }
//    public  Inner(Outer out){
//        this.out = out ;
//        System.out.println("����������");
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


//ֵ����

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

//���ô���
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



//ͨ������ʵ��ֵ֮��Ľ���
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
////��ӡ�������������������ֵ���������β��޹�
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//
//    }
//}


//ͨ�����齻����ֵ
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
//       //����Ĵ���ʱ���벻���ģ��β��е��������β����ں���ִ����Ϻ󣬱㱻java�����ڴ����վ������
//        //�˴������������飬��ͨ�������βκ�������ʵ�����������ڵ�����ֵ��
//       // System.out.println(d[0]);
//        //System.out.println(d[1]);
//
//    }
//}

////java ֵ���ݣ���������������ֵ��û�гɹ�
//public class Test {
//
//    //��������������ֵ
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

//ͨ������ ��ֵ�Ľ���

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
//        System.out.println("����ֵ֮ǰ��"+test.x);
//        change(test, 4);
//        System.out.println("����ֵ֮��"+test.x);
//    }
//    public static void change(Te test1,int x){
//        test1.x=x;
//    }
//}


//�۲�������󴴽���ע��ִ��˳��
//class Person{
//
//    public Person(int i){
//        System.out.println(i);
//         i=0;
//        System.out.println("**Person��������**");
//        i++;
//        System.out.println(i);
//    }
//}
//class Student extends Person{
//    public Student(int i){
//      super( i) ; //���޲���ʱ����������޲�ʱд�ڲ�дһ��ע�⣺
// //ʵ����������Ĺ��췽��֮�У��൱��������һ����� super();
// //ͬʱ��Ҫע����ǣ����������û���ṩ�޲ι��죬
// //��ô���ʱ��ͱ���ʹ��super()��ȷָ����Ҫ���õĸ��๹�� ����
//               System.out.println("**Student��������**");
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
//�������ִ��˳��
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


//*****������д��������д�ķ����������ͣ����ƣ���������������ȫ��ͬ��ͬʱ��д�����ķ���Ȩ�޲��ܱȸ�����ϸ�


//������д��������û�б���private�ʻ����Σ���ô��ȥ�ͽ�ԭ��ѡ��ͽ������ǵ�����
//class Person{
//    public String info = "Person";
//}
//
//class Student extends Person{
//    // ���վͽ�ȡ��ԭ�򣬿϶��ұ����ǵ����ԡ�
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
//    //�������ϸ�����������ֿ������в��ǹ��췽����
//    // ����û�� new student();->public Student(){}->super()->public Person(){}
//    //����д������ new student().print()->public void print(){}->super.print()
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


//*super���ø�������
//class Person{
//    public String info = "�ְ֣�";
//}
//
//class Student extends Person{
//    public String info = "���ӣ�" ;
//
//    public void print(){
//        //���ұ����е�����
//             System.out.println(super.info);
//             System.out.println(this.info);
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        new Student().print();
//    }
//}



//***��Java��final����Ϊ�ս�����
//***ʹ��final�����ࡢ���������� final��Ա����������������ʱ���ʼ�������ڹ������г�ʼ����
//***����ͻᱨ������� ʹ��final������಻��������(String�����ʹ��final����) finalһ������һ����֮��
//***��������з���Ĭ�϶����nal���Ρ�(��������Ա����)


////�ӿ�Person
//
// interface Person {
//    public void eat();
//}
//
////ʵ����People
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
//////����xiaoming��
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
//////������
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

//���ִ��˳��
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


//���⣬������Ҳ��Ϊ�ⲿ��������ڲ������࣬�ⲿ�������޷���static�����Σ����ڲ������������static������

//ģ�����ģʽ��ocpԭ�򣬿���ԭ���Կ��Ȼ�����Ϊ��

//final��ʾ���յ���˼�������ε����ǲ��ܱ��̳еģ�final���εķ����ܱ��̳У�Math������У���
// ���ǲ��ܹ�����д����ʵ��ϵ�������ӣ���ֻ��Ҫ��ס����һ�仰��final�������������ԡ��������࣬
// �ֱ��ʾ���Բ��ɱ䣬����������д���಻�ɼ̳С�
//����final���εķ������Ա���������
//��������ת��Ϊ����ʵ��������������าд�˸���ķ�������ʵ�����������������ķ��������û�и�д����ķ���
//��ʹ�ø���ķ���


//����1
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


//����2
//3.������Ҫ���дJava����
//        ��1������ӿ�A���������ֵΪ3.14�ĳ���PI�ͳ��󷽷�double area()��
//        ��2������ӿ�B������������󷽷�void setColor(String c)��
//        ��3������ӿ�C���ýӿڼ̳��˽ӿ�A��B������������󷽷�void volume()��
//        ��4������Բ������Cylinderʵ�ֽӿ�C�������а���������Ա��������Բ�뾶radius��
//        Բ����ĸ�height����ɫcolor��
//        ��5������������������Cylinder��
//import java.util.Scanner;
//class Test {
//    public static void main(String[] args) {
//        fangfa i = new fangfa();
//        Cylinder s1 = new Cylinder();
//        Cylinder s2 = new Cylinder();
//        Cylinder s3 = new Cylinder();
//
//        System.out.print("�ݻ�:");
//        i.shixian(s1, 5.0, 6.0);
//        System.out.print("���:");
//        i.shixian1(s2, 5.0);
//        System.out.println("����Ҫʲô��ɫ��������");
//        Scanner scanner = new Scanner(System.in);
//        //nextine�е�Lע���д
//        String str1 = scanner.nextLine();
//        String color = str1;
//        while (true) {
//            if (str1.equals(null)) {
//                System.out.println("��������");
//                continue;
//            } else {
//
//                System.out.print("����Ҫ:");
//                //��str���������ַ���������Ҫ��˫���Ž�����������
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


//**������ķ�����final��������Ϊ���������า���������

////�Զ����쳣��
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
//            throw new AddException("��������");
//
//        }
//    }
//
//}

//catch(Exception e){e.printStackTrace()}


//����ģʽ
//class Singleton{
//    // ������ڲ����Է���˽�нṹ�����Կ���������ڲ�����ʵ��������
//   private static Singleton instance = new Singleton() ;
//   private Singleton() {
//       // private��������
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
//        Singleton singleton = null ; // ��������
//            singleton = Singleton.getInstance() ;
//            singleton.print();
//    }
//}


//����ʽ����ģʽ
//class Singleton{
//    // ������ڲ����Է���˽�нṹ�����Կ���������ڲ�����ʵ��������
//      private final static Singleton INSTANCE = new Singleton() ;
//      private Singleton() {
//          // private��������
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
//         Singleton singleton = null; // ��������
//         singleton = Singleton.getInstance();
//         singleton.print();
//
//     }
// }

//����ʽ����
//class Singleton{
//    private static Singleton instance ;
//    private Singleton() {
//        // private��������
//         }
//         public static Singleton getInstance() {
//        if (instance==null) {
//            // ��ʾ��ʱ��û��ʵ����
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
//        Singleton singleton = null ; // ��������
//           singleton = Singleton.getInstance() ;
//           singleton.print();
//    }
//}

//����ʽ���ڶ��̰߳�ȫ���⣬������ʽ���ᡣ��
//����ģʽ��һ���ص㣬�ص㣬�ص㡣��Ȼ���������󣬵��Ǹ����õ��ĺܶࡣ

//�������ģʽ
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
//�������ȡ���ڲ���ʵ�������getinstance����ǰ���������singleton���Σ��������ᱨ��java����������Ч����Ҫ����
//����
//    public  static singleton getinstance(){
//        return per;
//    }
//
//}



//�������ģʽ
//class Singleton{
//    // ������ڲ����Է���˽�нṹ�����Կ���������ڲ�����ʵ��������
//    static Singleton instance = new Singleton() ;
//    private Singleton() {
//        // private��������
//    }
//    public void print() {
//        System.out.println("Hello World");
//    }
//}
//class SingletonTest {
//    public static void main(String[] args) {
//        Singleton singleton = null ;
//        // ��������
//        singleton = Singleton.instance ;
//        singleton.print();
//    }
//}


//Integer���Զ���װ��  ��java1.5֮���������Զ���װ��
//class Test{
//    public static void main(String[] args) {
//        //�Զ�װ��
//        Integer integer=10;
//        //�Զ�����
//        System.out.println(integer+10);
//    }
//}


//���������� ���ж�interger������ֵ�Ƿ���ͬ
//class Test{
//    public static void main(String[] args) {
//        //���볣���صĸ����Interger��ֵ��[-127��128)֮��ʱ��Interger���ؿ����µĿռ�ȥ���µı�����ֵ������
//        //���볣���صĸ��ֱ�Ӵӳ�������ȥ��-218��127֮���ֵ�����µı�������ô��ַҲ��Ȼ��һ����
//        //equals�ȵ���ֵ�Ĵ�С��==�Ƚϵ��ǵ�ַ
//        Integer a=1279;
//        Integer b=1279;
//        System.out.println(a.equals(b));
//    }
//}

//дһ���򵥵Ĺ���ģʽ���
//������
//class Test{
//    public static void main(String[] args) {
//
//    }
//
//}
//�ýӿ�ʵ��

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

//��ϰ
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




//��֤��̬�������Բ�ֱ��ʵ��������ͨ����������
//�Լ���Ȼͨ�����������췽�����洫�ݲ������������������������˸����ԵĲ�������ôthis.���Ե�ֵ��Ȼ�����������ʼ����ֵ


//