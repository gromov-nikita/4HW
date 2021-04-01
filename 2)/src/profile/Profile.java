package profile;
import java.util.HashMap;
import java.util.Map;
public class Profile {
    private static Map<String, String> profiles = new HashMap<>();
    public Profile(String login, String password) {
        profiles.put(login, password);
    }
    public static void login(String login, String password) throws ProfileNotFoundException {
        if(profiles.get(login) == password) {
            System.out.println("Welcome!!!");
        }
        else {
            try {
                throw new ProfileNotFoundException();
            }
            catch (ProfileNotFoundException ex) {
                ex.output();
            }
        }
    }
}
