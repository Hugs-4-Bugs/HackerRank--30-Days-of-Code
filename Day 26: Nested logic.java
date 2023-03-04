import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        int dayExpected = sc.nextInt();
        int monthExpected = sc.nextInt();
        int yearExpected = sc.nextInt();
        int fine = 0;
        
        if(year > yearExpected){
            fine = 10000;
        }else if(year == yearExpected && month > monthExpected){
            fine = (month - monthExpected) * 500;
        }else if(year == yearExpected && month == monthExpected && day > dayExpected){
            fine = (day - dayExpected) * 15;
        }
        System.out.println(fine);
    }
}
