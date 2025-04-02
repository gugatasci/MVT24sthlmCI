
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private User user;

    @Test
    public void addUserTest(){
        User user = new User("Kalle","abc123");
    }

    @Test
    public void getNameTest(){
        User user = new User("Kalle","abc123");
        assertEquals("Kalle",user.getUser());
    }

    @Test
    public void getPasswordTest(){
        User user = new User("Kalle","abc123");
        assertEquals("abc123",user.getPassword());
    }
    @Test
    public void changeUserTest(){

        User user = new User("Mehmet","abc123");
        this.user = user;
        assertEquals("Mehmet",user.getUser());

    }
}