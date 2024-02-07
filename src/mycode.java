/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
import java.io.*;
import java.util.*;
import java.lang.*;

public class mycode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Flag=0;
        String outarr[]=new String[20];
        String inarr[]=new String[20];
        Scanner arrlenscan=new Scanner(System.in);
        Scanner inarrscan=new Scanner(System.in);
        
        System.out.println("Enter number of scentence");
        int arrlen;
        arrlen=arrlenscan.nextInt();
        
        System.out.println("Enter "+arrlen+" setences");
        for(int i=0;i<arrlen;i++)
        {
            inarr[i]=inarrscan.nextLine();
        }
  
        String inarrsplit[][]=new String[arrlen][];
        for (int i = 0; i < arrlen; i++) {
            inarrsplit[i]=inarr[i].split(" ");
        }
        String checkword;
                
        for (int i = 0; i < arrlen; i++) {
            for (int j = 0; j < inarrsplit[i].length; j++) {
                checkword=inarrsplit[i][j];
                for (int k = i+1; k < arrlen; k++) {
                    for (int l = 0; l < inarrsplit[i].length; l++) {
                        if(checkword.equals(inarrsplit[i][j])){
                            inarrsplit[i][j]="";    
                            Flag=1;
                        }
                    }
                }
            }
            
            
        }
        for (int i = 0; i < arrlen; i++) {
            
        }
        
        
        
        
    }
    
}
