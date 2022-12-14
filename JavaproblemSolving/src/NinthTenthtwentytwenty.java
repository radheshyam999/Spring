public class NinthTenthtwentytwenty {
/**
35) nth Prime Number Java
36) Java Program to Display Alternate Prime Numbers
37) Java Program to Find Square Root of a Number Without sqrt Method
38) Java Program to Swap Two Numbers Using Bitwise Operator
39) Java Program to Find GCD of Two Numbers
40) Java Program to Find Largest of Three Numbers
41) Java Program to Find Smallest of Three Numbers Using Ternary Operator
42) Java Program to Check if a Number is Positive or Negative
43) Java Program to Check if a Given Number is Perfect Square
44) Java Program to Display Even Numbers From 1 to 100
            45) Java Program to Display Odd Numbers From 1 to 100
            46) Java Program to Find Sum of Natural Numbers
**/
protected static boolean isPrime(int n){
    int i = 2;
    while (i <= (int)Math.sqrt(n)) {
        if (n % i == 0) return false;
    i++;}
  return true;
}
public static int nthPrime(int n){
    int i = 2;
    int nthprime = 0;
    int count  = 0;
    while (count <n){
        if (isPrime(i)){
            count++;
            nthprime = i;
        }
        i++;
    }
    return nthprime;
}
void printAlternativePrimes(int n){
    int i = 0,prime = 2;
    int even = 0;
    while (i < n){
        if (isPrime(prime)){
            if (even % 2 == 0) {
                System.out.println(prime);
            }
            even++;
        }
    }
}
int getLargestNumbers(int a,int b, int c){
    return (a > b && a > c) ? a:(b > a && b > c)? b: c;
}
int getSmallestNumbers(int a,int b, int c){
        return (a < b && a < c) ? a:(b < a && b < c)? b: c;
}
boolean isPostive(int n){
    return (n > 0) ? true:false;
}





}
