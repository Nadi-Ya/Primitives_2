//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double initialBalance = 100.0;
        double topUpAmount = 1100.0;
        double bonus = 0;
        if (topUpAmount > 1000) {
            bonus = (int)(topUpAmount / 100);
        }
        double finalBalance = initialBalance + topUpAmount + bonus;
        System.out.println("Начальный баланс: " + initialBalance + " рублей");
        System.out.println("Сумма пополнения: " + topUpAmount + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");
        System.out.println("Итоговый баланс: " + finalBalance + " рублей");
    }
}

