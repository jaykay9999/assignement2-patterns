public class Travel_Agency {

    private String name;

    public Travel_Agency(String name) {
        this.name = name;
    }

    public void addTour(Tour tour){
        System.out.println(tour.getTourName() + ": has been added to the server ");
    }

}
