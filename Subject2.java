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
	System.out.println("����: "+map.get("elementary-like"));

	switch(a){
	case 6: System.out.println("������ �ݴϴ�"); break;
	case 7: System.out.println("������ ���� �ʽ��ϴ�"); break;
	case 13: System.out.println("���̽�ũ���� �ݴϴ�"); break;
	case 14: System.out.println("���̽�ũ���� ���� �ʽ��ϴ�"); break;
	case 20: System.out.println("��踦 �ݴϴ�"); break;
	case 21: System.out.println("��踦 ���� �ʽ��ϴ�"); break;
	default: break;};
	
	System.out.println("---------------------");
	
	int b = 12; 
	String c = "hate";
	System.out.println("����: "+b+", He "+c+"`s to get it");
	
	if(b<=12){ if(c=="like") System.out.println("������ �ݴϴ�"); 
			   else System.out.println("������ ���� �ʽ��ϴ�");}
	else if(b>12 && b<=19){ if(c=="like") System.out.println("���̽�ũ���� �ݴϴ�"); 
							 else System.out.println("���̽�ũ���� ���� �ʽ��ϴ�");}
	else{ if(c=="like") System.out.println("��踦 �ݴϴ�");
		  else System.out.println("��踦 ���� �ʽ��ϴ�");}
	
}}
