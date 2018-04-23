public class Subject20 {

static String want(int b, String c) { 

	String l;
	
	if(b<=12){ if(c=="like") l="사탕을 줍니다";
			   else l="사탕을 주지 않습니다";}
	else if(b>12 && b<=19){ if(c=="like") l="아이스크림을 줍니다"; 
							else l="아이스크림을 주지 않습니다";}
	else{ if(c=="like") l="담배를 줍니다";
		  else l="담배를 주지 않습니다";}
	return l;}


public static void main(String[] args) {
	
	int b=18;
	String c="hate", m;
	
	System.out.println("나이: "+b+", He "+c+"`s to get it");
	 m=want(b, c); System.out.println(m);
	 
	}
}