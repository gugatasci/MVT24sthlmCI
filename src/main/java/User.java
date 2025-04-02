public class User {
    private String user,password;

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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