public class Address {
    public Address(String street, int houseNumber, int flatNumber, String postCode, String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.postCode = postCode;
        this.city = city;
    }

    private String street;
    private int houseNumber;
    private int flatNumber;
    private String postCode;
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", flatNumber=" + flatNumber +
                ", postCode='" + postCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
