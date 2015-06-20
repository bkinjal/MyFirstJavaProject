package com.digitech;

public class ArrayExample {
	
	public static void main(String[]args){
		arrayStatement();
	}
	public static void arrayStatement(){
		int[][] twidim = new int [5][5];
		int mani = 0;
		
		for(int x =0;x<5;x++){
			for (int z=0;z<5;z++){
			twidim [x][z]=mani;
			mani +=10;
			System.out.print(twidim[x][z] +"\t");
			}
			System.out.println();
		}
		
		
	}
	
	
}
