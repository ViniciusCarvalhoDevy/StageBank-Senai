package com.senai.banksystem.model;

import Bank.Data_bank;

public class Manager {
    private float balance_bank_manager;
    private String register_manager;
    private int id_manager;
    private String managerCPF_login;
    private String password_manager;

public Manager(){
    this.id_manager = 1001001;
    this.balance_bank_manager = 220800;
    this.managerCPF_login = "mmmmmmmmmmm";
    this.password_manager = "Mana47";
    Data_bank.Funcionario.add(managerCPF_login+password_manager);
}




    public float getBalance_bank_manager() {
        return balance_bank_manager;
    }
    public void setBalance_bank_manager(float balance_bank_manager) {
        this.balance_bank_manager = balance_bank_manager;
    }
    public String getRegister_manager() {
        return register_manager;
    }
    public void setRegister_manager(String register_manager) {
        this.register_manager = register_manager;
    }
    public int getId_manager() {
        return id_manager;
    }
    public void setId_manager(int id_manager) {
        this.id_manager = id_manager;
    }
    public String getManagerCPF_login() {
        return managerCPF_login;
    }
    public void setManagerCPF_login(String managerCPF_login) {
        this.managerCPF_login = managerCPF_login;
    }
    public String getPassword_manager() {
        return password_manager;
    }
    public void setPassword_manager(String password_manager) {
        this.password_manager = password_manager;
    }

    public static void vews_Accont_User(User [] user){
        System.out.println("|Lista de Usuarios|\r\n");
        int tam= Data_bank.Logins.size();
        int p =0;
        for( p =0; p< tam;p++){
            System.out.println(+p+" - CPF: "+user[p].getCpf()+"  Nome: "+user[p].getComplete_name()+"\r\n");
        }
       
    }
    public static void Edit_Accont_User(User [] user,int position, int action_edit,String edit){
        if(action_edit == 1){
            user[position].setCpf(edit);
            System.out.println("Edicao Finalizada com Sucasso!!\r\n");
            System.out.println("|Novo CPF: "+user[position].getCpf()+"|\r\n");
        }else if(action_edit == 2){
            user[position].setEmail(edit);
            System.out.println("Edicao Finalizada com Sucasso!!\r\n");
            System.out.println("|Novo E-mail: "+user[position].getEmail()+"|\r\n");
        }else if(action_edit == 3){
            user[position].setPassword(edit);
            System.out.println("Edicao Finalizada com Sucasso!!\r\n");
            System.out.println("|Novo Senha: "+user[position].getPassword()+"|\r\n");
        }else if(action_edit == 4){
            user[position].setMother_name(edit);
            System.out.println("Edicao Finalizada com Sucasso!!\r\n");
            System.out.println("|Novo Nome da Mae: "+user[position].getMother_name()+"|\r\n");
        }else if(action_edit == 5){
            user[position].setComplete_name(edit);
            System.out.println("Edicao Finalizada com Sucasso!!\r\n");
            System.out.println("|Novo Nome Completo: "+user[position].getComplete_name()+"|\r\n");
        }else
        System.out.println("ERRO!!! Na Edicao !!\r\n");
        
       
    }
}
