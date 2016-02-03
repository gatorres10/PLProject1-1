package Luna.customer;

public class CustomerDB {

    public static String getCustomer(int idNum){
        Customer storeCustomer = new Customer();
        String output;

        if (idNum == 1001){
            storeCustomer.setName("Barbara White");
            storeCustomer.setAddress("3400 Richmond Parkway #3423");
            storeCustomer.setCity("Bristol");
            storeCustomer.setState("CT");
            storeCustomer.setPostalCode("06010");
            output = storeCustomer.getNameAndAddress();
        } else if (idNum == 1002){
            storeCustomer.setName("Karl Vang");
            storeCustomer.setAddress("327 Franklin Street");
            storeCustomer.setCity("Edina");
            storeCustomer.setState("MN");
            storeCustomer.setPostalCode("55435");
            output = storeCustomer.getNameAndAddress();
        } else if (idNum == 1003){
            storeCustomer.setName("Ronda Chavan");
            storeCustomer.setAddress("518 Commanche Dr.");
            storeCustomer.setCity("Greensboro");
            storeCustomer.setState("NC");
            storeCustomer.setPostalCode("27410");
            output = storeCustomer.getNameAndAddress();
        } else {
            output = "There is no customer number " + idNum + " in our records.";
        } return output;
    }
}
