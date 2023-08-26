import java.util.InputMismatchException;
import java.util.Scanner;



public class HOMEWORK2 {
    public static void main(String[] args){
        // Задача 1:
        // Напишите программу, которая запрашивает у пользователя число и проверяет, 
        // является ли оно положительным. Если число отрицательное или равно нулю, 
        // программа должна выбрасывать исключение InvalidNumberException с 
        // сообщением "Некорректное число". В противном случае, программа должна
        // выводить сообщение "Число корректно".

        Scanner sc = new Scanner(System.in);
        System.out.println("----- Задача № 1 -----");

        try{
            System.out.println("Введите целое число: ");
            int number = sc.nextInt();
            checkNumber(number);
        } catch (InvalidNumberException ex){
            System.out.println(ex.getMessage());
        } catch (InputMismatchException ex){
            System.out.println("Вы ввели некорректно! Введите целые числа!");
        }
        sc.nextLine();
        System.out.println();

        // Задача 2:
        // Напишите программу, которая запрашивает у пользователя два числа и 
        // выполняет их деление. Если второе число равно нулю, программа должна 
        // выбрасывать исключение DivisionByZeroException с сообщением 
        // "Деление на ноль недопустимо". В противном случае, программа должна 
        // выводить результат деления.
        System.out.println("----- Задача № 2 -----");
        try{
            System.out.println("Введите первое целое число: ");
            int a = sc.nextInt();
            System.out.println("Введите второе целое число:");
            int b = sc.nextInt();
            divide(a, b);
        } catch (InputMismatchException e1){
            System.out.println("Ошибка: вы ввели некорректно. Введите целые числа!");
        } catch (DivisionByZeroException e2){
            System.out.println(e2.getMessage());
        }
        sc.nextLine();
        System.out.println();

        // Задача3: - по желанию
        // Напишите программу, которая запрашивает у пользователя три числа и 
        // выполняет следующие проверки:
        // Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
        // Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
        // Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
        // Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
        // В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
        // - необходимо создать 3 класса собвстенных исключений
        System.out.println("----- Задача № 3 -----");
        try{
            System.out.println("Введите первое целое число: ");
            int a = sc.nextInt();
            System.out.println("Введите второе целое число: ");
            int b = sc.nextInt();
            System.out.println("Введите третье целое число: ");
            int c = sc.nextInt();
            checkNumbers(a, b, c);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: вы ввели некорректно. Введите целые числа!");
        } catch (DivisionByZeroException | NumberSumException | NumberOutOfRangeException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
    
    // Метод для первой задачи
    public static void checkNumber(int value) throws InvalidNumberException{
        if (value <= 0){
            throw new InvalidNumberException("Неправильное число!");
        } else {
            System.out.println("Число правильное");
        }
    }

    // Метод для второй задачи
    public static void divide(int a, int b) throws DivisionByZeroException{
        if (b == 0){
            throw new DivisionByZeroException("Делить на ноль нельзя!");
        } else {
            System.out.println(a / b);
        }
    }

    // Метод для третьей задачи
    public static void checkNumbers(int a, int b, int c) throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException{
        if (a > 100){
            throw new NumberOutOfRangeException("Первое число находится вне диапозона");
        } else if (b < 0){
            throw new NumberOutOfRangeException("Второе число находится вне диапозона");
        } else if ((a + b) < 10){
            throw new NumberSumException("Сумма первого и второго чисел мала");
        } else if (c == 0){
            throw new DivisionByZeroException("Делить на ноль нельзя");
        } else {
            System.out.println("Проверка пройдена");
        }
    }
}

class InvalidNumberException extends Exception{
    public InvalidNumberException(String message){
        super(message);
    }
}

class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message){
        super(message);
    }
}

class NumberOutOfRangeException extends Exception{
    public NumberOutOfRangeException(String message){
        super(message);
    }
}

class NumberSumException extends Exception{
    public NumberSumException(String message){
        super(message);
    }
}


