package com.alpha.work1;

public class MyCalculate {
    public double calcPi(int n){
        double res = 4;
        for (double i = 0.0; i < n; i++){
            if (i%2 == 0){
                res = res - 4 / (3+2 * i);
            }
            else{
                res = res + 4 / (3+2 * i);
            }
        }
        return res;
    }
}
