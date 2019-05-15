package com.javaloops;

public class SeriesPrint {

	public static void main(String []argh){
            int a = 0;
            int b = 2;
            int n = 10;
            for(int k=0;k<n;k++){
                int c =0;
                for(int j=0;j<k+1;j++){
                c+=Math.pow(2,j)*b;
            }
            System.out.print(" "+(a+c));
        }
    }
}


