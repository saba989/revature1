import java.util.Scanner;
import java.io.*;

class Prog3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        int p=sc.nextInt();
        double pow=sc.nextDouble();
        
        System.out.println(a*Math.pow(p,pow));
    }
}