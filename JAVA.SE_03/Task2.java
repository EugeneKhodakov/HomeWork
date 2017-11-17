package Task2;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Task2 {
    static ResourceBundle myResourceBundle;
    static String myEnResourceFileName = "ResourceBundle_en.properties";
    static String myRuResourceFileName = "ResourceBundle_ru.properties";

    public static void main(String args[]) {
            System.out.println("Hello, please choose language: \nPress 1 - for English \n Press 2 - for Russian");
            Scanner in = new Scanner(System.in);
            int lan = in.nextInt();
            switch (lan) {
                case 1:
                    EnVersion();
                    break;
                case 2:
                    RuVersion();
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
            in.close();
    }

        private static void EnVersion(){
            myResourceBundle = ResourceBundle.getBundle(myEnResourceFileName, Locale.ENGLISH);
            System.out.println("Input number of question you want to answer:");
            System.out.println("What is the meaning of life?");
            System.out.println("How many pages in the book 'War and Peace'?");
            System.out.println("Why May 4 is the day of Star Wars?");
            System.out.println("How many times did the Russian national football team become world champions?");
            int i = 0;
            String input = "";
            do {
                Scanner in1 = new Scanner(System.in);
                i = in1.nextInt();
                switch (i){
                    case 1:
                        input = myResourceBundle.getString("1");
                        break;
                    case 2:
                        input = myResourceBundle.getString("2");
                        break;
                    case 3:
                        input = myResourceBundle.getString("3");
                        break;
                    case 4:
                        input = myResourceBundle.getString("4");
                        break;
                    case 5:
                        System.out.println("The End");
                        break;
                    default:
                        System.out.println("Wrong input, try again");
                        break;
                }
                System.out.println(input);
                in1.close();
            } while (i != 5);
        }

        private static void RuVersion(){
            myResourceBundle = ResourceBundle.getBundle(myRuResourceFileName, Locale.forLanguageTag("RU"));
            System.out.println("Введите номер вопроса, чтоб узнать ответ:");
            System.out.println("В чем смысл жизни?");
            System.out.println("Сколько страниц в 'Войне и Мире'?");
            System.out.println("Почему 4 мая - день Звездных Войн?");
            System.out.println("Сколько раз сборная Росси по футболу становилась чемпионом мира?");
            int i = 0;
            String input = "";
            do {
                Scanner in1 = new Scanner(System.in);
                i = in1.nextInt();
                switch (i){
                    case 1:
                        input = myResourceBundle.getString("1");
                        break;
                    case 2:
                        input = myResourceBundle.getString("2");
                        break;
                    case 3:
                        input = myResourceBundle.getString("3");
                        break;
                    case 4:
                        input = myResourceBundle.getString("4");
                        break;
                    case 5:
                        System.out.println("The End");
                        break;
                    default:
                        System.out.println("Wrong input, try again");
                        break;
                }
                System.out.println(input);
                in1.close();
            } while (i != 5);
        }

}
