public class Prio_Customer extends Customer {

    private String email ;

    public Prio_Customer(String email){
        super();
        this.email = email;
    }

    public Prio_Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void receiveMail(String mail){
        System.out.println(this.getEmail() + " has received an advertisement");
    }
}
