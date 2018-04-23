
public class Subject60 {

static int Circumfer(int []score) { 

	int total=0, a;
	
	for(int i=0; i<score.length; i++){
		total += score[i];
	} a=total;
	       
	return a;
	}

public static void main(String[] args) {
	
	int []score={12, 62, 43, 90, 93};
	double l;
	
	l=Circumfer(score);

	System.out.println("Total= "+l); 
	System.out.println("Avr= "+l/score.length); 
	}
}