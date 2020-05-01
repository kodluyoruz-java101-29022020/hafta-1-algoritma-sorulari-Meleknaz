package algorithm.sample.array;

import java.util.Random;

public class OddAndEvenNumbers {
	
	
	public static void result(int[] array) {
		for(int i=0;i<array.length;i++) {
			
			if(array[i]%2==0 || array[i]==0)
				System.out.println(+array[i]+"=  is even");
			else
				System.out.println(+array[i]+"=  is uneven");	
		}
		
	}

	public static void main(String[] args) {
		
		//Question 5
		
		int[] array=new int[100];
		for(int i=0;i<100;i++) {
			Random random=new Random();
			int element=random.nextInt(100)+1;
			array[i]=element;
			
		}
		
		result(array);
	}

}
