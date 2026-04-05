package shopping;
import java.util.*;
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        if (productId <= 0) {
            throw new IllegalArgumentException("Product ID must be positive.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero.");
        }

        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getDetails();
}


class ElectronicsProduct extends Product {
    public ElectronicsProduct(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public String getDetails() {
        return "Electronics Product [ID=" + getProductId() +
                ", Name=" + getName() +
                ", Price=" + getPrice() + "]";
    }
}


class FashionProduct extends Product {
    public FashionProduct(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public String getDetails() {
        return "Fashion Product [ID=" + getProductId() +
                ", Name=" + getName() +
                ", Price=" + getPrice() + "]";
    }
}


class BeautyProduct extends Product {
    public BeautyProduct(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public String getDetails() {
        return "Beauty Product [ID=" + getProductId() +
                ", Name=" + getName() +
                ", Price=" + getPrice() + "]";
    }
}


class HomeProduct extends Product {
    public HomeProduct(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public String getDetails() {
        return "Home Product [ID=" + getProductId() +
                ", Name=" + getName() +
                ", Price=" + getPrice() + "]";
    }
}


class GroceryProduct extends Product {
    public GroceryProduct(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public String getDetails() {
        return "Grocery Product [ID=" + getProductId() +
                ", Name=" + getName() +
                ", Price=" + getPrice() + "]";
    }
}


class Wishlist {
    private ArrayList<Product> products;

    public Wishlist() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        for (Product p : products) {
            if (p.getProductId() == product.getProductId()) {
                System.out.println("Duplicate Product ID not allowed.");
                return;
            }
        }
        products.add(product);
    }

    public void displayWishlist() {
        if (products.isEmpty()) {
            System.out.println("Wishlist is empty.");
            return;
        }

        System.out.println("\n===== WISHLIST ITEMS =====");
        for (Product p : products) {
            System.out.println(p.getDetails());
        }
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}


class User {
    private int userId;
    private String userName;
    private Wishlist wishlist;

    public User(int userId, String userName) {
        if (userId <= 0) {
            throw new IllegalArgumentException("User ID must be positive.");
        }
        if (userName == null || userName.trim().isEmpty()) {
            throw new IllegalArgumentException("User name cannot be empty.");
        }

        this.userId = userId;
        this.userName = userName;
        this.wishlist = new Wishlist();
    }

    public Wishlist getWishlist() {
        return wishlist;
    }

    public void displayUserInfo() {
        System.out.println("\n===== USER DETAILS =====");
        System.out.println("User ID   : " + userId);
        System.out.println("User Name : " + userName);
    }
}


public class WishlistSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("===== SHOPPING WISHLIST SYSTEM =====");

            // User Details
            System.out.print("Enter User ID: ");
            int userId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter User Name: ");
            String userName = sc.nextLine();

            User user = new User(userId, userName);

            // Number of items
            System.out.print("Enter number of wishlist items: ");
            int n = sc.nextInt();
            sc.nextLine();

            // Input all products
            for (int i = 1; i <= n; i++) {
                System.out.println("\nEnter details for Item " + i);

                System.out.println("Select Product Type:");
                System.out.println("1. Electronics");
                System.out.println("2. Fashion");
                System.out.println("3. Beauty");
                System.out.println("4. Home");
                System.out.println("5. Grocery");
                System.out.print("Enter type: ");
                int type = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Product ID: ");
                int pid = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Product Name: ");
                String pname = sc.nextLine();

                System.out.print("Enter Product Price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                Product product = null;

                if (type == 1) {
                    product = new ElectronicsProduct(pid, pname, price);
                } else if (type == 2) {
                    product = new FashionProduct(pid, pname, price);
                } else if (type == 3) {
                    product = new BeautyProduct(pid, pname, price);
                } else if (type == 4) {
                    product = new HomeProduct(pid, pname, price);
                } else if (type == 5) {
                    product = new GroceryProduct(pid, pname, price);
                } else {
                    System.out.println("Invalid product type. Item skipped.");
                }

                if (product != null) {
                    user.getWishlist().addProduct(product);
                }
            }

            // Budget input
            System.out.print("\nEnter your overall budget: ");
            double budget = sc.nextDouble();

            // Output
            user.displayUserInfo();
            user.getWishlist().displayWishlist();

            double totalCost = user.getWishlist().calculateTotalCost();

            System.out.println("\n===== PURCHASE ANALYSIS =====");
            System.out.println("Total Wishlist Cost : " + totalCost);
            System.out.println("Overall Budget      : " + budget);

            if (totalCost <= budget) {
                System.out.println("Conclusion: YES, you are able to buy all the items in your wishlist.");
                System.out.println("Remaining Budget: " + (budget - totalCost));
            } else {
                System.out.println("Conclusion: NO, you are NOT able to buy all the items in your wishlist.");
                System.out.println("Budget Exceeded By: " + (totalCost - budget));
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input type entered.");
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}