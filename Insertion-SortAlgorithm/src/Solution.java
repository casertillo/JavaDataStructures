
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = {'z','g','v','s','w','r','t','g','q','h','o'};
		System.out.println(a);
		System.out.println(insertionSort(a));
	}
	private static char[] insertionSort(char[] a){		
		for(int i=1; i<a.length; i++){
			char curr = a[i];
			int j = i;
			while(j > 0 && a[j-1] > curr){
				a[j]=a[j-1];
				j--;
			}
			a[j]=curr;
		}
		
		return a;
	}

}
