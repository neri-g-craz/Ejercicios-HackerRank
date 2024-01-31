package com.cambiarte.hrd3;

import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        float positivo = 0;
        float negativo = 0;
        float cero =0;
        float n = 0;
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i)>0){
                positivo++;
            } else if (arr.get(i)<0){
                negativo++;
            } else {
                cero++;
            }
        }
    System.out.println(String.format("%.6f",(positivo/arr.size())));
    System.out.println(String.format("%.6f",(negativo/arr.size())));
    System.out.println(String.format("%.6f",(cero/arr.size())));
    
    }

}