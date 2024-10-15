package tast;

import java.util.Arrays;

public class T030 {
public static void main(String[] args) {
	int[] number = 
        {15,3,23,64,77,46,42,174,68,78,91,5,76,310,84,342,176};
	int temp;
	for(int i =0; i < number.length-1; i++) {
		
		for(int l =i+1; l< number.length; l++ ) {
			if(number[l] < number[i]) {
				temp=number[i];
				number[i]=number[l];
				number[l]= temp;
			}
		}
		
		
	}
	for(int i = 0; i < number.length; i++) {
		System.out.print(number[i] + " ");}
}
}