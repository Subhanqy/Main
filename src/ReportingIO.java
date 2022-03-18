import java.util.ArrayList;
import java.util.Scanner;
//This is our main class that will start the execution of the program
public class ReportingIO {

    public static void main(String[] args) {
        //Scanner object to get input
        Scanner scanner = new Scanner(System.in);
        //Reporting object to deal with branches and sales
        Reporting reporting = new Reporting();
        //Indefinite loop
        while(true) {
            //Menu display
            System.out.println("1- Enter branch data:");
            System.out.println("2- Enter Sale data:");
            System.out.println("3- Branch with largest average value sale for a given year: ");
            System.out.println("4- Highest sale ever reported:");
            System.out.println("5- All sales with value greater than money:");
            System.out.println("6- Exit");

            //Getting user choice
            String choice = scanner.nextLine();
            //Check the case
            switch(choice.trim()) {
                case "1":
                {
                    //Adding branch in the branches list in reporting by getting the name of the branch
                    System.out.println("Enter branch name:");
                    String name = scanner.nextLine();
                    Branch branch = new Branch();
                    branch.setName(name);
                    reporting.addBranch(branch);
                    System.out.println("Branch created!");
                }
                break;
                case "2":
                {
                    //Asking for branch if exist get sales data and add sales else print not found!
                    System.out.println("Enter name of the branch to add sale: ");
                    String name = scanner.nextLine();
                    boolean flag = true;
                    for(int i = 0; i < reporting.getBranches().size(); i++) {
                        if(reporting.getBranches().get(i).getName().equals(name)) {
                            flag = false;
                            System.out.println("Enter house number: ");
                            String house = scanner.nextLine();
                            System.out.println("Enter postcode: ");
                            String postCode = scanner.nextLine();
                            System.out.println("Enter value: ");
                            double value = Double.parseDouble(scanner.nextLine());
                            System.out.println("Enter month: ");
                            int month = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter year: ");
                            int year = Integer.parseInt(scanner.nextLine());
                            reporting.getBranches().get(i).getSales().add(new Sale(house, postCode, value, month, year));
                            break;
                        }

                    }
                    if(flag) {
                        System.out.println("Branch not found!");
                    }
                    else {
                        System.out.println("Sale added!");
                    }
                }
                break;
                case "3":
                {
                    //Get year and print average value sale in the year
                    System.out.println("Enter year: ");
                    int year = Integer.parseInt(scanner.nextLine());
                    System.out.println("The branch with largest average value sale for the year " + year + " = " + reporting.geLargestAverageBranch(year));
                }
                break;
                case "4":
                {
                    //print the greater sale ever
                    System.out.println("The greatest sale ever:");
                    System.out.println(reporting.highestSale());
                }
                break;
                case "5":
                {
                    //get money and print all the sales greater than the money
                    System.out.println("Enter money: ");
                    double money = Double.parseDouble(scanner.nextLine());
                    System.out.println("All sales with value greater than " + money);
                    ArrayList<Sale> sales = reporting.allSales(money);
                    for(Sale sale: sales) {
                        System.out.println(sale);
                    }
                }
                break;
                case "6":
                    //Exit the program
                    System.exit(0);
                default:
                    //Print wrong choice if none of the above options selected
                    System.out.println("Wrong choice!");
            }
        }
    }

}

