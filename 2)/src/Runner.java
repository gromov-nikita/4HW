import profile.Profile;
import profile.ProfileNotFoundException;

/*
2. Создать класс, содержащий  логин/пароль пользователя
Создать метод, который принимает на вход данный объект, если параметры ошибочны -
выбросить исключение (создать собственное исключение)
 */
public class Runner {
    public static void main(String[] args) throws ProfileNotFoundException {
        Profile[] array = new Profile[5];
        array[0] = new Profile("Nick", "1234567");
        array[1] = new Profile("Hanna", "qwer34");
        array[2] = new Profile("Sasha", "4590");
        array[3] = new Profile("Illa", "04832");
        array[4] = new Profile("Hamster", "228");
        Profile.login("Saha","4590");
    }
}
