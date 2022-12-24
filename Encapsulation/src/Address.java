public class Address {
    private String flatNo;
    private int pinCode;
    private String societyName;

    public String  getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String  flatNo) {
        this.flatNo = flatNo;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    public static Address getInstance(){
        return new Address();
    }

    @Override
    public String toString() {
        return ", " +
                "Address{" +
                "flatNo=" + flatNo +
                ", pinCode=" + pinCode +
                ", societyName='" + societyName + '\'' +
                '}';
    }
}
