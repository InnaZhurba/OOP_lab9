package Builder;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user = User.builder()
            .firstName("Inna")
            .lastName("Zhurba")
            .age(20)
            .gender("f")
            .occupation("smth")
            .occupation("smth2")
            .weight(58)
            .build();
    @Test
    void testToString() {
        assertEquals(
                "User(firstName=Inna, lastName=Zhurba, occupations=[smth, smth2], gender=f, age=20, weight=58)",
        user.toString()
        );
    }

    @Test
    void builder() {
        User user1 = User.builder()
                .firstName("Inna")
                .lastName("Zhurba")
                .age(20)
                .gender("m")
                .occupation("smth")
                .occupation("smth2")
                .weight(58)
                .build();
        assertNotEquals(user,user1);
    }
}