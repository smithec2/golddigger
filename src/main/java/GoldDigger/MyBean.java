package GoldDigger;

/**
 * bean to hold all form data
 * @author Donovan Poland on 6/6/2017.
 */
public class MyBean {

    //price per weight type
    private double pricePerOZ;
    private double pricePerGram;
    private double pricePerPound;
    //input from user about weight of gold
    private double userOZ;
    private double userGrams;
    private double userPounds;

    /**
     * getters
     */
    public double getPricePerOZ() {return pricePerOZ;}
    public double getPricePerGram() {return pricePerGram;}
    public double getPricePerPound() {return pricePerPound;}
    public double getUserOZ() {return userOZ;}
    public double getUserGrams() {return userGrams;}
    public double getUserPounds() {return userPounds;}

    /**
     * setters
     */
    public void setPricePerOZ(double pricePerOZ) {this.pricePerOZ = pricePerOZ;}
    public void setPricePerGram(double pricePerGram) {this.pricePerGram = pricePerGram;}
    public void setPricePerPound(double pricePerPound) {this.pricePerPound = pricePerPound;}
    public void setUserOZ(double userOZ) {this.userOZ = userOZ;}
    public void setUserGrams(double userGrams) {this.userGrams = userGrams;}
    public void setUserPounds(double userPounds) {this.userPounds = userPounds;}
}//end MyBean class
