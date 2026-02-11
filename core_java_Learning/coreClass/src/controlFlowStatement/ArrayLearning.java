package controlFlowStatement;

import java.util.Arrays;

public class ArrayLearning {

	static int h =77;
	
	public static void main(String[] args) {
		
		ArrayLearning al = new ArrayLearning();
		
		ArrayLearning al2 = new ArrayLearning();
		ArrayLearning al3 = new ArrayLearning();
		ArrayLearning al4 = new ArrayLearning();
		
		ArrayLearning[] alObj = {al,al2,al3,al4};
		
		int g =34; //4b
	
		int [] marks4 = {90,85,78,88 ,h}; //Single dimensional array
		int [] marks5 ={90,85,88,78};
		
		//jagged Arrays
	
		int[][] nums = new int[4][];
		
		nums[0]=new int[2];
		nums[1]=new int[3];
		nums[2]=new int[1];
		nums[3]=new int[4];
	
		nums[0][0]=12;
		nums[1][0]=34;
		nums[2][0]=11;
		nums[3][1]=34;
		
		//System.out.println(Arrays.deepToString(nums));
		
		int[][] nums2= {{1,2},
				{12,23,4},
				{23},{23,6,1,6}};
		//System.out.println(nums2[2][0]);
		
		//nums[0]=23;
//int[][][] a= {{{3223,2332,32},{1,4,4,6,34,67}},
//				{{3223,2332,32},{1,4,4,6,34,67}},
//				{{3223,232,32},{1,4,4,6,34,67}}}; //2D
//		
//		System.out.println(a[2][0][1]);
//		
		
//		System.out.println(Arrays.toString(marks4));
//		Arrays.sort(marks4);
//		System.out.println(Arrays.toString(marks4));

		//System.out.println(Arrays.binarySearch(marks4, 88));
		
		//copyOf()
		
//int []d=Arrays.copyOfRange(marks4, 2,5);
//  System.out.println(Arrays.toString(d)); //
//		
//	boolean b =Arrays.equals(marks4, marks5);
//		System.out.println(b);
//		
//		Arrays.fill(marks5, 60);
//		System.out.println(Arrays.toString(marks5));
		
//		for(int e: marks4) {
//			System.out.print(e+" ");
//		}
		
		//int[] mark = new int[5]; //

		//String[] name = {"Praveen","senthil","kumar"}; //0 1 2
	
		//Collection of similar or same data  -  Type
	
	}
	
	//method overriding 
//	public int hashCode() {
//	
//		return 0;
//	}

}

//String name ="Harish";
//System.out.println(name.hashCode());
//name=name.concat(" Ragav");  //Harish Ragav 
//System.out.println(name.hashCode());
//
//System.out.println(name);

