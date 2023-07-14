package Homeworks.L121314_HW_Java_Collections;

public class User {
    private String login;
    private String password;
    boolean doVote = false;
    boolean isAdmin = false;

    User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
