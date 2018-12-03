
public class Permutations {
	
	static int length;
	static String word;
	static char wordArray[];
	
	public static void main(String args[])
	{
		word="ABCD";
		wordArray=word.toCharArray();	
		length=word.length();
		permute(length);
		
		
	}
	
	
	public static void permute(int len)
	{
		int i;
		if(len==2)
			for(i=0;i<len;i++)
			{
				printWord();
				swap();
			}
		else
		{
			for(i=1;i<=len;i++)
			{
				permute(len-1);
				rotate(len-1);
			}

		}
	}


	private static void rotate(int len) {
		int i=length-len-1;
		
		if(i<0)
			i=0;
		char temp=wordArray[i];
		
		for(;i<length-1;i++)
		{
			wordArray[i]=wordArray[i+1];
		}
		wordArray[i]=temp;
	}


	private static void swap() {
		char temp=wordArray[length-1];
		wordArray[length-1]=wordArray[length-2];
		wordArray[length-2]=temp;
	}


	private static void printWord() {
		for(int i=0;i<length;i++)
		{
			System.out.print(wordArray[i]);
		}
		
		System.out.println("");
	
	}

}
