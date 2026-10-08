package day5;

public class OccuranceOfWordInASentence {
	
	public static void main(String[] args) {
		
		String sentence = " I am a java developer java is used in backend technologies java is platform independent language";
		String Search = "java";
		
		int SearchStart = 0;
		int index = 0;
		int OccuranceCounter = 0;
		
		
		
	   do {
		    index = sentence.indexOf(Search,SearchStart);
		    if(index!=-1) {
		    	OccuranceCounter++;
		    	 }
		    SearchStart=index+Search.length();
		   
	   }while(index!=-1);
	   System.out.println(OccuranceCounter);
		   
		
	}

}
