//package Controller;
//
//import java.util.Scanner;
//
//public class Controller {
//    public static void buttonClick() {
//
//
//        try (Scanner in = new Scanner(System.in)) {
//
//            while (true) {
//                System.out.println("Выберите действие: \n");
//                System.out.println("1 - Показать список всех животных");
//                System.out.println("2 - Добавить животное");
//                System.out.println("3 - Добавить команду");
//                System.out.println("4 - Показать команды");
//                System.out.println("0 - Выход \n");
//                String key = in.next();
//                System.out.print("\033[H\033[J");
//                switch (key) {
//                    case "1":
//                        giveAway.add(ts.drawToys(toyList));
//                        System.out.println("Игрушки для выдачи: " + giveAway);
//                        //нужно добавить ограничение, чтобы разыграть можно было не больше totalToysSum
//                        break;
//                    case "2":
//                        try {
//                            ts.giveOutToy(giveAway, toyList);
//                        } catch (IndexOutOfBoundsException e) {
//                            System.out.println("Игрушки для выдачи закончились или еще не разыграны!\n");
//                        }
//                        break;
//                    case "0":
//                        System.exit(0);
//                    default:
//                        System.out.println("Такой команды нет");
//                        break;
//                }
//            }
//
//        }
//
//    }
//}
