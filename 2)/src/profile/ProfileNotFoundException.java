package profile;

public class ProfileNotFoundException extends Exception {
    public void output() {
        System.err.println("Wrong login or password");
    }
}
