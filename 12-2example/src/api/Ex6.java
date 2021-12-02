package api;

import java.util.TreeSet;

public class Ex6 {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		
		names.add("Daniel");
		names.add("Brian");
		names.add("Eugene");
		names.add("Adam");
		names.add("Cate");
		
		System.out.printf("name.size() -> %d\n",names.size());
		System.out.printf("name.first() -> %s\n",names.first());
		System.out.printf("name.last() -> %s\n",names.last());
		
		System.out.println("===for each 구문 출력===");
		for(String str : names) {
			System.out.println(str);
		}
	}

}
