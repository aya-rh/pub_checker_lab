import java.util.ArrayList;

public class Server {
    private ArrayList<String> drinks;

    public Server(){


    }
    public boolean canServeGuest(Guest guest) {

        // if guest is over 18
        // if guest has over £5
        // if guest is sober
        // if guest is not banned
        // if guest is paying in local currency

        char acceptedCurrency = '£';

        if (guest.getAge() >= 18 && guest.getWallet() >= 5 && guest.getSobriety() >= 50 && guest.isChar() == acceptedCurrency) {
            return true;
        } else {
            return false;
        }


//        THIS WILL NOT TEST FOR IF A GUEST HAS ONE TRUE AND ONE FALSE
//        if (guest.getAge() >= 18) {
//            return true;
//        } else if (guest.getWallet() >= 5) {
//            return true;
//        } else if (guest.getSobriety() >= 50) {
//            return true;
//        } else if (guest.isChar() == acceptedCurrency) {
//            return true;
//        } else {
//            return false;
//        }

    }
}