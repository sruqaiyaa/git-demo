import java.util.*;
public class ObjectClass {

	public static void main(String[] args) {
		
		Mobile obj1=new Mobile("samsung","black");
		Mobile obj2=new Mobile("lg","pink");
		Mobile obj3=new Mobile("realme","blue");
		Mobile obj4=new Mobile("vivo","white");
		Mobile obj5=new Mobile("redmi","purple");
				
		TreeSet<Mobile> set=new TreeSet<Mobile>();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		set.add(obj4);
		set.add(obj5);
		System.out.println(set+"set");
		

	}

}


