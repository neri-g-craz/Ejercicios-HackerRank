package com.cambiarte.hrd4;


class Prime {
    boolean prueba (int n){
        if (n<2)return false;
        for (int i=2; i*i<=n; i++) 
        if(n%i==0)
        return false;
        return true;
    }
    
    void checkPrime(Integer... a){
        boolean f=false;
        for(int i=0; i<a.length; i++){
            if(prueba(a[i])){
                if(f)java.lang.System.out.print(" ");
                f=true;
                java.lang.System.out.print(a[i]);
            }
        }
        java.lang.System.out.println();
    }
    
    
}

