package Parsers;


public class MadaReport {
    private String MDACODE;
    private String IDNum;
    private String IDType;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private String buildingNumber;
    private String barcode;
    private String getDate;
    private String takeDate;
    private String resultDate;

    public MadaReport(String MDACODE, String IDNum, String IDType, String firstName, String lastName, String city, String street, String buildingNumber, String barcode, String getDate, String takeDate, String resultDate) {
        this.MDACODE = MDACODE;
        this.IDNum = IDNum;
        this.IDType = IDType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.barcode = barcode;
        this.getDate = getDate;
        this.takeDate = takeDate;
        this.resultDate = resultDate;
    }

    public String getMDACODE() {
        return MDACODE;
    }

    public void setMDACODE(String MDACODE) {
        this.MDACODE = MDACODE;
    }

    public String getIDNum() {
        return IDNum;
    }

    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public String getIDType() {
        return IDType;
    }

    public void setIDType(String IDType) {
        this.IDType = IDType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getGetDate() {
        return getDate;
    }

    public void setGetDate(String getDate) {
        this.getDate = getDate;
    }

    public String getTakeDate() {
        return takeDate;
    }

    public void setTakeDate(String takeDate) {
        this.takeDate = takeDate;
    }

    public String getResultDate() {
        return resultDate;
    }

    public void setResultDate(String resultDate) {
        this.resultDate = resultDate;
    }
}