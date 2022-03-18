import java.util.ArrayList;

//Reporting class
public class Reporting {
    //Data attribute list of branches
    ArrayList<Branch> branches;

    //Default constructor
    public Reporting() {
        branches = new ArrayList<Branch>();
    }

    //Parameterized constructor
    public Reporting(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    //Getter and setter
    public ArrayList<Branch> getBranches() {
        return branches;
    }


    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    //Function to add branch in the list of branches
    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    //Functio to return the branch with the largest sale in the year
    public Branch geLargestAverageBranch(int year) {
        Branch max = null;
        if(branches.size() != 0) {
            max = branches.get(0);
            for(Branch branch:branches) {
                if(branch.averageSale(year) > max.averageSale(year)) {
                    max = branch;
                }
            }
        }
        return max;
    }

    //return the highestSale ever
    public Sale highestSale() {
        Sale sale = null;
        if(branches.size() != 0) {
            sale = branches.get(0).highestSale();
            for(Branch branch: branches) {
                if(sale.getValue() < branch.highestSale().getValue()) {
                    sale = branch.highestSale();
                }
            }
        }
        return sale;
    }

    //return all the sales greater than the provided money
    public ArrayList<Sale> allSales(double money) {
        ArrayList<Sale> temp = new ArrayList<Sale>();
        for(Branch branch: branches) {
            temp.addAll(branch.getGreaterSales(money));
        }
        return temp;
    }
}

