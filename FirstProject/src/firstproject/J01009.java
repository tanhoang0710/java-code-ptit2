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
public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger res = new BigInteger("0");
        BigInteger t = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            Integer x = i;
            t = t.multiply(new BigInteger(x.toString()));
            res = res.add(t);
        }
        System.out.println(res);
    }
}
