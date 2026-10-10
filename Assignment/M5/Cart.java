package assignment.m5;

public class Cart {
    private final double[] prices;
    private int itemCount;
    private final String cartId;

    public Cart(String cartId, int maxItems) {
        if (maxItems < 0) {
            throw new IllegalArgumentException("Maximum items cannot be negative.");
        }
        this.cartId = cartId;
        this.prices = new double[maxItems];
        this.itemCount = 0;
    }

    public boolean addItem(double price) {
        if (price < 0 || itemCount == prices.length) {
            return false;
        }
        prices[itemCount] = price;
        itemCount++;
        return true;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += prices[i];
        }
        return total;
    }

    public int getItemCount() {
        return itemCount;
    }

    public String getCartId() {
        return cartId;
    }

    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("Cart ID: " + cart.getCartId());
        System.out.println("Total: " + cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());
    }
}
