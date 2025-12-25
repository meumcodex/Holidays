package com.christmas;

public class Christmas {
      public static void main(String[] args) {
        int height=20, row, blank, asterisk,base, trunk;
        String green="\033[32m";
        String red="\u001B[31m";
        String black="\u001B[30m";
        String yellow="\u001B[33m";

        System.out.println(red+"       ¡¡MERRY CHRISTMAS 2025!!   ");
    

        for (row=0; row<height; row++) {
            for (blank=0; blank<(height-row-1);blank++) {                               
            System.out.print(" ");
        }
        for (asterisk=0; asterisk<(row*2)+1; asterisk++) {
            System.out.print(green +"*");
        }
        System.out.println("");
    }
    int trunkLength=2;
    for (base=0; base<trunkLength; base++) {
        for (blank=0;blank<(height-2);blank++) {
            System.out.print(" ");
            }
            for (trunkLength=0; trunkLength<3; trunkLength++) {
                System.out.print(black+"|");
            }
            for (trunk=0; trunk<2; trunk++) {
         System.out.print(yellow+"|");
            }
            System.out.println("");
            
        }
    }
}
