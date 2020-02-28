package Lesson8.Lesson7HW;

//Composition example

public class ExternalEmployee extends Exception {
    private Coder coder;
    private Accountant accountant;

    public void makeCoffee (){

    }

    public Coder getCoder() {
        return coder;
    }

    public void setCoder(Coder coder) {
        this.coder = coder;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }
}
