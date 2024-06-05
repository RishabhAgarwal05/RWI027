package my;

public class maxminvalue {

	    public static void main(String[] args) {
	        int[] array = { 70, 60, 10, 4, 99 };
	        int max = Integer.MIN_VALUE;;
	        int min = Integer.MAX_VALUE; 
	        for (int i =0;i<array.length;i++) {
	            if(array[i] >max) {
	                max = array[i];
	            }
	            if(array[i] < min) {
	                min = array[i];
	            }
	        }
  System.out.println("Maximum value: " + max);
  System.out.println("Minimum value: " + min);
	    }
	}

