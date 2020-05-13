package exerсise1;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        short b = 32;
        long c = 2;
        byte d = 127;
        float e = 10;
        double f = 100;
        char g = 72;
        boolean h = true;
        String name = "Александр";
        int year = 2019;

        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d + " e=" + e + " f=" + f + " g=" + g + " h=" + h);

        System.out.println("Task 1: " + calcTask1(a, b, c, d));

        System.out.println("Task 2: " + execTask2(a, b));

        System.out.println("Task 3: " + execTask3(a));

        System.out.println("Task 4: " + execTask4(a));

        System.out.println("Task 5: " + execTask5(name));

        System.out.println("Task 6: " + year + " год " + execTask6(year));
    }

    /**
     * 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
     * где a, b, c, d – входные параметры этого метода;
     * @param a1 - входной параметр
     * @param b1 - входной параметр
     * @param c1 - входной параметр
     * @param d1 - входной параметр
     * @return - ответ на уравнение
     */
    private static long calcTask1(int a1, short b1, long c1, byte d1) {

        return (a1 * (b1 + (c1 / d1)));

    }

    /**
     * 4. Написать метод, принимающий на вход два числа,
     * и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
     * если да – вернуть true, в противном случае – false;
     * @param a2 - первое число
     * @param b2 - второе число
     * @return - проверка входа суммы двух чисел в диапазон от 10 до 20
     */
    private static boolean execTask2(int a2, short b2) {
        if (a2 + b2 >= 10 && a2 + b2 <= 20) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 5. Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль положительное ли число передали, или отрицательное;
     * Замечание: ноль считаем положительным числом
     * @param a3 - целое число
     * @return - проверка числа
     */
    private static String execTask3(int a3) {
        if (a3 >= 0) {
            return "Положительное число";
        } else {
            return "Отрицательное число";
        }
    }

    /**
     * 6. Написать метод, которому в качестве параметра передается целое число,
     * метод должен вернуть true, если число отрицательное;
     * @param a4 - целое число
     * @return - проверка числа
     */
    private static boolean execTask4(int a4){
        if (a4 < 0){
            return true;
        } else {
            return false;
        }
    }

    /**
     * 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
     * метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
     * @param userName - имя пользователя
     * @return - приветствие пользователя
     */
    private static String execTask5(String userName){
        return "Привет, " + userName + "!";
    }

    /**
     * 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     *
     * @param year1 - номер года
     * @return - является ли год високосным
     */
    private static String execTask6(int year1){
            if (year1 % 400 == 0 || (year1 % 4 == 0 && year1 % 100 != 0)) {
                return "високосный";
            } else {
                return "невисокосный";
            }
    }
}