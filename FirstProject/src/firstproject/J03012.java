/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J03012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            BigInteger b1, b2;
            b1 = new BigInteger(sc.next());
            b2 = new BigInteger(sc.next());
            System.out.println((b1.multiply(b2)).divide((b1.gcd(b2))));
        }
    }
}
