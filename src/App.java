public class App {
    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println("==================================");
        System.out.println("Hi! welcome to the inventory control App");

        Inventory_control<String> myAccount = new Inventory_control<>("Yuya Minamide");

        myAccount.showMenu();
    }
}
