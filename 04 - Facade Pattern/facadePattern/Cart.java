package facadePattern;

public class Cart implements HotelService{

    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void execute() {
        requestCart(numberOfCarts);
    }

    public void requestCart(int numberOfCarts){
        System.out.println("[[Proceeding to Cart Service of " + numberOfCarts + " carts]]");
    }
}
