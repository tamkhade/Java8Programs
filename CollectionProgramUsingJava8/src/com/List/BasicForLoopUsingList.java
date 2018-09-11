package com.List;

import java.util.ArrayList;
import java.util.List;

public class BasicForLoopUsingList 
{
	public static void main(String[] args)
	{
		List<String> userNameList = new ArrayList<String>();
		userNameList.add("Ellen");
		userNameList.add("mahesh");
		userNameList.add("dada");
		userNameList.add("pravin");
		
		for(String s : userNameList)
		{
			System.out.println("name of employee "+s);
		}
		
		
	}
	
	
}
