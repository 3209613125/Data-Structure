//设置泛型下限此时可以修改set别的值
//下限只能用在方法参数，可以修改内容
//? super String，表示只能够设置String及其父类Object
```
class test{
    public static void main(String[] args) {


        fanxing<String,Integer> x=new fanxing<>();
        x.setName("何浩源");
        x.setAge(21);
        fun(x);

    }
    public static void fun(fanxing<?  super String,Integer>temp){
        temp.setName("何浩源是superman");
        temp.setAge(22);
        System.out.println(temp.getName());
        System.out.println(temp.getAge());
    }
}
class fanxing<T,E>{
    private T name;
    private E age;

    public void setAge(E age) {
        this.age = age;
    }

    public E getAge() {
        return age;
    }

    public void setName(T name) {
    this.name = name;
}

    public T getName() {
        return name;
    }
}
```
//泛型上限
//：? extends Number，表示只能够设置Number或其子类，例如：Integer、Double等
class test{
    public static void main(String[] args) {


        fanxing<Integer> x=new fanxing<>();
        x.setAge(21);
        fun(x);

    }
    public static void fun(fanxing<?  extends Number>temp){
        //泛型上限无法用set进行修改
        //temp.setAge(22);
        System.out.println(temp.getAge());
    }
}
class fanxing<T extends Number>{
    private T age;

    public void setAge(T age) {
        this.age = age;
    }

    public T getAge() {
        return age;
    }

}

//泛型接口
//泛型除了可以定义在类中，也可以定义在接口里面，我们称之为泛型接口
interface Imessage<T>{
    public void print(T t);

}
//对于这个接口的实现子类有两种做法
// 范例：在子类定义时继续使用泛型

interface Imessasge<T>{
    public  void print(T t);
}
class Message<T> implements Imessasge<T>{
    public void print(T t) {
        System.out.println(t);
    }
}
class Test{
    public static void main(String[] args) {
        Imessasge<String>msg=new Message();
        msg.print("我爱你中国");
    }
}

//范例：在子类实现接口的时候明确给出具体类型

interface IMessage<T> {
    // 在接口上定义了泛型
      public void print(T t) ;
}
class MessageImpl implements IMessage<String>{

    @Override
    public void print(String t) {
        System.out.println(t);
    }
}
 class Test {
    public static void main(String[] args) {
        IMessage<String> msg = new MessageImpl() ;
        msg.print("你好中国");
    }
}


//类型擦除
//泛型是 Java 1.5 版本才引进的概念，在这之前是没有泛型的概念的，
// 但显然，泛型代码能够很好地和之前版本的代码很好地兼容。
//这是因为，泛型信息只存在于代码编译阶段，在进入JVM之前，与泛型相关的信息会被擦除掉，专业术语叫做类型擦除。
//通俗地讲，泛型类和普通类在java虚拟机内是没有什么特别的地方
class fanxing<T>{
    private T msg;
    public T getMsg() {
        return msg;
    }
    public void setMsg(T msg) {
        this.msg = msg;
    }
}

class Test{

    public static void main(String[] args) {
        fanxing<String> x=new fanxing<>();
        fanxing<Integer> y=new fanxing<>();
        //getClass() Class<? extends fanxing>
        System.out.println(x.getClass()==y.getClass());
    }
}
//打印的结果为 true 是因为 MyClass<String> 和 MyClass<Integer> 在 JVM 中的 Class 都是 MyClass.class


//观察类型擦除
import java.lang.reflect.Field;

class MyClass<T,E>{
    private T message;
    private E text;
    public E getText() {
        return text;
    }
    public void setText(E text) {
        this.text = text;
    }
    public T getMessage() {
        return message;
    }
    public void setMessage(T message) {
        this.message = message;
    }
    public void testMethod1(T t) {
        System.out.println(t);
    }
}
class Test {
    public static void main(String[] args) {
        MyClass<String,Integer> myClass1 = new MyClass<>();
        Class cls = myClass1.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType());
        }
    }
}
