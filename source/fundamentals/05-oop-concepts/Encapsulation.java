public class Encapsulation {
    public static void main(String[] args) {
        // Crear una billetera con un saldo inicial
        Wallet savingsWallet = new Wallet(1000.0);

        // Retiro de dinero de la billetera
        savingsWallet.withdraw(250.0);
        System.out.println("Saldo de la billetera de ahorros: $" + savingsWallet.getBalance());
        // Retirar un monto mayor al saldo disponible
        savingsWallet.withdraw(1200.0);
        // Retirar un monto negativo, el cual no es válido
        savingsWallet.withdraw(-50.0);
        // Retirar un monto de 0.0, el cual no es válido
        savingsWallet.withdraw(0.0);
    }
}

/**
 * Esta clase representa una billetera simple que puede contener un saldo.
 * Permite depositar y retirar dinero.
 * 
 * Demuestra el uso de encapsulación y principios básicos de OOP.
 * Evitando el acceso directo a los atributos de la clase, en este caso el
 * saldo.
 * 
 * @version 1.0
 */
class Wallet {
    private double balance;

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Se ha acreditado un monto de: $" + amount + " a la billetera.");
        } else {
            System.out.println("Monto inválido");
        }
    }

    /**
     * Retira un monto de la billetera.
     * 
     * @param amount El monto a retirar
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Se ha debitado un monto de $" + amount + " de la billetera.");
        } else {
            System.out.println("Monto inválido o saldo insuficiente");
        }
    }

    public double getBalance() {
        return balance;
    }
}
