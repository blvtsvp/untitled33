package com.company;

import java.util.Scanner;

public class Main {
public static double dist(int a, int b, int c, int d){
    return Math.sqrt(Math.pow((a-c),2)+Math.pow((b-d),2));
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[2][n];
        for (int i = 0; i<n;i++){
            a[0][i] = in.nextInt();
            a[1][i] = in.nextInt();
        }
        double max= -1.0;
        int x0 = 0;
        int y0 = 0;
        int x1 = 0;
        int y1 = 0;
        for(int i = 0; i < n;i++){
            for (int j = 0; j < n;j++){
                if(dist(a[0][i],a[1][i],a[0][j],a[0][j])>max) {
                    max = dist(a[0][i],a[1][i],a[0][j],a[0][j]);
                    x0 = a[0][i];
                    y0 = a[1][i];
                    x1 = a[0][j];
                    y1 = a[1][j];
                }
            }
        }
        System.out.print("Наибольшее расстояние между точками ("+x0+","+y0+") и ("+x1+","+y1+") = "+max);
    }
}
