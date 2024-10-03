public class Main {
    public static void main(String[] args) {  
        // Carrinho de compras
        ShoppingCart carrinho = ShoppingCart.getInstance();
        
        carrinho.addItem("Leite");
        carrinho.addItem("Toddy");
        carrinho.addItem("Ovo");
        
        System.out.println("Os itens do carrinho é: " + carrinho.getItems());
        
        // Método de pagamentos
        PaymentFactory metodo = new PaymentFactory();
        
        Payment pixPayment = metodo.getPaymentMethod("pix");
        if (pixPayment != null) {
            pixPayment.pay(250.50);
        }
        
        // Notificação do funcionário
        Stock stock = new Stock();
        Subscriber user1 = new User("Roberto");
        Subscriber user2 = new User("Creito");

        stock.registerSubscriber(user1);
        stock.registerSubscriber(user2);

        stock.notifySubscribers("Ovo");

        // Desconto do pagamento
        ShoppingCartWithDiscount desconto = new ShoppingCartWithDiscount(100.00);
 
        desconto.setDiscountStrategy(new HolidayDiscount());
        System.out.println("Preço final com desconto de feriado: R$" + desconto.getFinalPrice());

        desconto.setDiscountStrategy(new LoyaltyDiscount());
        System.out.println("Preço final com desconto de fidelidade: R$" + desconto.getFinalPrice());
    }
}