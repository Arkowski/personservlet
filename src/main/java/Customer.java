/**
 * Created by Michał Makaruk on 28.05.2017.
 */
public class Customer {

    private String name;
    private String password;
    private GENDER gender;
    private String hobby[];

    public Customer() {

    }

    public Customer(String name, String password, GENDER gender, String[] hobby) {
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }
}
