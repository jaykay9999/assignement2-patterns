public class Customer implements Payment{

    private String firstName ;
    private String lastName ;
    Command slot;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {

    }

    public void setCommand(Command command){
        slot = command ;
    }

    public void buttonWasPressed(Tour tour){
        slot.execute(tour);
    }

    public void cancelButtonWasPressed(Tour tour){
        slot.unexecute(tour);
    }

    public void pay(){
        System.out.println("paid");
    }
}
