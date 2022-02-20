package Desafio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListMetod lista = new ListMetod();

        System.out.print("Digite uma palavra:");
        String text = sc.nextLine();

        String[] array = new String[text.length()];
        List<String[]> list = new ArrayList<>();

        int total = 0;
        int mais = 1;

        for (int i = 0; i < text.length() - 1; i++) {

            list.add(lista.getlist(mais, text));
            mais = mais + 1;
        }

        for (int j = 0; j < list.size(); j++) {
            array = list.get(j);
            for (int i = 0; i < text.length(); i++) {
                if (array[i] == null) {
                    continue;
                }
                for (int k = 0; k < text.length(); k++) {
                    String regex = "";

                    if (array[i] == null) {
                        break;
                    }
                    if (array[k] == null) {
                        continue;
                    }
                    if (k == i) {
                        continue;
                    }

                    for (int z = 0; z < array[i].length(); z++) {
                        regex = "(?!.*" + array[k].charAt(z) + ".*" + array[k].charAt(z) + ")" + regex;

                    }
                    if (array[i].matches("" + regex + "[" + array[k] + "]*")) {
                        total = total + 1;
                        array[k] = null;
                    }
                }
            }
        }

        System.out.println(total);

        sc.close();
    }
}
