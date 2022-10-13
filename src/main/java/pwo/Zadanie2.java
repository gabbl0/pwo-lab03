/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author student
 */
public class Zadanie2 {
    public static final int FROM = 0, TO = 100;
    public static final String FILE_NAME = "lucasseq100.txt";

    public static void main(String[] args) {

        System.out.println("Lucas");
        try {
            LucasGenerator generator = new LucasGenerator();
            BufferedWriter writer
                    = new BufferedWriter(new FileWriter(FILE_NAME));
            for (int i = FROM; i <= TO; i++) {
                writer.write(generator.getTerm(i) + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println("Błąd");
        }
        System.out.println("Wynik zapisany do pliku: "
                    + FILE_NAME);
    }
}
