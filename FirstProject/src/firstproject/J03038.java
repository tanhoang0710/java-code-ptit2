/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.*;

/**
 *
 * @author DELL
 */
public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            Character c= s.charAt(i);
            set.add(c);
        }
        System.out.println(set.size());
    }
}
