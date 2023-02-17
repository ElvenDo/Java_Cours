import static java.lang.Character.*;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p2102071
 */
public class Conversions {
    public static char conversions (char c) {
    if(isLowerCase(c)) {
        System.out.print("le charactere majuscule correspondant à c est : ");
        System.out.println (toUpperCase(c));
    }
    else if(isUpperCase(c)){
        System.out.print("le charactere minuscule correspondant à c est : ");
        System.out.println (toLowerCase(c));
    }
    else{
        System.out.print("c n'est pas une lettre !!\n");
    }
return c;
}
 public static void main(String[] args) {
     char c= 'a';
     conversions(c);
}
}
