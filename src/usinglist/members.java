package usinglist;

public class members {
    public String name;
    public String password;

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

    public members(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
