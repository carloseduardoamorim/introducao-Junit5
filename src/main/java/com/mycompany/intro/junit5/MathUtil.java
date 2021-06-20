package com.mycompany.intro.junit5;

public class MathUtil {
    public static int mdc(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        //Propriedade 6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        //Propriedade 1
        if(b > 0 && a % b ==0){
            return b;
        }
        
        //Propriedade 3
        if(b == 0){
            return Math.abs(a);
        }
        
        //Propriedade 5
        if(a % b != 0){
            return 1;
        }
        
        
        return -1;
    }
}
