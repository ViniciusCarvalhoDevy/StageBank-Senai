package Bank;

import com.senai.banksystem.model.User;

public class card_digital {

public static Boolean Validity_number_card(String number_card) {
int tam = number_card.length();
if(tam >=14){
   return true;
}else   
    System.out.println("Numero de Cartão Invalido!");
    return false;
}

public static Boolean Validity_Cod_security_card(int validity_card) {
    int cont=0;
    while(validity_card !=0) { validity_card = validity_card/10; cont++; }
    if(cont ==3){
       return true;
    }else   
        System.out.println("Codigo de Seguranca Invalido!");
        return false;
        
    }


public static Boolean Validity_data(String validity_card) {
    int tam = validity_card.length();
    if(tam == 6){
        return true;
    }else  
        System.out.println("Data de Validade Invalida!");
        return false;

}
public static void viws_Card_Digital(User [] user,int position){
    if(user[position].getNumber_card_User() != null ){
        System.out.println("| Seu Cartao Digital |");
        System.out.println("_______________________________________");
        System.out.println("|Nome : "+user[position].getName_card_User());
        System.out.println("|Numero : "+user[position].getNumber_card_User());
        System.out.println("|Data De Validade : "+user[position].getValidity_card_User());
        System.out.println("|Codigo de seguranca: "+user[position].getCod_security_card_User());
        System.out.println("_______________________________________");
    }else {
        System.out.println("\r\n|| VOCE AINDA NAO CADASTROU O CARTAO ||\r\n");
    }
}

}
