
public class Subject50 {
	
static int Return(int num) { 
	
	int i=1;
	int ten1, ten2;
	int one1, one2, hap1; 
	int sum2, sum3=0;
	
	ten1 = (num/10); //���� �ڸ�
	one1 = num-(ten1*10); //���� �ڸ�

	ten2 = one1*10; //���� ���� �ڸ�
	hap1 = ten1+one1;
	one2 = hap1-(hap1/10)*10; //���� ���� �ڸ�
	sum2 = ten2+one2; //���� ��
	
	while(sum3!=num){
		
	i++;
	ten1 = (sum2/10); //���� �ڸ�
	one1 = sum2-(ten1*10); //���� �ڸ�

	ten2 = one1*10; //���� ���� �ڸ�
	hap1 = ten1+one1;
	one2 = hap1-(hap1/10)*10; //���� ���� �ڸ�
	sum3 = ten2+one2; //���� ��
	sum2 = sum3;
	} 
	return i;
	}

public static void main(String[] args) {
	
	int num=20, 
	
	l=Return(num);

	System.out.println("ȸ�ͱ��� Ƚ��: "+l);
	}
}
