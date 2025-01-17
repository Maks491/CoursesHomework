package Lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        Lesson3 one = new Lesson3();
        one.printThreeWords();
        Lesson3 two = new Lesson3();
        two.checkSumSign();
        Lesson3 three = new Lesson3();
        three.printColor();
        Lesson3 four = new Lesson3();
        four.compareNumbers();
        Lesson3 five = new Lesson3();
        System.out.println(five.isSumTwenty(10, 6));
        Lesson3 six = new Lesson3();
        six.exercise(-9);
        Lesson3 seven = new Lesson3();
        System.out.println(seven.value(-9));
        Lesson3 eight = new Lesson3();
        eight.one("cat", 2);
        Lesson3 nine = new Lesson3();
        System.out.println(nine.year(400));
        Lesson3 ten = new Lesson3();
        ten.replacement();
        System.out.println();
        Lesson3 eleven = new Lesson3();
        eleven.setArray();
        Lesson3 twelve = new Lesson3();
        twelve.devide();
        Lesson3 thirteen = new Lesson3();
        thirteen.square();
        Lesson3 fourteen = new Lesson3();
        int[] result = fourteen.arr(8, 1);
        for (int print : result) {
            System.out.print(print + " ");
        }


    }

    public void printThreeWords() {
        System.out.println("Orange\nbanana\napple");
        System.out.println();//разделение вывода в консоль

    }

    public void checkSumSign() {
        int a = 40;
        int b = 7;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public void printColor() {
        System.out.println();
        int value = 109;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
        System.out.println();//разделение вывода в консоль
    }

    public void compareNumbers() {
        int a = 22;
        int b = 87;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
        System.out.println();//разделение вывода в консоль
    }

    public boolean isSumTwenty(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;

    }

    public void exercise(int value) {
        if (value >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
        System.out.println();//разделение вывода в консоль
    }

    public boolean value(int value) {
        return value >= 0;

    }

    public void one(String word, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(word);
        }
        System.out.println();//разделение вывода в консоль
    }

    public boolean year(int a) {
        return (a % 4 == 0 && a % 100 == 0 && a % 400 == 0);
    }

    public void replacement() {
        int test[] = new int[]{0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < test.length; i++) {
            if (test[i] == 0) {
                test[i] = 1;
            } else {
                test[i] = 0;
            }
            System.out.print(test[i] + " ");
        }
        System.out.println();//разделение вывода в консоль
    }

    public void setArray() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();//разделение вывода в консоль
    }

    public void devide() {
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();//разделение вывода в консоль

    }

    public void square() {
        System.out.println();
        int side[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) {
                    side[i][j] = 1;
                } else {
                    side[i][j] = 0;
                }
                System.out.print(side[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();  //разделение вывода в консоль
    }

    public int[] arr(int len, int initialValue) {
        int arrgue[] = new int[len];
        for (int i = 0; i < arrgue.length; i++) {
            arrgue[i] = initialValue;

        }
        return arrgue;


    }
}