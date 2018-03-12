/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcd.de.euclides;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author lazarod
 */
public class MCDDeEuclides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      BigInteger m, n;
      System.out.println("Digite el primer numero");
      m = sc.nextBigInteger();
      System.out.println("Digite el segundo numero");
      n = sc.nextBigInteger();
      System.out.println(mcd(m,n));
    }
    
    public static BigInteger mcd(BigInteger m, BigInteger n){
        BigInteger tem;
        while(m.compareTo(BigInteger.ZERO) > 0){
            tem = m;
            m = n.mod(m);
            n = tem;
        }
        return n;
    }
    
}
