package Capitulo_03;

public class BankAccount {
    private int nCuen;
    private String name;
    private double sald;
    
    BankAccount() {
        nCuen = 1440434;
	name = "Aragon kevin";
        sald = 500.00;
    }
		
    public int getNumC() {
        return nCuen;
    }
	
    public void setNumC(int num) {
        nCuen = num;
    }
	
    public String getName() {
        return name;
    }
	
    public void setName(String Name) {
        name = Name;
    }
	
    public double getSaldo() {
        return sald;
    }
	
    public void setSaldo(double saldo) {
        sald = saldo;
    }
	
    public double deductMonthlyFee() {
        double newSal;
		
        newSal = getSaldo() - 4.00;
        return newSal;
    }

}