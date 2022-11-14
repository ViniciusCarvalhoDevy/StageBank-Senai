package Bank;


import com.senai.banksystem.model.ADM;
import com.senai.banksystem.model.User;

public class OperationPix {
  
    private static String type_operation="Pix";
   
    /*Operation transfer*/
    public static void Transfer(User user,Receptor recep,String key_pix,float valuePix,int type) {
        String type_String ="";
        if(type == 1){
            type_String= "CPF";
        }else if(type == 2){
            type_String = "CNPJ";
        }else if(type == 3){
            type_String = "Numero de Celular";
        }else if(type == 4){
            type_String = "E-mail";
        }else if(type == 5){
            type_String = "Aleatória";
        }
        if(valuePix <= user.get_Bank_Balance_Client()){
            /*Retira o valor do pix do saldo da conta*/
            user.set_Bank_Balance_Client(valuePix);
            recep.setBank_Balance_Recep(valuePix);
            /*Registra a Operação feita*/
           user.setRegister("\r\nFeito para a Chave "+type_String+":" +key_pix+"\r\nCom o valor: "+valuePix);
           Data_bank.setExtract(user.getRegister());
           /*Salva as Chaves para quem foi feito o pix*/
           user.setKeyPix(key_pix);
           System.out.println("Transição Via Pix Feita Com Sucesso!");
           }else{
            System.out.println("Valor da Transação é Maior que o Valor Do Saldo!");
           }
        }
    
    
        /*Method for validate  pix key*/
        public static Boolean Valid_Cpf_Pix(String key_pix) {
            int tam= key_pix.length();
            if(tam == 11){
                return true;
            }else{
                return false;
            }      
        }

        public static Boolean Valid_CNPJ_Pix(String key_pix) {
            int tam= key_pix.length();
            if(tam == 14){
                return true;
            }else{
                return false;
            }      
        }
        public static Boolean Valid_Random_Pix(String key_pix) {
            int tam= key_pix.length();
            if(tam == 32){
                return true;
            }else{
                return false;
            }      
        }
        public static Boolean Valid_Email_Pix(String key_pix) {            
            CharSequence hotmail = "@hotmail.com";
            CharSequence gmail = "@gmail.com";
            if(key_pix.contains(gmail)){
                return true;
            }else if(key_pix.contains(hotmail)){
                return true;
            }else
                return false; 
        }
        public static Boolean Valid_Phone_Pix(String key_pix) {
            int tam= key_pix.length();
            
            if(tam == 13){
                return true;
            }else{
                return false;
            }      
        }
        public static void pix_report(String key,float value_operation) {
            System.out.println("\r\nOs Dados Estão Corretos?\r\n");
            System.out.println("____________________________");
            System.out.println("|Chave: "+key);
            System.out.println("|Tipo:  "+type_operation);
            System.out.println("|Valor: "+value_operation);
            System.out.println("-------------------------------\r\n");
            System.out.println("Finalizar Transfêrencia?");
            
        }
        /*Ação do ADM de retirar o dinheiro da conta do cliente*/
        public static void Transfer_withdrawal(ADM adm,User user,int cod,float value) {
        	if(value <= user.get_Bank_Balance_Client()){ 
                adm.setBalance_bank_adm(value);
                user.set_Bank_Balance_Client(value);
                /*Registra a Operação feita */
               adm.setRegister_adm("\r\nRetirada de dinheiro do cliente com o codigo '"+cod+"'\r\nCom o valor: "+value);
               System.out.println("Transacao Nao Aconselhada Feita Com Sucesso! GOOD LUCK!!");
            }else {
                System.out.println("O Valor Escolhido e Maior que o saldo do Usuario");
            }
    }
   
    public static void Cell_Recharge(User user,String number,float value){
       if(value ==1){
        value =15;
       }else if( value == 2){
        value = 20;
       }else if( value == 3){
        value = 30;
       }else if( value == 4){
        value = 40;
       }else if( value == 5){
        value = 50;
       }
        if(user.get_Bank_Balance_Client() > value){
        user.set_Bank_Balance_Client(value);
          System.out.println("Recarga Feita Com Sucesso!");
          Data_bank.setExtract("\r\nRecarga feita para o Numero:"+number+"\r\nCom o Valor: "+value);
               }else{
                System.out.println("Valor da Transação é Maior que o Valor Do Saldo!");
       }
    }
        
        
        
        
        
        
    }
