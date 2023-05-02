package String;

import java.util.LinkedHashSet;

public class RemoveDuplicateInString {

	public static void main(String[] args) 
	{
		String s="test Yantra software solution";
		char[] ch = s.toCharArray();
		
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for (int i = 0; i < ch.length; i++) { 
		set.add(ch[i]);
		}
		for (Character c : set)
		{
			int count=0;
			for (int i = 0; i < ch.length; i++) 
			{
				if(c==ch[i])
				{
					count++;
				}
				
			}
			if(count>=1)
			{
				System.out.println(c+ "isrepeating "+count+"times");
			}
			
		}

	}

}
