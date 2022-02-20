package Desafio2;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senha = sc.nextLine();
        /*
         * Possui no mínimo 6 caracteres.
         * Contém no mínimo 1 digito.
         * Contém no mínimo 1 letra em minúsculo.
         * Contém no mínimo 1 letra em maiúsculo.
         * Contém no mínimo 1 caractere especial. Os caracteres especiais são:
         * !@#$%^&*()-+
         */


        if(senha.length()<6){
            System.out.println("Falta "+ (6-senha.length())+" carateres.");
        }else if(!senha.matches(".*[0-9].*$")){
            System.out.println("Falta um digito.");
        }else if(!senha.matches(".*[a-z].*$")){
            System.out.println("Falta uma letra minuscula.");
        }else if(!senha.matches(".*[A-Z].*$")){
            System.out.println("Falta uma letra maiuscula.");
        }else if(!senha.matches(".*[!@#$%^&*()-+].*${1,}")){
            System.out.println("Falta um caractere especial.");
        }else{
            System.out.println("gloriaaaaaaaaaaaaaaaaaaa");
        }

        sc.close();
    }
}
