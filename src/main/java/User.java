public class User {
    private String user,password;

    User(String user, String pwd){
        this.user = user;
        this.password = pwd;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}