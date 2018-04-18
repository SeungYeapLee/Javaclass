import java.util.HashMap;

public class Subject2 {
	public static void main(String[] args) {

	HashMap<String,Integer> map = new HashMap<String, Integer>();

	map.put("elementary-like", 6);
	map.put("elementary-hate", 7);
	map.put("middle-like", 13);
	map.put("middle-hate", 14);
	map.put("Adult-like", 20);
	map.put("Adult-hate", 21);

	int a = map.get("elementary-like");
	System.out.println("나이: "+map.get("elementary-like"));

	switch(a){
	case 6: System.out.println("사탕을 줍니다"); break;
	case 7: System.out.println("사탕을 주지 않습니다"); break;
	case 13: System.out.println("아이스크림을 줍니다"); break;
	case 14: System.out.println("아이스크림을 주지 않습니다"); break;
	case 20: System.out.println("담배를 줍니다"); break;
	case 21: System.out.println("담배를 주지 않습니다"); break;
	default: break;};
	
	System.out.println("---------------------");
	
	int b = 12; 
	String c = "hate";
	System.out.println("나이: "+b+", He "+c+"`s to get it");
	
	if(b<=12){ if(c=="like") System.out.println("사탕을 줍니다"); 
			   else System.out.println("사탕을 주지 않습니다");}
	else if(b>12 && b<=19){ if(c=="like") System.out.println("아이스크림을 줍니다"); 
							 else System.out.println("아이스크림을 주지 않습니다");}
	else{ if(c=="like") System.out.println("담배를 줍니다");
		  else System.out.println("담배를 주지 않습니다");}
	
}}
