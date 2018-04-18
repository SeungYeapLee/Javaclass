
public class Subject6 {
	public static void main(String[] args) {
		
	int []score={12, 62, 43, 90, 93};
	int total=0;
	double avr;  
//	System.out.println(score.length); 
	
	for(int i=0; i<score.length; i++){total += score[i];
	}avr = (double)total/score.length; 
	       
	System.out.println("Total= "+total); 
	System.out.println("Avr= "+avr); 
		
}}
