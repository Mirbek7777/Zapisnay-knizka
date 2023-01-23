import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


class Main {

    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1.Добавить задачу");
            System.out.println("2.Вывести список задач");
            System.out.println("3.Удалить задачу");
            System.out.println("0.Выход");
            int input = scannerInput.nextInt();
            int count = 0;

            switch (input) {

                case 1:

                    System.out.println("Введите задачу для планирования(для  завершения введите end)");
                    Scanner scannerTask = new Scanner(System.in);
                    String task = scannerTask.nextLine();
                    if ("end".equals(input)) {
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println(list.get(i) + "\n");
                        }
                        return;
                    }
                    list.add(task);
                    count++;
                    break;


                case 2:
                    System.out.println("\n");
                    System.out.println("Список задач:");
                    System.out.println("\n");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((count++) + ". " + list.get(i) + "\n");
                    }
                    break;

                case 3:
                    System.out.println("введите номер задачи, которую необходимо удалить");
                    Scanner scannerTaskInt = new Scanner(System.in);
                    int taskInt = scannerTaskInt.nextInt();
                    list.remove(taskInt);
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Неверно указано значение");
                    break;
            }

        }
    }
} 