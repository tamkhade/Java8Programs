package com.List;

import java.util.ArrayList;
import java.util.List;

public class Java8ForLoop 
{

	public static void main(String[] args)
	{
		List<String> userNameList = new ArrayList<String>();
		List<String> addUserList = new ArrayList<String>();
		userNameList.add("Ellen");
		userNameList.add("mahesh");
		userNameList.add("dada");
		userNameList.add("pravin");
		userNameList.forEach(name -> addUserList.add(name));
		addUserList.forEach(userName -> System.out.println(userName));
	}
}
