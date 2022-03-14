package com.te.ArrayAsiignment.sort;

import java.util.Arrays;

public class Duplicate1 {
	public static void main(String[] args) {
		int a[]= {1,2,1,2};
		System.out.println(Arrays.toString(a));
		
		for(int j=0;j<a.length-1;j++) {
			int count=0;
			for(int i=1;i<a.length-1;i++) {
				if(a[i]==a[j] && i!=j) {
					count++;
					a[i]='\n';
				}
			}
			if(a[j]!='\n' && count>0) {
				System.out.print(a[j]+" ");
			}
		}
		
		
	}

}
