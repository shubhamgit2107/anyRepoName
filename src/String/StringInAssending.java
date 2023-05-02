package String;

import java.util.TreeSet;

public class StringInAssending {

	public static void main(String[] args) 
	{
	String[] s= {"Mango","Guava","Apple","Lichi"};
	TreeSet<String>set= new TreeSet<>();
	for (int i = 0; i < s.length; i++)
	{
		set.add(s[i]);
	}
	System.out.println(set);

	}

}
