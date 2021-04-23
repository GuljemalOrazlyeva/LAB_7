package bsu.rfct.orazlyeva.lab__7;

public class User {
    // private ArrayList<User> UserInfo = new ArrayList<>(10);
    private String name;
    private String addres;

    public User (String name, String addres) {
        this.name = name;
        this.addres = addres;
    }
    public String getName() {
        return name;
    }
    // public ArrayList<User> getUsers() { return UserInfo; }
    public String getAddres(){
        return addres;
    }
}
