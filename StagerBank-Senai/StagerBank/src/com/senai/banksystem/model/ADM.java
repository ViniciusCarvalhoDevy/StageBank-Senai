package com.senai.banksystem.model;

import Bank.Data_bank;

public class ADM {
    private float balance_bank_adm;
    private String register_adm;
    private int id_adm;
    private String cpf_login;
    private String password_adm;
    private static Boolean OK = true;

public static Boolean getOK() {
        return OK;
    }


    public static void setOK(Boolean oK) {
        OK = oK;
    }


public ADM(){
    this.id_adm = 1001001;
    this.balance_bank_adm = 220800;
    this.password_adm = "Adm007";
    this.cpf_login= "aaaaaaaaaaa";
    Data_bank.Funcionario.add(0,cpf_login+password_adm);


}


    public float getBalance_bank_adm() {
        return balance_bank_adm;
    }
    public void setBalance_bank_adm(float balance_bank_adm) {
        this.balance_bank_adm += balance_bank_adm;
    }
    public String getRegister_adm() {
        return register_adm;
    }
    public void setRegister_adm(String register_adm) {
        this.register_adm = register_adm;
    }
    public int getId_adm() {
        return id_adm;
    }
    public void setId_adm(int id_adm) {
        this.id_adm = id_adm;
    }
    public String getCnpj_login() {
        return cpf_login;
    }
    public void setCnpj_login(String cpf_login) {
        this.cpf_login = cpf_login;
    }
    public String getPassword_adm() {
        return password_adm;
    }
    public void setPassword_adm(String password_adm) {
        this.password_adm = password_adm;
    }
    public static void vews_Accont_User(User [] user){
        System.out.println("|Lista de Usuarios|\r\n");
        int tam= Data_bank.Logins.size();
        int p =0;
        for( p =0; p<tam;p++){ 
            System.out.println("______________________________");
            System.out.println("|ID: "+p+" - CPF: "+user[p].getCpf()+"  Saldo:R$ "+user[p].get_Bank_Balance_Client()+"\r\n");
        }  
    }

   

}
