/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = "";
        while (sc.hasNextLine()) {            
            p += sc.nextLine();
            if(sc.nextLine().isEmpty() || sc.nextLine() == null)
                break;
        }
        System.out.println(p);
    }
}
