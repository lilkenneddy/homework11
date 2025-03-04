package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        class main {
            public static void main(String[] args) {
                int day = 3;
                String dayName = switch (day) {
                    case 1 -> "Monday";
                    case 2 -> "Tuesday";
                    case 3 -> "Wednesday";
                    case 4 -> "Thursday";
                    case 5 -> "Friday";
                    case 6 -> "Saturday";
                    case 7 -> "Sunday";
                    default -> "Unknown";

                };
                System.out.println(dayName);
            }
        }

    }
}