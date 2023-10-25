package edu;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String sum;
        
        sum = str + str;
        System.out.println(sum);
        
        for(n=0; n < n-1; n++){
           sum += str;
        }
        System.out.println(sum);
    }
}