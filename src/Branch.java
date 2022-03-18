import java.util.ArrayList;
//class branch
public class Branch {
    //attrinutes
    //tos store name of the branch
    private String name;
    //sales by the branch
    private ArrayList<Sale> sales;
    //default constructor
    public Branch() {
        this.name = "";
        this.sales = new ArrayList<Sale>();
    }

    //parameterized constructor
    public Branch(String name, ArrayList<Sale> sales) {
        this.name = name;
        this.sales = sales;
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Sale> getSales() {
        return sales;
    }
    public void setSales(ArrayList<Sale> sales) {
        this.sales = sales;
    }

    public void addSale(Sale sale) {
        sales.add(sale);
    }

    //return the highest Sale of the branch
    public Sale highestSale() {
        int max = 0;
        if(sales.size() != 0) {
            Sale maxSale = sales.get(0);
            for(int i = 1; i < sales.size(); i++) {
                if(maxSale.getValue() < sales.get(i).getValue()) {
                    maxSale = sales.get(i);
                    max = i;
                }
            }
        }
        return sales.get(max);
    }

    //return the average Sale of the branch in the given year
    public double averageSale(int year) {
        int count = 0;
        double sum = 0;
        for(int i = 0; i < sales.size(); i++) {
            if(sales.get(i).getYear() == year) {
                sum += sales.get(i).getValue();
                count++;
            }
        }
        if(count != 0) {
            return sum / count;
        }
        else {
            return 0.0;
        }
    }

    //return the sales whose value is greater than given money
    public ArrayList<Sale> getGreaterSales(double money) {
        ArrayList<Sale> temp = new ArrayList<Sale>();
        for(int i = 0; i < sales.size(); i++) {
            if(sales.get(i).getValue() > money) {
                temp.add(sales.get(i));
            }
        }
        return temp;
    }

    //String representation of the branch object
    public String toString() {
        return name;
    }

}
