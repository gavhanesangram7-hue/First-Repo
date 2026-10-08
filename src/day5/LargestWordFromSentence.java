package day5;

public class LargestWordFromSentence {
	public static void main(String[] args) {
		
		String name = "Mahendre Singh Dhoni";
		
		String[] words = name.split(" ");
		
		int max = 0;
		
		String maxword = "";
		
		for(int i=0;i<words.length;i++) {
			
			if(words[i].length()>max) {
				max = words[i].length();
				maxword = words[i];
			}
			
			
		}
		System.out.println(max);

		
	}

}
