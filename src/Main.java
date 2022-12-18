import DailyPlanner.DailyPlannerUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                printMenu();
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            DailyPlannerUtil.addTask(scanner);
                            break;
                        case 2:
                            DailyPlannerUtil.deleteTask(scanner);
                            break;
                        case 3:
                            DailyPlannerUtil.printTaskForSpecifyDay(scanner);
                            break;
                        case 4:
                            DailyPlannerUtil.editTask(scanner);
                            break;
                        case 5:
                            DailyPlannerUtil.printSortedTask();
                            break;
                        case 0:
                            break label;
                    }
                } else {
                    scanner.next();
                    System.out.println("Выберите пункт меню из списка!");
                }
            }
        }
    }

    private static void printMenu() {
        System.out.print(
                "1. Добавить задачу \n" +
                        "2. Удалить задачу \n" +
                        "3. Получить задачу на указанный день \n" +
                        "4. Редактировать задачу \n" +
                        "5. Вывести список задач \n" +
                        "0. Выход \n" +
                        "Выберите пункт меню: \n"
        );
    }
}