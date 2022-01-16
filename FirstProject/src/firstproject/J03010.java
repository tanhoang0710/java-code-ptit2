/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J03010 {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-- > 0){
            String s = in.nextLine();
            s = s.toLowerCase();
            String S[] = s.split(" ");
            String proc = "";
            String tmp = "";
                    
            for (String S1 : S) {
                tmp = "";
                if(S1.length() != 0){
                    tmp += S1.charAt(0);
                    if(S1.length() > 1)
                        tmp += S1.substring(1);
                    proc += tmp;
                    proc += " ";
                }
            }
            String[] A = proc.split(" ");
            proc = "";
            for (int i = 0; i < A.length - 1; i++) {
                proc += A[i].charAt(0);
            }
            proc = A[A.length - 1] + proc;
            if(mp.get(proc) == null){
                mp.put(proc, 1);        
            }else{
                mp.put(proc, mp.get(proc) + 1);
                proc = proc + mp.get(proc);      
            }
            proc += "@ptit.edu.vn";
            System.out.println(proc);
        }
    }
}
