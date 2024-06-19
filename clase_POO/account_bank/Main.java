package clase_POO.account_bank;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        int optionSelected;
        Scanner scan = new Scanner(System.in);
        int result = 0;
        double ammountOperation = 0;
        AccountBank accountBank = null;

        while (result != 2) {
            if (accountBank == null) {
                MessageUtil.showRequerimentsForAccount();

                String headline = scan.nextLine();

                accountBank = new AccountBank(UUID.randomUUID().toString(), headline);

                MessageUtil.accountCreated();

            } else {
                MessageUtil.showOptions(accountBank.getHeadline());

                optionSelected = scan.nextInt();

                if (optionSelected == 1 || optionSelected == 2) {

                    MessageUtil.ammountOperation();

                    ammountOperation = scan.nextDouble();

                }

                OptionsAccount option = new OptionsAccount(optionSelected, accountBank, ammountOperation);

                result = option.execute();

                switch (result) {
                    case 1 -> {
                        MessageUtil.operationSuccess();
                    }
                    case 2 -> {
                        MessageUtil.closeApp();
                        break;
                    }
                    case 3 -> {
                        MessageUtil.operationCancel();
                    }
                    case 4 -> {
                        MessageUtil.operationNotValid();
                    }
                }
            }

        }

    }
}