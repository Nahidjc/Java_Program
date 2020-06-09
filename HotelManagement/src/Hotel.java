
public class Hotel {
   
    
    
    public int  hotelNumber;
    public String  hotelName;
    public String  address;
    public int TotalNumberOfRooms;
    public int NumberOfBookRooms;

    public Hotel(int hotelNumber, String hotelName, String address, int TotalNumberOfRooms, int NumberOfBookRooms) {
        this.hotelNumber = hotelNumber;
        this.hotelName = hotelName;
        this.address = address;
        this.TotalNumberOfRooms = TotalNumberOfRooms;
        this.NumberOfBookRooms = NumberOfBookRooms;
    }

    Hotel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   public int NumberOfAvailableRooms (){
        return 0;
       
   }
   public String toString (){
        return hotelNumber+" "+hotelName+" "+address+" "+TotalNumberOfRooms+" "+NumberOfBookRooms;
       
   }
}
