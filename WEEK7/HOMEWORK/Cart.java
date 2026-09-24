class ShoppingCart {
    private int[] prices;
    private int count;
    private final String cartId;

    ShoppingCart(String cartId, int size) {
        this.cartId = cartId;
        prices = new int[size];
        count = 0;
    }

    public void addItem(int price) {
        if (count < prices.length) {
            prices[count] = price;
            count++;
        }
    }

    public int getTotal() {
        int total = 0;

        for (int i = 0; i < count; i++) {
            total = total + prices[i];
        }

        return total;
    }

    public int getItemCount() {
        return count;
    }

    public String getCartId() {
        return cartId;
    }
}

public class Cart {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println(cart.getTotal());
        System.out.println(cart.getItemCount());
    }
}
