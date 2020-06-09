
public class main {

  
    public static void main(String[] args) {
      Hotel aHotel= new Hotel();
      customer aCustomer = new customer();
        
      aCustomer.FullName="Nahid";
      aCustomer.address="Munshiganj";
      aCustomer.phone="01910125428";
        System.out.println(aCustomer.toString());
        
    aHotel.NumberOfBookRooms=12;
    aHotel.TotalNumberOfRooms=10;
    aHotel.address="Dhaka";
    aHotel.hotelNumber=100001;
    aHotel.hotelName="redison";
        System.out.println(aHotel.toString());
    }
    
}
