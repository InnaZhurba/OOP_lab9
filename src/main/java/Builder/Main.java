package Builder;

public class Main {
    public static void main(String args[]){
        User user = User.builder()
                .firstName("Inna")
                .lastName("Zhurba")
                .age(20)
                .gender("f")
                .occupation("smth")
                .occupation("smth2")
                .weight(58)
                .build();

        System.out.println(user.toString());
    }
}
