package araçkiralamasystem;
public class User {
    private  String name;
    private  String surname;
    private String Id;

    public User(String name, String surname, String Id) {
        this.name = name;
        this.surname = surname;
        this.Id = Id;
        
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
}
