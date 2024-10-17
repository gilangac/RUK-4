public class Address {
    private String country;
    private String city;
    private String subdistrict;
    private String village;
    private String street;

    public Address(String Country, String city, String subdistrict, String village, String street) {
        this.country = Country;
        this.city = city;
        this.subdistrict = subdistrict;
        this.village = village;
        this.street = street;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setSubdistrict(String subdistrict){
        this.subdistrict = subdistrict;
    }

    public void setVillage(String village){
        this.village = village;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public String getCountry(String country){
        return this.country;
    }

    public String getCity(String city){
        return this.city;
    }

    public String getSubdistrict(String subdistrict){
        return this.subdistrict;
    }   

    public String getVillage(String village){
        return this.village;
    }

    public String getStreet(String street){
        return this.street;
    }
}
