package nit.march14;

import java.util.Arrays;

public class Program1 
{
	public void meth1(char[] c2)
	{
		
		for(int i=c2.length-1;i>=0;i--)
		{
			System.out.print(c2[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		String s="java";
		char c[]=s.toCharArray(); 
		System.out.println(Arrays.toString(c));
		Program1 p=new Program1();
		p.meth1(c);
		
	}

}
