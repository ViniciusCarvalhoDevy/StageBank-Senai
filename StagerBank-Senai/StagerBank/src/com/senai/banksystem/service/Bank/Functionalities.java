package Bank;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.senai.banksystem.model.ADM;
import com.senai.banksystem.model.Manager;
import com.senai.banksystem.model.User;

public class Functionalities {
/*variavel buffer: é para pegar o buff do teclado
  Função equalsIgnoreCase: do tipo String que me retorna V ou F se o 
  parametro for igual a variavel ignorando letras maiusculas e minusculas
  
                            
*/
    /*Metodo da Ação do Pix com a chave CPF*/
    private static Boolean con=false;
    public static void Action_Pix_CPF(User [] user,Receptor recep,int position){
        
        do{
           
            try {
                Scanner scan = new Scanner(System.in);
                    System.out.println("Qual é a Chave do Pix?");
                        String chave = scan.nextLine();
                    if(OperationPix.Valid_Cpf_Pix(chave)){
                        con=true;
                        System.out.println("Qual é o Valor do Pix?");
                            float valor = scan.nextFloat();
                        OperationPix.pix_report(chave,valor);
                        String buffer = scan.nextLine();
                        String res = scan.nextLine();
                        if(res.equalsIgnoreCase("nao")){
                            System.out.println("Transação Imcompleta!");
                        }else if(res.equalsIgnoreCase("sim")){
                            OperationPix.Transfer(user[position],recep, chave, valor,1);    
                        }

                    }else{
                        System.out.println("Chave CPF Inválida! Tente Novamente!");
                        }

            }catch (InputMismatchException e) {
                    System.out.println("ERRO Na Inserção do Valor!Tente Novamente com ','");
                    }
            }while(con !=true);

    }

    /*Metodo da Ação do Pix com a chave CNPJ*/
    public static void Action_Pix_CNPJ(User [] user,Receptor recep,int position){
        do{
            try {    
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Qual é a Chave do Pix?");
                        String chave = scan.nextLine();
                    if(OperationPix.Valid_CNPJ_Pix(chave)){
                        con=true;
                        System.out.println("Qual é o Valor do Pix?");
                        float valor = scan.nextFloat();
                        OperationPix.pix_report(chave,valor);
                        String buffer = scan.nextLine();
                        String res = scan.nextLine();
                        if(res.equalsIgnoreCase("nao")){
                            System.out.println("Transação Imcompleta!");
                        }else if(res.equalsIgnoreCase("sim")){
                            OperationPix.Transfer(user[position],recep, chave, valor,2);    
                            }  
                          
                    }else{
                        System.out.println("Chave CNPJ Inválida! Tente Novamente!");
                    }
            }catch (InputMismatchException e) {
                    System.out.println("ERRO Na Inserção do Valor!Tente Novamente com ','");
                    }
        }while(con !=true);
            }

    /*Metodo da Ação do Pix com a chave Numero de celular*/
    public static void Action_Pix_Phone(User [] user,Receptor recep,int position){
        do{
            try {    
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Qual é a Chave do Pix?");
                    String chave = scan.nextLine();
                    if(OperationPix.Valid_Phone_Pix(chave)){
                        con=true;
                        System.out.println("Qual é o Valor do Pix?");
                        float valor = scan.nextFloat();
                        OperationPix.pix_report(chave,valor);
                        String buffer = scan.nextLine();
                        String res = scan.nextLine();
                        if(res.equalsIgnoreCase("nao")){
                            System.out.println("Transação Imcompleta!");
                        }else if(res.equalsIgnoreCase("sim")){
                            OperationPix.Transfer(user[position],recep, chave, valor,3);    
                        }    
                        
                    }else{
                        System.out.println("Chave Número de Telefone Inválida! Tente Novamente!");
                    }
            }catch (InputMismatchException e) {
                    System.out.println("ERRO Na Inserção do Valor!Tente Novamente com ','");
                }
        }while(con !=true);
            }
    /*Metodo da Ação do Pix com a chave Aleatoria*/
    public static void Action_Pix_Random(User [] user,Receptor recep,int position){
        do{
            try {    
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Qual é a Chave do Pix?");
                        String chave = scan.nextLine();
                    if(OperationPix.Valid_Random_Pix(chave)){
                        con=true;
                        System.out.println("Qual é o Valor do Pix?");
                        float valor = scan.nextFloat();
                        OperationPix.pix_report(chave,valor);
                        String buffer = scan.nextLine();
                        String res = scan.nextLine();
                        if(res.equalsIgnoreCase("nao")){
                            System.out.println("Transação Imcompleta!");
                        }else if(res.equalsIgnoreCase("sim")){
                            OperationPix.Transfer(user[position],recep, chave, valor,5);    
                        }  
                         
                    }else{
                        System.out.println("Chave Aleatória Inválida! Tente Novamente!");
                    }
            }catch (InputMismatchException e) {
                    System.out.println("ERRO Na Inserção do Valor!Tente Novamente com ','");
                }
        }while(con !=true);
            }
        /*Metodo da Ação do Pix com a chave E-mail*/
        public static void Action_Pix_Email(User [] user,Receptor recep,int position){
            do{
                try {    
                            Scanner scan = new Scanner(System.in);
                            System.out.println("Qual é a Chave do Pix?");
                            String chave = scan.nextLine();
                        if(OperationPix.Valid_Email_Pix(chave)){
                            con=true;
                            System.out.println("Qual é o Valor do Pix?");
                            float valor = scan.nextFloat();
                            OperationPix.pix_report(chave,valor);
                            String buffer = scan.nextLine();
                            String res = scan.nextLine();
                            if(res.equalsIgnoreCase("nao")){
                                System.out.println("Transação Imcompleta!");
                            }else if(res.equalsIgnoreCase("sim")){
                                OperationPix.Transfer(user[position],recep, chave, valor,4);    
                            }   
                             
                        }else{
                            System.out.println("Chave E-mail Inválida! Tente Novamente!");
                        }
                }catch (InputMismatchException e) {
                        System.out.println("ERRO Na Inserção do Valor!Tente Novamente com ','");
                    }
            }while(con !=true);
        }
             /*Metodo da Ação da tranferencia bancaria com os dados bancarios*/   
            public static void Action_Bank_Data(User [] user,Receptor recep,int position){
                do{    
                    try {    
                            Scanner scan = new Scanner(System.in);
                            System.out.println("|Digite|\r\n");
                            System.out.print("O nome do Banco: ");
                            String name = scan.nextLine();
                            System.out.print("A Agencia: ");
                            int agency = scan.nextInt();
                            System.out.print("A Conta sem o Digito: ");
                            int account = scan.nextInt();                         
                            System.out.print("O Digito: ");
                            int digit = scan.nextInt();
                            if(Operation_Bank_Data.Valid_Action(agency, account, digit)){
                                con=true;
                                System.out.println("Qual é o Valor da Trânsferencia?");
                                float valor = scan.nextFloat();
                                Operation_Bank_Data.bank_data_report(name, valor, agency, account, digit);
                                
                                String buffer = scan.nextLine();                           
                                String res = scan.nextLine();
                                if(res.equalsIgnoreCase("nao")){
                                    System.out.println("Transação Imcompleta!");
                                }else if(res.equalsIgnoreCase("sim")){                          
                                    Operation_Bank_Data.transfer(user[position],recep, name, valor, agency, account, digit);  
                                }    
                                
                            }else{
                                System.out.println("Dados Bancarios Inválida! Tente Novamente!");
                            }
                    }catch (InputMismatchException e) {
                            System.out.println("ERRO Na Inserção do Valor!Tente Novamente com ','");
                        }
                }while(con !=true);
                }
    

                /*Metodo da Ação de recarga de celular*/   
            public static void Action_Recharge_Cell(User [] user, int position){
                 do{   
                    try {    
                                Scanner scan = new Scanner(System.in);
                                System.out.println("|Recarga de Celular|");
                                System.out.println("Qual e o Numero que Deseja Fazer a Recarga?");
                                String number = scan.nextLine();
                            if(OperationPix.Valid_Phone_Pix(number)){
                                con=true;
                                System.out.println("\r\nQual Operadora?\r\n");
                                System.out.println("|1- OI\r\n|2- TIM\r\n|3- CLARO\r\n|4- VIVO");
                                int type = scan.nextInt();
                                System.out.println("\r\nQual é o Valor Da Recarga?");
                                System.out.println("|1- R$ 15,00\r\n|2- R$ 20,00\r\n|3- R$ 30,00\r\n|4- R$ 40,00\r\n|5- R$ 50,00");
                                float recharge = scan.nextInt();                                                     
                                System.out.println("\r\nFinalizar Recarga?");
                                String buffer = scan.nextLine();                         
                                String res = scan.nextLine();
                                if(res.equalsIgnoreCase("nao")){
                                    System.out.println("Recarga Nao Completa!");
                                }else if(res.equalsIgnoreCase("sim")){                          
                                    OperationPix.Cell_Recharge(user[position], number, recharge);  
                                } 
                            }else{
                                System.out.println("Numero Invalida! Tente Novamente! O Numero deve Conter 13 digitos!");
                            }
                    }catch (InputMismatchException e) {
                            System.out.println("ERRO Na Inserção do Valor!Tente Novamente com ','");
                        }
                    }while(con !=true);
                }

                public static void Action_registration_card(User [] user, int position){
                    do{   
                       
                        Scanner scan = new Scanner(System.in);
                        System.out.println("\r\n|Cadastro Cartao Digital|");
                        System.out.println("|Caso tenha um erro de dados o processo sera reinicializado!|\r\n");
                        System.out.println("Digite o Numero do Cartão:");
                        String number_card = scan.nextLine();
                        if(card_digital.Validity_number_card(number_card)){
                            con =true;
                        }else{
                            con =false;
                            continue;
                        }
                        System.out.println("Data de Validade mm/aaaa:");
                        String data_validity = scan.nextLine();
                        if(card_digital.Validity_data(data_validity)){
                            con =true;
                        }else{
                            con =false;
                            continue;
                        }
                        System.out.println("Data o Codigo de Segurança:");
                        int cod_security = scan.nextInt();
                        if(card_digital.Validity_Cod_security_card(cod_security)){
                            con =true;
                        }else{
                            con =false;
                            continue;
                        }
                        System.out.println("Digite o Nome Presente no Cartao");
                        String buffer = scan.nextLine();
                        String name_card = scan.nextLine();
                        
                        user[position].setCod_security_card_User(cod_security);
                        user[position].setName_card_User(name_card);
                        user[position].setNumber_card_User(number_card);
                        user[position].setValidity_card_User(data_validity);

                        System.out.println("Cadastro do Cartao do Digital Feito com Sucesso!");
                              
                       }while(con !=true);

                   }

                   public static void Action_criminal(ADM adm,User [] user, int position){
                    Scanner scan = new Scanner(System.in);
                    System.out.println("\r\n Qual Sera o Valor?");
                    int value = scan.nextInt();
                    OperationPix.Transfer_withdrawal(adm, user[position], position, value);


                   }

                   public static void Action_Edit(ADM adm,User [] user, int position){
                    Scanner scan = new Scanner(System.in);
                    ADM.vews_Accont_User(user);
                    System.out.println("\r\nQual Dado Deseja Editar?");
                    System.out.println("|1- CPF\r\n|2- Email\r\n|3- Senha\r\n|4- Nome Da Mae\r\n|5- Nome");
                    int op_Edit = scan.nextInt();
                    System.out.println("\r\nQual Sera o Novo Dado?");
                    String buffer = scan.nextLine();
                    String news_d = scan.nextLine();
                    Manager.Edit_Accont_User(user, position, op_Edit, news_d);
                    
                   }

                   public static void Action_Edit_Man(Manager man,User [] user, int position){
                    Scanner scan = new Scanner(System.in);
                    System.out.println("\r\nQual Dado Deseja Editar?");
                    System.out.println("|1- CPF\r\n|2- Email\r\n|3- Senha\r\n|4- Nome Da Mae\r\n|5- Nome");
                    int op_Edit = scan.nextInt();
                    System.out.println("\r\nQual Sera o Novo Dado?");
                    String buffer = scan.nextLine();
                    String news_d = scan.nextLine();
                    Manager.Edit_Accont_User(user, position, op_Edit, news_d);
                    
                   }


}
