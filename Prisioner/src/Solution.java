import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//Scanner input = new Scanner(new FileReader("input00.txt"));
		//Scanner output = new Scanner(new FileReader("output00.txt"));
		
		//int testCases = input.nextInt();
		
		//for(int i=0; i<testCases; i++){
			long population = 9;
			long sweets = 9;
			long initialPrisioner = 1;
			long result = deadPrisioner(population,sweets, initialPrisioner);
			//if( result != output.nextLong()){
			//	System.out.println("Case number: " + i+" expected: "+ output.nextLong() + " got: "+ result);
			//}
			System.out.println(result);
		//}
	}
	private static long deadPrisioner(long population, long sweets, long initialPrisioner){
		long deadPrisioner = initialPrisioner+((sweets%population)-1);
		if(deadPrisioner > population){
			deadPrisioner = deadPrisioner - population;
		}else if(deadPrisioner == 0){
			deadPrisioner = population;
		}
		return deadPrisioner;
	}

}
