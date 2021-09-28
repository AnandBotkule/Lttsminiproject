package Question2;
public class SuiteAcRoom extends HotelRoom {
    private int ratePerSqFeet;
    public SuiteAcRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi){
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        ratePerSqFeet=15;
        

    }
    public int getRatePerSqFeet(){
        if(hasWifi){
            return ratePerSqFeet+2;
        }
        else{
            return ratePerSqFeet;
        }
    }
    
}
