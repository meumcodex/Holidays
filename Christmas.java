package com.christmas;

public class Christmas {
      public static void main(String[] args) {
        int height=20, row, blank, leaves,base, trunk;
        //adding color
        String green="\033[32m";
        String red="\u001B[31m";
        String black="\u001B[30m";
        String yellow="\u001B[33m";
        String reset  = "\033[0m"; //reset color of the console
        System.out.println("");
        System.out.println(red+"       ¡¡MERRY CHRISTMAS 2025!!   ");
        // building the tree
        for (row=0; row<height; row++) { //fix tree leaves spacing 
            for (blank=0; blank<(height-row-1);blank++) {                               
            System.out.print(" ");
        }
        for (leaves=0; leaves<(row*2)+1; leaves++) {//drawing the leaves
            System.out.print(green +"*");
        }
        System.out.println("");
    }
    int trunkLength=2;//fix tree trunk spacing
    for (base=0; base<trunkLength; base++) {
        for (blank=0;blank<(height-2);blank++) {
            System.out.print(" ");
            }
            for (trunkLength=0; trunkLength<3; trunkLength++) {//drwing the trunk
                System.out.print(black+"|");
            }
            for (trunk=0; trunk<2; trunk++) {
         System.out.print(yellow+"|");
            }
            System.out.println(""+reset);
            
        }
    }
}
