package P_Aeroporto;

public class Utente {
    private String login, password;

    public Utente(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getLogin() {
        return login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}
