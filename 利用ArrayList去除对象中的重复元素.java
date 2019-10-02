【需求】：存入对象到ArrayList集合中，去除对象中的重复元素

                  对象：Person
                  条件：同名同年龄视为同一对象

【分析】：

首先判断姓名，姓名不同则为不同元素。

如果姓名相同，则判断年龄，如果年龄相同，则为同一元素；反之，为不同元素。

实现——原集合为集合1，新集合为集合2

 创建新的集合2，将集合1中的元素加入集合2中，在此过程中进行判断，判断集合2中是否包含有即将添加的元素。如果不包含就加入集合。
 此时，我们需要知道的是，判断相不相同的条件是姓名和年龄两个条件。这时，我们要看到的是contains方法的底层实现是通过equals方法，
 所以我们需要重写equals方法。
 
 
 
 【代码实现】
 
import java.util.*;
class ArrayListDemo2 
{
	public static List singleElement(ArrayList list){
		ArrayList newList=new ArrayList();
		Iterator it=list.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			if(!newList.contains(obj)){
				newList.add(obj);
			}
		}
		return newList;
	}
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(new Person("狄仁杰",45));
		al.add(new Person("元芳",40));
		al.add(new Person("夏洛克",33));
		al.add(new Person("包拯",56));
		al.add(new Person("夏洛克",33));
		al=(ArrayList)singleElement(al);
		Iterator it=al.iterator();
		while(it.hasNext()){
			Person p=(Person)it.next();
			System.out.println(p.getName()+"............"+p.getAge());
		}
	}
}
 
class Person
{
	private String name;
	private int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	//关键性重写equals方法
	public boolean equals(Object obj){
		if(!(obj instanceof Person)){
			throw new RuntimeException("加入的元素不是Person类对象");
		}
		Person p=(Person)obj;
		return this.name.equals(p.name)&&this.age==p.age;
	}
}
