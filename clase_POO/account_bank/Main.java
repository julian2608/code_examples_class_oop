package clase_POO.account_bank;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        int optionSelected;
        Scanner scan = new Scanner(System.in);
        OperationStatus result = null;
        double ammountOperation = 0;
        AccountBank accountBank = null;

        while (result != OperationStatus.CLOSE) {
            if (accountBank == null) {
                MessageUtil.showRequerimentsForAccount();

                String headline = scan.nextLine();

                accountBank = new AccountBank(UUID.randomUUID().toString(), headline);

                MessageUtil.accountCreated();

            }
            MessageUtil.showOptions(accountBank.getHeadline());

            optionSelected = scan.nextInt();

            if (optionSelected == 1 || optionSelected == 2) {

                MessageUtil.ammountOperation();

                ammountOperation = scan.nextDouble();

            }

            OptionsAccount option = new OptionsAccount(optionSelected, accountBank, ammountOperation);

            result = option.execute();

            switch (result) {
                case OPERATION_SUCCESS -> {
                    MessageUtil.operationSuccess();
                }
                case CLOSE -> {
                    MessageUtil.closeApp();
                    break;
                }
                case OPERATION_FAILED -> {
                    MessageUtil.operationCancel();
                }
                case OPERATION_NOT_VALID -> {
                    MessageUtil.operationNotValid();
                }
            }
        }

    }
}