package dev;

import com.github.lalyos.jfiglet.FigletFont;

import java.util.ResourceBundle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String titre = ResourceBundle.getBundle("application").getString("titre");
        String asciiArt = FigletFont.convertOneLine(titre);
        System.out.println(asciiArt);

        String environnement = ResourceBundle.getBundle("application").getString("environnement");
        System.out.println("Envirronement=> "+environnement);
    }
}