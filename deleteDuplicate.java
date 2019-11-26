import java.util.Scanner;
public class deleteDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=new String();
		str=sc.next();
		int n=str.length();
		String str1="";
		for(int i=0;i<n-1;i++)
		{
			if(i==0)
			{
			if(str.charAt(i)!=str.charAt(i+1))
				{
					str1+=str.charAt(i);
				}
			}
			else if(i>0)
			{
				if(str.charAt(i)!=str.charAt(i+1)&&str.charAt(i)!=str.charAt(i-1))
				{
					str1+=str.charAt(i);
				}
			}
		}
		if(str.charAt(n-1)!=str.charAt(n-2))
		{
			str1+=str.charAt(n-1);
		}
		System.out.println("after deleting adjacent duplicates: ");
		System.out.print(str1);
	}
}
