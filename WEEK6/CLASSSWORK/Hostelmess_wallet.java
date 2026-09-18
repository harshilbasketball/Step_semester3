class MessWallet {
    private double balance;

    public MessWallet(double balance) {
        if (balance < 0) {
            System.out.println("Warning: Negative balance. Starting with 0.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid top-up amount.");
        } else {
            balance += amount;
        }
    }

    public void deduct(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid deduction amount.");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Hostelmess_wallet {
    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(1000);

        wallet.topUp(500);
        wallet.deduct(300);

        System.out.println("Balance: " + wallet.getBalance());
    }
}