
public class Subject5 {
	public static void main(String[] args) {
		
	int num=33, i=1; 
	int ten1, ten2;
	int one1, one2, hap1; 
	int sum2, sum3=0;
	
	ten1 = (num/10); //���� �ڸ�
	one1 = num-(ten1*10); //���� �ڸ�

	ten2 = one1*10; //���� ���� �ڸ�
	hap1 = ten1+one1;
	one2 = hap1-(hap1/10)*10; //���� ���� �ڸ�
	sum2 = ten2+one2; //���� ��
	
//	System.out.println(hap1);
//	System.out.println(sum2);
	
	while(sum3!=num){
		
	i++;
	ten1 = (sum2/10); //���� �ڸ�
	one1 = sum2-(ten1*10); //���� �ڸ�

	ten2 = one1*10; //���� ���� �ڸ�
	hap1 = ten1+one1;
	one2 = hap1-(hap1/10)*10; //���� ���� �ڸ�
	sum3 = ten2+one2; //���� ��
	sum2 = sum3;
	
	}//System.out.println(sum3); 
	   System.out.println("ȸ����� Ƚ��: "+i);
		
}}
