//Sales class
public class Sale {
    //Data Attributes
    private String houseNumber;
    private String postCode;
    private double value;
    int month;
    int year;

    //Default constructor
    public Sale() {
        this.houseNumber = "";
        this.postCode = "";
        this.value = 0;
        this.month = 0;
        this.year = 0;
    }

    //Parameterized constructor
    public Sale(String houseNumber, String postCode, double value, int month, int year) {
        this.houseNumber = houseNumber;
        this.postCode = postCode;
        this.value = value;
        this.month = month;
        this.year = year;
    }

    //Getter and setters
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //String representation of the sale object

    public String toString() {
        String temp = "House number: " + houseNumber + "\n";
        temp += "Post Code: " + postCode + "\n";
        temp += "Value: " + value + "\n";
        temp += "Month: " + month + "\n";
        temp += "Year: " + year + "\n";
        return temp;
    }


}

