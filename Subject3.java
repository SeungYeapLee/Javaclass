
public class Subject3 {
	public static void main(String[] args) {
		
//		1 * 3.14
//	(1+1) * 3.14/2
//	(1+2) * 3.14/2
//	(2+3) * 3.14/2	
//	(3+5) * 3.14/2
//	(5+8) * 3.14/2
//	---------------
//	j+sum1=sum2
//	sum1+sum2=sum3
//	sum2+sum3=sum4
//	sum3+sum4=sum5
//	sum4+sum5=sum6
	
	int h=1; 
	double j=0, sum1=0, sum2=0, sum3=0, sum4=0, sum5=0, sum6=0; 
	double a, b, c, d; 
	
	j=h; sum1=h;
	sum2=sum1+j;
	sum3=sum1+sum2;
	sum4=sum2+sum3;
	sum5=sum3+sum4;
	sum6=sum4+sum5;
			
	a = h * 3.14;	
	b = sum6 * 3.14/2;
	c = a + b;
	d = sum6*2+sum5*2;

	System.out.println("가장 작은 타일의 둘레: "+h);
	System.out.println("타일의 총 둘레 길이: "+c);
	System.out.println("직사각형 둘레 길이: "+d);
	
	}
}
