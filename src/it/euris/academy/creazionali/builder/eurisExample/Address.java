package it.euris.academy.creazionali.builder.eurisExample;

public class Address {
    private String country;
    private String address;
    private String postalCode;

    public Address(String country, String address, String postalCode) {
        this.country = country;
        this.address = address;
        this.postalCode = postalCode;
    }

    private Address(){}

    public static class AddressBuilder{
        private Address address;

        private AddressBuilder(){
            this.address = new Address();
        }

        public static AddressBuilder builder(){
            return new AddressBuilder();
        }

        public Address build(){
            return this.address;
        }

        public AddressBuilder setCountry(String country){
            this.address.country = country;
            return this;
        }

        public AddressBuilder setAddress(String address){
            this.address.address = address;
            return this;
        }

        public AddressBuilder setPostalCode(String postalCode){
            this.address.postalCode = postalCode;
            return this;
        }
    }
}
