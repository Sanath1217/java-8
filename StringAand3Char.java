﻿package task.java8;
import java.util.*;
import java.util.stream.Collectors;

public class StringAand3Char {
	 public static void main(String[] args)
     {   
    	 
    	 Scanner input=new Scanner(System.in);
    List<String> names=new ArrayList<String>();
    System.out.println("How many strings do you want to enter");
    int stringCount=input.nextInt();
    System.out.println("Enter the strings");
    for(int i=0;i<=stringCount;i++)
    {
    	names.add(input.nextLine());
    }
    List<String> result=names.stream().filter(s -> s.startsWith("a") && s.length()==3).collect(Collectors.toList());
    System.out.println(result);
    input.close();
}
}