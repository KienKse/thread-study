package br.com.ucsal.threads.quotes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quote {

    private static List<String> quote = new ArrayList<>(Arrays.asList(
            ": Saudacoes, ",
            ": Ola, ",
            ": Voce e um tanto peculiar, ",
            ": Foi voce quem pediu, ",
            ": Lutarei com honra, ",
            ": Nao irei perder, ",
            ": Hahaha! Voce e hilario, ",
            ": Esta fazendo cosplay ou voce e assim mesmo? ",
            ": Nao sabia que o Halloween havia chegado... Credo, ",
            ": Vou equalizar a sua cara! ",
            ": Nao tenho palavras para voce..! "
    ));

    public static String getQuoteOPhrase(Integer position) {
        return quote.get(position);
    }

    public static Integer length() {
        return quote.size();
    }

}
