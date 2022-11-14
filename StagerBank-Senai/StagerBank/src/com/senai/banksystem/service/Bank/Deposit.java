package Bank;

import com.senai.banksystem.model.User;

public class Deposit {
    public static void Deposit_in_Account(User [] user, float value_deposit,String cpf){
        if(OperationPix.Valid_Cpf_Pix(cpf) && Data_bank.Logins.contains(cpf)){
            int position =Data_bank.Logins.indexOf(cpf);
            user[position].set_Deposit_Bank_Balance(value_deposit);
            System.out.println("Deposito Feito Com Sucesso!!");
        }else
         System.out.println("ERRO!! No Deposito!!");
    }
}
