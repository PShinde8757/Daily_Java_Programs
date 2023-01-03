public class Address {
    String flatNo;
    String lane;
    String city;
    int pinCode;

    public Address(String flatNo, String lane, String city, int pinCode) {
        this.flatNo = flatNo;
        this.lane = lane;
        this.city=city;
        this.pinCode = pinCode;
    }


    @Override
    public String toString() {
        return "Address{" +
                "flatNo='" + flatNo + '\'' +
                ", lane='" + lane + '\'' +
                ", city='" + city + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
