/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author DELL
 */
public class J03031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0) {
            String s = sc.nextLine();
            int m = Integer.parseInt(sc.nextLine());
            if(solve(s, m) == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static int solve(String s, int m) {
        int count, k = 0, x = 0;
        if(s.length() < 26) return 0;
//        ll *a = new ll[s.length()];
//	 for(ll i=0; i<s.length(); i++){
//	 	count=0;
//	 	for(ll j=0; j<s.length(); j++){
//	 		if(s[i]==s[j]){
//	 			count++;
//	 		}
//	 	}
//	 	a[k++]=count;
//	 }
//	 for(ll  i=0; i<k; i++){
//	 	for(ll j=i+1; j<k; j++){
//	 		if(a[j]==a[i] && s[i]==s[j]){
//	 			a[j]=0;
//	 		}
//	 	}
//	 	if(a[i]>=1){
//	 		x++;
//	 	}
//	 }
//	 delete a;
//	 if(m>=26-x) return 1;
//	 return 0;
        int[] a = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j))
                    count ++;
            }
            a[k++] = count;
        }
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if(a[j] == a[i] && s.charAt(i) == s.charAt(j))
                    a[j] = 0;
            }
            if(a[i] >= 1)
                x ++;
        }
        if(m >= 26 - x) return 1;
        return 0;
    } 
}
