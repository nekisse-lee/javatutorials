package javatutorials.ch6Class.verify.exam20_bankapplication;

/**
 * Created by Nekisse_lee on 2017. 6. 29..
 */
public class Account {
    private int balance = 0;
    private  String owner;
    private String ano;


    public Account(String ano, String owner, int balance){
        this.ano = ano;
        this.owner =owner;
        this.balance =balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
