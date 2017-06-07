package GoldDigger;

/**
 * bean to hold all form data
 * @author Donovan Poland on 6/6/2017.
 */

public class MyBean {

    //price per weight type: imperial
    private double pricePerOZ;
    private double pricePerPound;
    //price per weight type: metric
    private double pricePerGram;
    private double pricePerKG;
    //input from user about weight of gold: imperial
    private double userOZ;
    private double userPounds;
    //input from user about weight of gold: metric
    private double userGrams;
    private double userKG;
    //karat/carat - purity
    private int karat;

    /**
     * getters
     */
    public double getPricePerOZ() {return pricePerOZ;}
    public double getPricePerGram() {return pricePerGram;}
    public double getPricePerPound() {return pricePerPound;}
    public double getUserOZ() {return userOZ;}
    public double getUserGrams() {return userGrams;}
    public double getUserPounds() {return userPounds;}
    public double getPricePerKG() {return pricePerKG;}
    public double getUserKG() {return userKG;}
    public int getKarat() {return karat;}

    /**
     * setters
     */
    public void setPricePerOZ(double pricePerOZ) {this.pricePerOZ = pricePerOZ;}
    public void setPricePerGram(double pricePerGram) {this.pricePerGram = pricePerGram;}
    public void setPricePerPound(double pricePerPound) {this.pricePerPound = pricePerPound;}
    public void setUserOZ(double userOZ) {this.userOZ = userOZ;}
    public void setUserGrams(double userGrams) {this.userGrams = userGrams;}
    public void setUserPounds(double userPounds) {this.userPounds = userPounds;}
    public void setPricePerKG(double pricePerKG) {this.pricePerKG = pricePerKG;}
    public void setUserKG(double userKG) {this.userKG = userKG;}
    public void setKarat(int karat) {this.karat = karat;}

}//end MyBean class
