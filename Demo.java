public class Demo {
    public static void main(String args[]) {

        Product P1 = new Product("Swera", 4200, 2);
        System.out.println("Information of first object");
        P1.displayProduct();

        Product P2 = new Product("Aamna", 4500, 3);
        System.out.println("Information of second object");
        P2.displayProduct();

        Product P3 = new Product("Maheen", 9000, 7);
        System.out.println("Information of third object");
        P3.displayProduct();

        Product P4 = new Product("Abeeha", 2000, 6);
        System.out.println("Information of fourth object");
        P4.displayProduct();

        Product.displayMaxMin();
    }
}