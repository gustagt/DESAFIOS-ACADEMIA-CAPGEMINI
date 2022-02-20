package Desafio3;

public class ListMetod {

    public String[] getlist(int mais, String text) {

        String[] array = new String[text.length()];

        for (int j = 0; j < text.length(); j++) {
            if (!(mais + j > text.length())) {
                array[j] = text.substring(j, j + mais);
            } else {
                break;
            }
        }

        return array;
    }
}
