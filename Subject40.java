
public class Subject40 {

static String Years(int year) { 
	
	String a;

	if(year%4==0){
		
		if(year%100==0){
			
			 if(year%400==0){a="*¿±≥‚ ¿”";}
		     else a="¿±≥‚ æ∆¥‘";
			 
		}else a="*¿±≥‚ ¿”";
		
	}else a="¿±≥‚ æ∆¥‘";

	return a;
	}

public static void main(String[] args) {
	
	int year=1800; String l;
	
	l=Years(year);

	System.out.println(l);
	}
}
