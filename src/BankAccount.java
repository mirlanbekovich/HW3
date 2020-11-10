public class BankAccount {

    private double amount;


    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount +=sum;
        System.out.println("Вы положили на счет "+ sum);
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("У вас не хваает баланса ", sum);
        }else {
            amount -=sum;
            System.out.println("Вы сняли со счета "+ sum);
            System.out.println("Ваш остаток на счете " + amount);
        }
    }
}
