package server.Containers;

public class RegisterPageContainer {

    private  String name;
    private  String surname;
    private  String fn;
    private  String email;
    private  String password;

    public void setName(String name){
        this.name = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setFn(String fn){
        this.fn = fn;
    }

    public String getFn(){
        return fn;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

}

