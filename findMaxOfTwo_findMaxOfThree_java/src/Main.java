public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
    // Функция для нахождения максимума из двух чисел
     public int findMaxOfTwo(int a,int b) {
        return (a > b) ? a : b;
    }
    //Функция для нахождения максимума из трех чисел
     public static int findMaxOfThree(int a, int b, int c) {
        //Сначала находим максимум между a и b,а затем сравниваем его с c
          return findMaxOfTwo(findMaxOfTwo(a, b), c);
    }
 // Неудаляйте этот класс - он нужен для вывода результатов на экран и проверки
     public class Printer{
        public static void main(String[]args){ int a = 5, b = 10, c = 3;
            if (args.length == 3) {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
                c = Integer.parseInt(args[2]);
            }
            // Вывод результата на экран

            int itresume_res = findMaxOfThree(a, b, c);
            System.out.println(itresume_res); }
}