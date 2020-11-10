public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount bankAccount= new BankAccount();
        bankAccount.deposit(10000);
        while (true){
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                bankAccount.withDraw(bankAccount.getAmount());
                break;
            }
        }

    }
}
