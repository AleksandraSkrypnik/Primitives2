//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int amount = 600;
        int amountDeposit = 3400;
        int bonuses = amountDeposit > 1000 ? amountDeposit / 100 : 0;
        int totalAmount = amount + amountDeposit + bonuses;

        System.out.println(" Бонус равен " + bonuses + " рублям ");
        System.out.println(" Итоговая сумма на счету " + totalAmount + " рублей ");
    }
}