package day5;

public class MaxValueFromRow {

    public static void main(String[] args) {

        int arr[][] = {{10,50,20},
        		       {15,65,48},
        		       {87,99,45}};

       

        for (int i = 0; i < arr.length; i++) {
        	 int max = arr[i][0];
        	for(int j = 0;j<arr[i].length;j++) {
        		if (arr[i][j] > max) {
                    max = arr[i][j];
                }
        		
        	}
            System.out.println("Maximum number from row "+(i+1)+" is: " + max);


            
        }

    }
}