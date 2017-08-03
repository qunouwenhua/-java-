package test;

import java.util.ArrayList;
import java.util.List;

public class ListPage {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("no.1");
		list.add("no.2");
		list.add("no.3");
		list.add("no.4");
		list.add("no.5");
		list.add("no.6");
		list.add("no.7");
		list.add("no.8");
		list.add("no.9");
		list.add("no.10");
		List<String> subList = list.subList(0, 10);
		for (String string : subList) {
			System.out.println(string);
		}
		
	}
}
