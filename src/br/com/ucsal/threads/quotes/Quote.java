package br.com.ucsal.threads.quotes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quote {

    private static List<String> quote = new ArrayList<>(Arrays.asList(
            ": Saudações, ",
            ": Olá, ",
            ": Você é um tanto peculiar, ",
            ": Foi você quem pediu, ",
            ": Lutarei com honra, ",
            ": Não irei perder, ",
            ": Hahaha! você é hilário, ",
            ": Esta fazendo cosplay ou você é assim mesmo? ",
            ": Não sabia que o Halloween havia chegado... Credo, ",
            ": Vou equalizar a sua cara! ",
            ": Não tenho palavrás para você..! "
    ));

    public static String getQuoteOPhrase(Integer position) {
        return quote.get(position);
    }

    public static Integer length() {
        return quote.size();
    }

}
