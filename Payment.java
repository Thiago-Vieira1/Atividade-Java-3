// Payment interface
interface Payment {
    void pay(double amount);
}

// Concrete implementations of payment methods
class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Foi pago R$" + amount + " com cartão de credito.");
    }
}

class PixPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Foi pago R$" + amount + " com pix.");
    }
}
