public class Main {
    public static void main(String[] args) {
        int clientAccount = 100;
        int replenishment = 1350;
        System.out.println("Пополнение счета на:" + (replenishment) + "руб.");
        int bonus; // 1 Балл за каждые 100 руб
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
            System.out.println("Ваш бонус:" + bonus + "руб.");
        } else {
            bonus = 0;
        }
        int results = clientAccount + replenishment + bonus;
        System.out.println("Ваш счет:" + results + "руб.");
    }

}
