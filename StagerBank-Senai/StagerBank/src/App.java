import com.senai.banksystem.Screens;
import com.senai.banksystem.model.ADM;
import com.senai.banksystem.model.Manager;
import com.senai.banksystem.model.User;

import Bank.Data_bank;
import Bank.Receptor;





public class App {
    public static void main(String[] args) throws Exception {
        User [] user = new User[10];
		Receptor receptor = new Receptor();
		ADM adm = new ADM();
		Manager manager = new Manager();
		
		
		
		
		
		user[0] = new User("iiiii@gmail.com","00000000000", "000", "Dinalva", "Valentin");
		user[1] = new User("aaaa@gmail.com","11111111111", "111", "Dinalva", "Viniicus");
		user[2] = new User("bbbbb@gmail.com","22222222222", "222", "Dinalva", "Joao");
		user[3] = new User("sssss@gmail.com","33333333333", "333", "Dinalva", "Thiago");
		user[4] = new User("ddddd@gmail.com","44444444444", "444", "Dinalva", "Pedro");
		Data_bank.Logins.add(user[0].getCpf());
		Data_bank.Logins.add(user[1].getCpf());
		Data_bank.Logins.add(user[2].getCpf());
		Data_bank.Logins.add(user[3].getCpf());
		Data_bank.Logins.add(user[4].getCpf());
		Data_bank.Passwords.add(user[0].getPassword());
		Data_bank.Passwords.add(user[1].getPassword());
		Data_bank.Passwords.add(user[2].getPassword());
		Data_bank.Passwords.add(user[3].getPassword());
		Data_bank.Passwords.add(user[4].getPassword());
		/*	*/
		
		
		


			int op =Screens.menu_main();
	do{
				
				switch (op){
					case 1:
						int position= Screens.screen_Login();
					
						if(position == -007){
							Screens.screen_Fuctionalities_ADM(user, adm);
							break;
						}

						if(position == -47){
							Screens.screen_Fuctionalities_Manager(user, manager);
							break;
						}
						
						if(position >=0){
							Screens.screen_Fuctionalities(user, receptor, position);
						}
						
					break;
					case 2: 
						Screens.screen_registration(user);
					break;
					case 3: 
						Screens.screen_Deposit(user);
					break;
		} 
		op =Screens.menu_main();
		
	}while(op !=0);
		
///System.out.println(user[0].get_Bank_Balance_Client());
//System.out.println(receptor.getBank_Balance_Recep());
//System.out.println(user[1].get_Bank_Balance_Client());









	
    }
}
