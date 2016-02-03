package Luna.customer;

public class Customer {
    private String name;
    public void setName(String person){name = person;}
    public String getName(){return name;}

    private String address;
    public void setAddress(String place){address = place;}
    public String getAddress(){return address;}

    private String city;
    public void setCity(String town){city = town;}
    public String getCity(){return city;}

    private String state;
    public void setState(String st){state = st;}
    public String getState(){return state;}

    private String postalCode;
    public void setPostalCode(String zip){postalCode = zip;}
    public String getPostalCode(){return postalCode;}


    public String getNameAndAddress () {
        return getName() + '\n' + getAddress() + '\n' +
                getCity() + ',' + getState() + getPostalCode() ;
    }



}
