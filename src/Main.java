public class Main {
    public static void main(String[] args) {

        // Счет клинета
        int clientAccount;
        clientAccount = 100;

        // Пополнение счета
        int replenishment;
            replenishment = 1350;

        System.out.println("Пополнение счета на:" + (replenishment) + "руб.");

        // 1 Балл за каждые 100 руб
        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
            System.out.println("Ваш бонус:" + bonus + "руб.");
        } else {
            bonus = 0;
        }
        // Результат
        int results;
        results = clientAccount + replenishment + bonus;

        System.out.println("Ваш счет:" + results + "руб.");
    }

}
