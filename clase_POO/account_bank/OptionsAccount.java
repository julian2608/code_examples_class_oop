package clase_POO.account_bank;

public class OptionsAccount {

    private int option;

    private AccountBank accountBank;

    private double valueOperation;

    public OptionsAccount(int option, AccountBank accountBank, double valueOperation) {
        this.option = option;
        this.accountBank = accountBank;
        this.valueOperation = valueOperation;
    }

    /* Retorna: 
     - 1 si la operación es exitosa
     - 2 si desea salir de la app
     - 3 operación cancelada
     - 4 si la operación no es reconocida
    */
    public int execute (){
        switch (this.option) {
            case 1 -> {
                MessageUtil.operationDeposit();

                if (valueOperation < 0){
                    MessageUtil.valueNotValid();
                    return 3;
                }

                accountBank.deposit(valueOperation);

                return 1;
            }
            case 2 -> {
                MessageUtil.operationWithdraw();

                if (valueOperation > accountBank.getBalance()){
                    MessageUtil.fundsInsufficient();
                    return 3;
                }

                accountBank.withdraw(valueOperation);
                
                return 1;
            }
            case 3 -> {
                MessageUtil.operationViewBalance(accountBank.getHeadline());

                MessageUtil.showBalance(accountBank.getBalance());

                return 1;
            }
            case 4 -> {
                MessageUtil.operationClose();

                return 2;

            }
            default -> {
                return 3;
            }
        }
    }

    public int getOption() {
        return this.option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    
}
