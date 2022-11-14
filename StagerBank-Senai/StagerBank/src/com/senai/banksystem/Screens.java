package com.senai.banksystem;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import com.senai.banksystem.model.ADM;
import com.senai.banksystem.model.Manager;
import com.senai.banksystem.model.User;

import Bank.Data_bank;
import Bank.Deposit;
import Bank.Functionalities;
import Bank.OperationPix;
import Bank.Receptor;
import Bank.card_digital;

public class Screens {
		
		public static int menu_main(){
			Scanner scan = new Scanner(System.in);
			System.out.println("Bem Vindo Ao StagerBank");
			System.out.println("|1- Login\r\n|2- Cadastro\r\n|3- Deposito\r\n|0- Encerrar O App");
			int op =scan.nextInt();
			return op;
		}

		public static int screen_Login(){
			Scanner scan = new Scanner(System.in);
			System.out.println("|LOGIN|");
			System.out.println("Digite a Login: ");
			String log =scan.nextLine();
			System.out.println("Digite a Senha: ");
			String pass =scan.nextLine();
			
			if(Data_bank.Funcionario.contains(log+pass) && Data_bank.Funcionario.indexOf(log) ==0){
				System.out.print("Login Feito Com Sucesso Administrador!\r\n");
				return -007;

			}else if(Data_bank.Funcionario.contains(log+pass) ){
				System.out.print("Login Feito Com Sucesso Gerente!\r\n");
				return -47;

			}else if(Data_bank.Logins.indexOf(log) == -1 || Data_bank.Passwords.indexOf(pass)== -1){
				//se o não for cadastrado retorna isso
				System.out.print("Login ou Senha Icorretos!\r\n");
				return -1;
			}else if (Data_bank.Logins.contains(log) && Data_bank.Passwords.contains(pass)){
				//se for cadastrado retorna a posição do user
				System.out.print("Login Feito Com Sucesso!\r\n");
				return Data_bank.Logins.indexOf(log);

			}else 
			//erro 
				return -2;
			
			
			
		}
		public static int screen_registration(User [] user){
			Scanner scan = new Scanner(System.in);
			Boolean con = false;
			String log;
		do{
			System.out.println("|CADASTRO|");
			System.out.println("|Caso tenha um erro de dados o processo sera reinicializado!|\r\n");
			System.out.println("Digite a CPF/Login: ");
			 log = scan.nextLine();
			if(OperationPix.Valid_Cpf_Pix(log) == false){
				System.out.println("CPF Invalido!!");
				continue;
			}
			System.out.println("Digite a email: ");			
			String email =scan.nextLine();
			if(OperationPix.Valid_Email_Pix(email) == false){
				System.out.println("Email Invalido!!");
				continue;
			}
			System.out.println("Digite a nome Completo: ");
			//String buffer = scan.nextLine();
			String name = scan.nextLine();
			System.out.println("Digite o Nome de Sua Mae: ");
			String name_mon =scan.nextLine();
			System.out.println("Digite Sua Senha: ");
			String pass = scan.nextLine();
			if(ADM.getOK()){
			user[User.cont] = new User(email, log, pass, name_mon, name);
			con = true;
			Data_bank.Logins.add(log);
			Data_bank.Passwords.add(User.cont,pass);
			user[User.cont].setId(User.cont); 
			User.cont++;		
			}
			

			if(Data_bank.Logins.indexOf(log) >=0){
				System.out.println("Cadastro Feito com Sucesso!");
			}
		}while(con !=true);
			return Data_bank.Logins.indexOf(log);
			
		}
		public static void screen_Deposit(User [] user){
			Scanner scan = new Scanner(System.in);
			System.out.println("|Deposito|");
			System.out.println("Digite o CPF Da Conta que Quer Depositar: ");
			String cpf =scan.nextLine();
			System.out.println("Digite o Valor do Deposito: ");
			float value_deposit =scan.nextFloat();
			
			Deposit.Deposit_in_Account(user, value_deposit, cpf);
			
		}

		public static void screen_Fuctionalities(User [] user,Receptor recep,int position){
			Scanner scan = new Scanner(System.in);
			int op=0;
			do{
			System.out.println("|Funcionalidades|\r\n");
			System.out.println("|1- Pix\r\n|2- Transferencia Bancaria\r\n|3- Recarregar Celular\r\n|4- Extrato\r\n|5- Saldo\r\n|6- Cadastro Cartao Digital\r\n|7- Vizualizar cartao\r\n|0- Encerrar Acesso");
			 op = scan.nextInt();
			
			switch (op){
				case 1:
				System.out.println("|Qual Forma do Pix?|\r\n");
				System.out.println("|1- CPF\r\n|2- CNPJ\r\n|3- Celular\r\n|4- Email\r\n|5- Aleatoria");
				int oper = scan.nextInt();
					switch (oper){
						case 1:
							Functionalities.Action_Pix_CPF(user, recep,position);
						break;
						case 2:
							Functionalities.Action_Pix_CNPJ(user, recep, position);
						break;
						case 3:
							Functionalities.Action_Pix_Phone(user, recep, position);
						break;
						case 4:
							Functionalities.Action_Pix_Email(user, recep, position);
						break;
						case 5:
							Functionalities.Action_Pix_Random(user, recep, position);
						break;
					}
				break;
				case 2:
					Functionalities.Action_Bank_Data(user, recep, position);
				break;
				case 3:
					Functionalities.Action_Recharge_Cell(user,position);
				break;
				case 4:
					for (String s : Data_bank.Extract) {
						System.out.println(s);
						System.out.println("_________________________");
					}
				break;
				case 5:
					System.out.println("|Saldo Atual da Conta|\r\n");
					System.out.println("|Saldo: R$ "+user[position].get_Bank_Balance_Client()+" |\r\n");
				break;
				case 6:
					Functionalities.Action_registration_card(user, position);
				break;
				case 7:
					card_digital.viws_Card_Digital(user, position);
				break;
				
			}
			
		}while(op != 0);
			
		}
		public static void screen_Fuctionalities_ADM(User [] user, ADM adm){
			Scanner scan = new Scanner(System.in);
			int op;
			do{
					System.out.println("|Funcionalidades|\r\n");
					System.out.println("|1- Retirar Dinheiro de Contas Users|\r\n|2- Vizualizar Users\r\n|3- Editar Dados\r\n|4- Saldo\r\n|0- Encerar Acesso");
					op = scan.nextInt();
					switch (op){
						case 1:
							ADM.vews_Accont_User(user);
							System.out.println("\r\nPara Retirar O Dinheiro do Usuario, Digite o ID:");
							int oper = scan.nextInt();
							Functionalities.Action_criminal(adm, user, oper);
						break;
						case 2:
							try {
								ADM.vews_Accont_User(user);
							} catch (NullPointerException e) {
								e.getCause();
							}
							
						break;
						case 3: 
							ADM.vews_Accont_User(user);
							System.out.println("\r\nPara Editar os Dados do Usuarios, Digite o ID:");
							 oper = scan.nextInt();
							Functionalities.Action_Edit(adm, user, oper);
						break;

						case 4:
							System.out.println("|Saldo Atual da Conta|\r\n");
							System.out.println("|Saldo: R$ "+adm.getBalance_bank_adm()+" |\r\n");
						break;
					}
			}while(op != 0);
			
		}
		public static void screen_Fuctionalities_Manager(User [] user, Manager manager){
			Scanner scan = new Scanner(System.in);
			int op;
			do{
					System.out.println("|Funcionalidades|\r\n");
					System.out.println("\r\n|1- Vizualizar Users\r\n|2- Editar Dados\r\n|0- Encerar Acesso");
					op = scan.nextInt();
					switch (op){
						case 1:
							try {
								Manager.vews_Accont_User(user);
							} catch (NullPointerException e) {
								e.getCause();
							}
						break;
						case 2:

							Manager.vews_Accont_User(user);
							System.out.println("\r\nPara Editar os Dados do Usuarios, Digite o ID:");
							int oper = scan.nextInt();
							Functionalities.Action_Edit_Man(manager, user, oper);
								
						
							
						break;
					}
			}while(op != 0);
			
		}
		

	}

