class Payment{
    double card_Amount;
    double Wallet_Amount;
    double BankTransfer_Amount;

    double updateCardAmount;
    double updatewalletAmount;
    double updateBankTransferAmount;
    double total;

    Payment(double card_Amount,double Wallet_Amount,double BankTransfer_Amount){
        this.card_Amount = card_Amount;
        this.Wallet_Amount = Wallet_Amount;
        this.BankTransfer_Amount = BankTransfer_Amount;

        

    }
    void updateAmount(){
        updateCardAmount = card_Amount + (card_Amount*0.02);
        updatewalletAmount = Wallet_Amount + (Wallet_Amount*0.01);
        updateBankTransferAmount = BankTransfer_Amount;
        total =  updateCardAmount+ updatewalletAmount+ updateBankTransferAmount;

        }
    void display(){
        System.out.println("CARD: " +updateCardAmount );
        System.out.println("Wallet: " +updatewalletAmount );
        System.out.println("Bank_Transfer: " +updateBankTransferAmount );
        System.out.println("Total: " + total );
    }

}
public class  Payement{
    public static void main(String[] args) {
        Payment p = new Payment(1000,500,2000);
        p.updateAmount();
        p.display();
        

    }

}