package Bank;

import java.util.ArrayList;

public class Data_bank {
    public static ArrayList<String> Logins = new ArrayList<>();
    public static ArrayList<String> Passwords = new ArrayList<>();
    public static ArrayList<String> Extract = new ArrayList<>();
    public static ArrayList<String> Funcionario = new ArrayList<>();
    


    public static ArrayList<String> getLogins() {
        return Logins;
    }
    public static void setLogins(String logins) {
        Logins.add(logins);
    }
    public static ArrayList<String> getPasswords() {
        return Passwords;
    }
    public static void setPasswords(String passwords) {
        Passwords.add(passwords);
    }
    public static ArrayList<String> getExtract() {
        return Extract;
    }
    public static void setExtract(String extract) {
        Extract.add(extract);
    }

}
