package com.senai.banksystem.model;




public class User {
   
   public static int cont=0;
    private int id;
    private String cpf;
    private String email;
    private String mother_name;
    private String complete_name; 
    private String password;
    private String register;
    private float bankBalance = 0;
    private String keyPix;
   
    private String number_card_User;
    private String validity_card_User;
    private String name_card_User;
    private int cod_security_card_User;
    

    

    public User(String email,String cpf,String password,String mother_name,String complete_name) {
        
        this.email = email;
        this.cpf =cpf;
        this.password = password;
        this.mother_name = mother_name;
        this.complete_name =complete_name;
        this.bankBalance = 100;
    }

    public String getComplete_name() {
        return complete_name;
    }


    public void setComplete_name(String complete_name) {
        this.complete_name = complete_name;
    }

    public  int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMother_name() {
        return mother_name;
    }

    public void setMother_name(String nome_mae) {
        this.mother_name = nome_mae;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String senha) {
        this.password = senha;
    }

    public String getRegister() {
        return register;
    }
    public void setRegister(String register) {
        this.register = register;
    }
    public float get_Bank_Balance_Client() {
        return bankBalance;
    }
    public void set_Bank_Balance_Client(float valor) {
        this.bankBalance -= valor;
    }
    public void set_Deposit_Bank_Balance(float valor) {
        this.bankBalance += valor;
    }
    public String getKeyPix() {
        return keyPix;
    }
    public void setKeyPix(String keyPix) {
        this.keyPix = keyPix;
    }




    public String getNumber_card_User() {
        return number_card_User;
    }

    public void setNumber_card_User(String number_card_User) {
        this.number_card_User = number_card_User;
    }

    public String getValidity_card_User() {
        return validity_card_User;
    }

    public void setValidity_card_User(String validity_card_User) {
        this.validity_card_User = validity_card_User;
    }

    public String getName_card_User() {
        return name_card_User;
    }

    public void setName_card_User(String name_card_User) {
        this.name_card_User = name_card_User;
    }

    public int getCod_security_card_User() {
        return cod_security_card_User;
    }

    public void setCod_security_card_User(int cod_security_card_User) {
        this.cod_security_card_User = cod_security_card_User;
    }
}
