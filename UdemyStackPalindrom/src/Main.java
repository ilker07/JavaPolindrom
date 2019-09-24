import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
		System.out.println("Kelime girin..");
		String kelime=scan.nextLine();
		int kelime_uzunluk=kelime.length();
		String deger;
		if(kelime_uzunluk%2==0)
			deger="cift";
		else
			deger="tek";
		Stack<Character> stack =new Stack<Character>();
		
		for(int i=0;i<(kelime.length()/2);i++)
		{
			stack.push(kelime.charAt(i));
		}
		
		boolean sonuc=palindrom(kelime, stack,deger);
		if(sonuc)
			System.out.println(kelime+" kelimesi palindrom");
		else
			System.out.println(kelime+" kelimesi palindrom deðil.");
		
		
		
	}
	}
	
	
	public static boolean palindrom(String kelime,Stack<Character> stack,String deger)
	{
		if(deger=="tek")
		{	
		   for(int i=(kelime.length()/2)+1;i<kelime.length();i++)
		   {
			if (kelime.charAt(i)!=stack.pop())
				return false;
		   }
		   
		}
		
		else if(deger=="cift")
		{
			for(int i=(kelime.length()/2);i<kelime.length();i++)
			{
				if (kelime.charAt(i)!=stack.pop())
					return false;
				
			}
			
			
		}
		return true;
		
		
	}

}
