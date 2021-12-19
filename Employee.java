public class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void modifyTour(Tour tour , String name , String date , double price , int availability){

        tour.setTourName(name);
        tour.setDate(date);
        tour.setPrice(price);
        tour.setAvailability(availability);
        System.out.println("Tour : " + tour.getTourName() + " has been modified by " + this.getName());

    }
}
