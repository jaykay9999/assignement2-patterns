public class Tour {

    private String tourName ;
    private  String date ;
    private double price ;
    public int availability ;
    public String feedback ;



    public String getFeedbacks() {
        return feedback;
    }


    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Tour(String tourName, String date, double price, int availability) {
        this.tourName = tourName;
        this.date = date;
        this.price = price;
        this.availability = availability;

    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
