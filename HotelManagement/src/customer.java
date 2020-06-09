
public class customer {
    public String FullName;
    public String phone;
    public String address;

    customer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public String toString (){
        
        return FullName+" "+address+" "+phone;
        
    }

    public customer(String FullName, String phone, String address) {
        this.FullName = FullName;
        this.phone = phone;
        this.address = address;
    }

   
}
