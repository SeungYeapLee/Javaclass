
public class Subject30 {

static double Circumfer(int h) { 

	double j=0, sum1=0, sum2=0, sum3=0, sum4=0, sum5=0, sum6=0; 
	double a; 
	
	j=h; sum1=h;
	sum2=sum1+j;
	sum3=sum1+sum2;
	sum4=sum2+sum3;
	sum5=sum3+sum4;
	sum6=sum4+sum5;
			
	a = sum6*2+sum5*2; 

	return a;
	}

public static void main(String[] args) {
	
	int h=4; double l; 
	
	l=Circumfer(h);

	System.out.println("가장 작은 타일의 둘레: "+h);
	System.out.println("직사각형 둘레 길이: "+l);
	}
}
