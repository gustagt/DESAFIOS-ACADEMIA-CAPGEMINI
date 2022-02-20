package Desafio1;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
    
        System.out.print("Digite o tamanho da escada: ");
        int n = sc.nextInt();
        int z = n;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j>=z){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }   
            z=z-1;
            System.out.println();
        }
        sc.close();
    }
}
