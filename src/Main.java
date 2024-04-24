//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int amount = 400;
        int amountDeposit = 2400;
        int bonuses = amountDeposit / 100;
        int totalAmount = amount + amountDeposit + bonuses;

        if (amountDeposit >= 100){
            bonuses = bonuses;
        }
        System.out.println(" Бонус равен " + bonuses + " рублям ");
        System.out.println(" Итоговая сумма на счету " + totalAmount + " рублей ");
    }
}