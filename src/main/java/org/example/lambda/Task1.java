package org.example.lambda;

public class Task1 {
    static void main() {

        /// 35 gr = 1 $
        double summeOfGr = 20;
        double convertionIntoDollar = 35;
        LambdaConvertionFromGrIntoDollar lambdaConvertionFromGrIntoDollar = (double summeOfGri, double convertionFromGrIntoDollar) -> {
            System.out.println(summeOfGri / convertionFromGrIntoDollar);

        };
        lambdaConvertionFromGrIntoDollar.convertGrIntoDollar(summeOfGr, convertionIntoDollar);
    }
}
@FunctionalInterface
interface LambdaConvertionFromGrIntoDollar {
    public void convertGrIntoDollar(double summeOfValue, double convertionIntoDollar);
}