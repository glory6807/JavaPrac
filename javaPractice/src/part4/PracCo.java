package part4;

public class PracCo {

	public static void main(String[] args) {
		Computer com = new Computer();
		
		int[] values1 = {1, 2, 3};
		int arr1 = com.sum1(values1);
		System.out.println("arr1 : " + arr1);
		
		int arr2 = com.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("arr2 : " + arr2);
		
		int arr3 = com.sum2(5, 6, 7);
		System.out.println("arr3 : " + arr3);	

		int arr4 = com.sum2(5, 6, 7, 8, 9);
		System.out.println("arr4 : " + arr4);
	}

}
