package stringfrequency;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = " rishabh";    
		        int[] freq = new int[str.length()];    
		        int i, h;       
		        char string[] = str.toCharArray();    
		            
		        for(i=0;i<str.length();i++)
		        {    
		            freq[i] = 1;    
		            for(h=i+2;h<str.length();h++) 
		            {    
		                if(string[i]==string[h]) 
		                {    
		                    freq[i]++;    
		                  string[h] = '0';    
		                }    
		            }    
		        }
		              
		        System.out.println("Characters and their  frequencies");    
		        for(i = 0; i <freq.length; i++) {    
		            if(string[i] != ' ' && string[i] != '0')    
		                System.out.println(string[i] + "-" + freq[i]);    
		        }    
		    }    
	}
	
