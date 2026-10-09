package Delete_At_Position;

import java.util.Arrays;

public class DeleteArray {
	public static void main(String[] args) {
		int[] arr= {1,2,4,23,5,6,9};
		deleteFromPosition(arr, 4);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void deleteFromPosition(int[] arr,int pos) {
		for(int i=pos-1;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=-1;
	}

}
