package com.array.op;
import java.util.Arrays;

public class ArrayOperations {

	static int[] arr= {1,2,3,5,6};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arr=resize(arr);
		insert( 7, 1);
		
		delete(2);
		System.out.println(Arrays.toString(arr));
		
	}
	public static int[] resize(int[] arr) {
		int arrlen=arr.length;
		int index=0;
		int[] resize=new int[arrlen+1];
		for (int i : arr) {
			resize[index]=arr[index];
			index++;
		}
		return resize;
	}
	
	public static void insert(int element,int pos) {
		arr=resize(arr);
		
		for(int i=arr.length-1;i>=pos;i--) {
			arr[i]=arr[i-1];
		}
		arr[pos-1]=element;
		System.out.println(Arrays.toString(arr));
	}
	
	public static void delete(int pos) {
		for(int i=pos-1;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=-1;
	}
}
