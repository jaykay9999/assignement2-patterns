public class ReservationReceiver {

    public void reserveTrip(Tour tour){
        System.out.println(tour.getTourName() + " has been reserved");
        tour.setAvailability(tour.getAvailability() - 1);

    }

    public void cancelReservation(Tour tour){
        System.out.println(tour.getTourName() + " has been cancelled");
        tour.setAvailability(tour.getAvailability() + 1);
    }
}
