import java.util.*;
import java.util.Scanner;
public class ArraysTo {

	public static void main(String[] args) {
		String[] arr= {"banana","mango","apple","orange","avacado"};
		List<String>list=new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		SortedSet<String> set=new TreeSet<String>();
		list.addAll(set);
		for(int i=0;i<list.size();i++) {
			set.add(list.get(i));
		}
		System.out.println(set);
	}

}
