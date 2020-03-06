import java.util.Random;


public class Question5 {
	
	//Bu sorunun herhangi bir yerinde mantık hatası yaptıgımı dusunuyorum cunku yanlis sayilara cift ya da tek diyor
	
	public static void result(double[] array) {
		for(int i=0;i<array.length;i++) {
			
			if(array[i]%2==0 || array[i]==0)
				System.out.println(+i+". element of the array is even");
			else
				System.out.println(+i+". element of the array is uneven");	
		}
		
	}

	public static void main(String[] args) {
		
		//Question 5
		
		double[] array=new double[100];
		for(int i=0;i<100;i++) {
			Random random=new Random();
			double element=random.nextInt(100)+1;
			array[i]=element;
			
		}
		//System.out.println(result(array)); //Bu kullanimda hata aldım
		result(array);
	}

}
