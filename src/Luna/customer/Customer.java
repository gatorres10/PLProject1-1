package Luna.customer;

public class Customer {
    private String name;
    private String address;
    private String city;
    private String state;
    private String postalCode;


    public void setName(String person){name = person;}
    public String getName(){return name;}

    public void setAddress(String place){address = place;}
    public String getAddress(){return address;}

    public void setCity(String town){city = town;}
    public String getCity(){return city;}

    public void setState(String st){state = st;}
    public String getState(){return state;}

    public void setPostalCode(String zip){postalCode = zip;}
    public String getPostalCode(){return postalCode;}

    public String getNameAndAddress () {
        return getName() + '\n' + getAddress() + '\n' +
                getCity() + ',' + getState() + getPostalCode() ;
    }



}
