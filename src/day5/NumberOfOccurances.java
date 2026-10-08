package day5;

public class NumberOfOccurances {

	public static void main(String[] args) {
		
		String Sentence = "I am studying Java in fsd java is a programming language and JAVA is good";
		
		String Search = "java";
		
		 int index = 0;
		 int Startindex = 0;
		 int OccuranceCounter = 0;
		 
		 do {
			 index = Sentence.indexOf(Search,Startindex);
		 }while(index!= -1);
		 System.out.println(index);
		 
		

	}

}
