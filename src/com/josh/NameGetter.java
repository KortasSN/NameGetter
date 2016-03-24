package com.josh;
import java.util.*;

public class NameGetter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        NameProcessor nameProcessor = new NameCapitalizer() {

            NameProcessor.process(name);


            scanner.close();

        }
    }
}