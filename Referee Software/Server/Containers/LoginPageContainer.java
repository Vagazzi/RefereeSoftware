package server.Containers;



public class LoginPageContainer {
    private String login;
    private String password;
    private Long id;

    public  String getLogin() {
        return login;
    }

    public  void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
