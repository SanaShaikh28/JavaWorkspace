package com.bridgeit.suppress;

import java.util.ArrayList;
import java.util.List;

public class Test {

	//While using non Generic type it gives warning so use @annotation to avoid warning
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		List list=new ArrayList();
		list.add("Jupiter");
		list.add("Mercury");
		list.add("MArs");
		list.add("Venus");
		
		System.out.println(list);

	}

}
