public class Subject20 {

static String want(int b, String c) { 

	String l;
	
	if(b<=12){ if(c=="like") l="������ �ݴϴ�";
			   else l="������ ���� �ʽ��ϴ�";}
	else if(b>12 && b<=19){ if(c=="like") l="���̽�ũ���� �ݴϴ�"; 
							else l="���̽�ũ���� ���� �ʽ��ϴ�";}
	else{ if(c=="like") l="��踦 �ݴϴ�";
		  else l="��踦 ���� �ʽ��ϴ�";}
	return l;}


public static void main(String[] args) {
	
	int b=18;
	String c="hate", m;
	
	System.out.println("����: "+b+", He "+c+"`s to get it");
	 m=want(b, c); System.out.println(m);
	 
	}
}