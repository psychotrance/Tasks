package Lesson10Static_constants.Task1;

import java.util.Scanner;

/*
 * Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
 * Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
 * Углы прямоугольника обозначить символом “ “.
 * Каждая единица длины должна обозначаться одним символом “-“,
 * каждая единица ширины – символом “|“.
 * <p>
 * Произвести декомпозицию по своему усмотрению. Рекомендую скинуть на проверку. Контакт ниже.
 */
/**
 * Используя кодовую базу из задачи
 * https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson6_methods/Task3.java
 * вынести строковые и символьные литералы в константы.
 * <p>
 * Попробуйте нарисовать прямоугольник,
 * используя "==" для каждой единицы длины
 * и "||" – для каждой единицы ширины.
 * <p>
 * Также попробуйте записать в константу переменную scanner. Упростится ли
 * использование сканера внутри методов чтения с клавиатуры?
 */
public class Task1 {
    static final String CORNER_OR_SPACE = "  ";
    static final String HORIZONTAL_UNIT = "==";
    static final String VERTICAL_UNIT = "||";
    static final String NEXTSTRING = "\n";
    //вроде все символьные значения создал и объявил константами

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        //если это правильное решение пункта:
        //"Также попробуйте записать в константу переменную scanner.
        // Упростится ли использование сканера внутри методов чтения с клавиатуры?"
        //То я вообще нифига тогда не понимаю:)

        int length = requireInt(scanner, "Enter rectangle's length: ");
        int width = requireInt(scanner, "Enter rectangle's width: ");

        scanner.close();

        final String horizontalLine = createHorizontalLine(length);
        final String verticalLines = createVerticalLines(length, width);
        //Итоговые строко тоже вроде объявил константами=)

        printRectangle(horizontalLine, verticalLines);
    }

    static int requireInt(Scanner scanner, String requiringMessage) {
        System.out.print(requiringMessage);

        return scanner.nextInt();
    }

    static void printRectangle(String horizontalLine, String verticalLines) {
        System.out.print(horizontalLine + verticalLines + horizontalLine);
    }

    static String createHorizontalLine(int length) {
        String horizontalLine = CORNER_OR_SPACE;

        for (int i = 0; i < length; i++) {
            horizontalLine += HORIZONTAL_UNIT;
        }

        horizontalLine += CORNER_OR_SPACE;

        return horizontalLine + NEXTSTRING;
    }

    static String createVerticalLines(int length, int width) {
        String verticalLinesUnit = getVerticalLinesUnit(length);

        String verticalLines = "";

        for (int i = 0; i < width; i++) {
            verticalLines += verticalLinesUnit;
        }
        return verticalLines;
    }

    static String getVerticalLinesUnit(int length) {
        String verticalLinesUnit = VERTICAL_UNIT;

        for (int i = 0; i < length; i++) {
            verticalLinesUnit += CORNER_OR_SPACE;
        }

        verticalLinesUnit += VERTICAL_UNIT;
        return verticalLinesUnit + NEXTSTRING;
    }
}