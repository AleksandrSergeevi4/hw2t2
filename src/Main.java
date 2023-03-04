public class Main {
    public static void main(String[] args) {
        // Пополнение счета
        int a = 1600;
        System.out.println("Пополнение счета на:" + (a) + "руб.");
        // Балл за каждые 100 руб
        int b = 1;
        // 1 Балл
        int c = 100;

        if (a >= 1000) {
            b = a / c;
            System.out.println("Ваш бонус:" + (b));
        } else {
            b = 0;
        }

        int amount = a + b;
        System.out.println("Ваш счет:" + amount + "руб.");

    }

}