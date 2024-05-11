package Pratiti;

public class Test1 {

	public static void main(String[] args) {
		
		String str = "This this is is done by Saket Saket";
		
	   String [] words= str.split("");
	   
	   
	   Dictionary <string,int> wordcount =new Dictionary<string,int>();
	   
	   for(String word in words )
	   {
		   String lowerWord = word.Tolower()
		   
		   if(wordCount.ContainsKey(lowerword))
		   {
			   
			   wordCount[lowerWord]++;
		   }
		   else
		   {
			   
			   wordCount[lowerWord] =1;
		   }
		   
	   }
	   for(var pair in wordCount)
		{
		   System.out.println("{pair.key}:{pair.value}");
		}
		
		
	}

}
