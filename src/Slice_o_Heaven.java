public class Slice_o_Heaven {
    public String storeName;
    public String storeAddress;
    public String storeEmail;
    public long storePhone;
    public String storeMenu;
    public String  pizzaIngredients;
    public double pizzaPrice;
    public String sides;
    public String drinks;
    private String orderID;
    private double orderTotal;
    public Slice_o_Heaven(String storeName, String storeAddress, String storeEmail, long storePhone,
                          String storeMenu, String pizzaIngredients, double pizzaPrice,
                          String sides, String drinks) {
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeEmail = storeEmail;
        this.storePhone = storePhone;
        this.storeMenu = storeMenu;
        this.pizzaIngredients = pizzaIngredients;
        this.pizzaPrice = pizzaPrice;
        this.sides = sides;
        this.drinks = drinks;
    }
    public void takeOrder(String id, int pizzaCount, String sideChoice, String drinkChoice) {
        orderID = id;
        orderTotal = pizzaCount * pizzaPrice;
        System.out.println("Order accepted!");
        System.out.println("Order details: " + pizzaCount + " pizzas, " + sideChoice + ", " + drinkChoice);
        makePizza();
        printReceipt();
    }
    public void makePizza() {
        System.out.println("Starting to make pizza...");
        System.out.println("Pizza ingredients:");
        for (String ingredient : pizzaIngredients) {
            System.out.println("- " + ingredient);
        }
        System.out.println("Pizza is ready!");
    }
    public void printReceipt() {
        System.out.println("********RECEIPT********");
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Address: " + storeAddress);
        System.out.println("Store Email: " + storeEmail);
        System.out.println("Store Phone: " + storePhone);
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Total: $" + orderTotal);
        System.out.println("***********************");
    }
}