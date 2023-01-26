import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;
    Guest guest;
    Guest guest2;
    Guest guest3;

    @BeforeEach
    public void setUp(){
        server = new Server();
        guest = new Guest("John", 23, 150, 55, false, '£');
        guest2 = new Guest("Emily", 16, 3, 34, true, '$');
        guest3 = new Guest("Aya", 30, 3, 70, false, '£');

    }

    // TODO: test that guest can only get served if over 18
    @Test
    void inputGuestOver18(){
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(true);
    }
    @Test
    void inputGuest2Over18(){
        boolean result = server.canServeGuest(guest2);
        assertThat(result).isEqualTo(false);
    }
    @Test
    void inputGuest3Over18(){
        boolean result = server.canServeGuest(guest3);
        assertThat(result).isEqualTo(false);
    }


    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    void inputGuestCanAfford(){
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(true);
    }

    @Test
    void inputGuest2CanAfford(){
        boolean result = server.canServeGuest(guest2);
        assertThat(result).isEqualTo(false);
    }

    @Test
    void inputGuest3CanAfford(){
        boolean result = server.canServeGuest(guest3);
        assertThat(result).isEqualTo(false);
    }


    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    void inputGuestSobrietyLevel(){
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(true);
    }
    @Test
    void inputGuest2SobrietyLevel(){
        boolean result = server.canServeGuest(guest2);
        assertThat(result).isEqualTo(false);
    }
    @Test
    void inputGuest3SobrietyLevel(){
        boolean result = server.canServeGuest(guest3);
        assertThat(result).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    void inputGuestBanStatus(){
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(true);
    }
    @Test
    void inputGuest2BanStatus(){
        boolean result = server.canServeGuest(guest2);
        assertThat(result).isEqualTo(false);
    }
    @Test
    void inputGuest3BanStatus(){
        boolean result = server.canServeGuest(guest3);
        assertThat(result).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    void inputGuestCurrency(){
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(true);
    }
    @Test
    void inputGuest2Currency(){
        boolean result = server.canServeGuest(guest2);
        assertThat(result).isEqualTo(false);
    }
    @Test
    void inputGuest3Currency(){
        boolean result = server.canServeGuest(guest3);
        assertThat(result).isEqualTo(false);
    }


    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
