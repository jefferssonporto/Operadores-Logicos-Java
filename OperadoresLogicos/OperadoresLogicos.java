/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package operadoreslogicos.operadoreslogicos;

/**
 *
 * @author Jefferson
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
      /*ou é uma ou exclusivamente a outra
      
        int x,y,z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x<y ^ y<z)? true:false;
        System.out.println(r); /* 
      
        /*   AS duas opções precisam ser iguais para ser true 
        int x,y,z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x<y && y<z)? true:false;
        System.out.println(r); */
     
      /* Uma outra opção ou as duas opções para ser true */
        int x,y,z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x<y || y<z)? true:false;
        System.out.println(r);
       