
public class patient {
    private String Name;
     private String ID;
     private String Address;
       private String MobilePhone;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getMobilePhone() {
        return MobilePhone;
    }

    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }
      

    patient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public String  toString(){
        return Name+" "+ID+" "+Address+" "+MobilePhone;
         
     }

    public patient(String Name, String ID, String Address, String MobilePhone) {
        this.Name = Name;
        this.ID = ID;
        this.Address = Address;
        this.MobilePhone = MobilePhone;
    }
}
