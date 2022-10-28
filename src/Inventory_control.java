import java.util.*;

public class Inventory_control<type1> {

    private final String accountName;

    public Inventory_control(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void showMenu() {

        String option = "0";
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();

        System.out.println(this.accountName);
        do {
            System.out.println("==================================");
            System.out.println("1. Check inventory");
            System.out.println("2. Add stuff");
            System.out.println("3. Take something out");
            System.out.println("4. Log-out");
            System.out.println("==================================");

            System.out.print("Enter an option: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println("==================================");
                    if (hashSet.size() != 0) {
                        System.out.println("You have these things in your fridge " + hashSet);
                    } else {
                        System.out.println("Your fridge is empty!");
                    }
                    System.out.println();
                    break;
                case "2":
                    System.out.print("Enter what you will put in fridge: ");
                    String addStuff = scanner.nextLine();
                    System.out.println();
                    hashSet.add(addStuff);
                    System.out.println();
                    break;
                case "3":
                    System.out.print("Enter a stuff what you want: ");
                    String removeStuff = scanner.nextLine();
                    if (hashSet.size() != 0) {
                        if (hashSet.contains(removeStuff)) {
                            hashSet.remove(removeStuff);
                        } else {
                            System.out.println("==================================");
                            System.out.println("Your fridge doesn't have it....");
                        }
                    } else {
                        System.out.println("==================================");
                        System.out.println("Your fridge is empty");
                    }
                    System.out.println();
                    break;
                case "4":
                    System.out.println("==================================");
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid option! Please enter again.");
                    break;
            }
        } while (!option.equals("4"));
        System.out.println("Thank you for using our services!");
        System.out.println();
    }
}
