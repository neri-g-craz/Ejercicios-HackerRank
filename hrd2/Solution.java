package com.cambiarte.hrd2;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scserie = new Scanner(System.in);
        int q = scserie.nextInt();
        for (int i=0; i<q; i++){
            int a = scserie.nextInt();
            int b = scserie.nextInt();
            int n = scserie.nextInt(); 
            long prev = 0;
            for (int j= 0; j<n; j++){
                long val = prev + ((long)Math.pow(2,j)*b);
                System.out.print((val + a) + " ");
                prev = val;
            }
            System.out.println();
        }
        scserie.close();
    }
}