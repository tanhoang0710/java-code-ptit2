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
public class J03018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String s = sc.nextLine();
            BigInteger n = new BigInteger(s);
            BigInteger bi = new BigInteger("0");
            if(n.mod(new BigInteger("4")).equals(bi)) {
                System.out.println("4");
            }else {
                System.out.println("0");
            }
        }
    }
}
