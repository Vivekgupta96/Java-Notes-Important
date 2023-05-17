package test;

class StudentAddress {
    private String street;
    private String city;
    private String zipCode;

    public StudentAddress(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    // Getters and setters

    @Override
    public String toString() {
        return "StudentAddress [street=" + street + ", city=" + city + ", zipCode=" + zipCode + "]";
    }
}
