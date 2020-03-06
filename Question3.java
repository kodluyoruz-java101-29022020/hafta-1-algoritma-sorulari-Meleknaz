import java.util.Random;

public class Question3 {
	
	public static float avgArray(int[] array) {
		float sum=0;
		float avg=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		avg=sum/array.length;
		return avg;		
	}


	public static void main(String[] args) {
		

		//Question three
		
		int[] array=new int[100];
		for(int i=0;i<100;i++) {
			Random random=new Random();
			int element=random.nextInt(100)+1;//Random number between 1 and 100
			array[i]=element;
		}
		//If you want to see the elements of the array 
		/*for(int i=0;i<100;i++) {
			System.out.println(array[i]);
		}*/
		System.out.println(avgArray(array));

	}

}
