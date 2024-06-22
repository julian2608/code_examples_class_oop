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
    public OperationStatus execute (){
        switch (this.option) {
            case 1 -> {
                MessageUtil.operationDeposit();

                if (valueOperation < 0){
                    MessageUtil.valueNotValid();
                    return OperationStatus.OPERATION_FAILED;
                }

                accountBank.deposit(valueOperation);

                return OperationStatus.OPERATION_SUCCESS;
            }
            case 2 -> {
                MessageUtil.operationWithdraw();

                if (valueOperation > accountBank.getBalance()){
                    MessageUtil.fundsInsufficient();
                    return OperationStatus.OPERATION_FAILED;
                }

                accountBank.withdraw(valueOperation);
                
                return OperationStatus.OPERATION_SUCCESS;
            }
            case 3 -> {
                MessageUtil.operationViewBalance(accountBank.getHeadline());

                MessageUtil.showBalance(accountBank.getBalance());

                return OperationStatus.OPERATION_SUCCESS;
            }
            case 4 -> {
                MessageUtil.operationClose();

                return OperationStatus.CLOSE;

            }
            default -> {
                return OperationStatus.OPERATION_NOT_VALID;
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
