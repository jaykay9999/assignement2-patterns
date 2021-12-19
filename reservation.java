public class reservation implements Command{

    ReservationReceiver receiver ;

    public reservation(ReservationReceiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(Tour tour){
        receiver.reserveTrip(tour);
    }

    @Override
    public void unexecute(Tour tour){
        receiver.cancelReservation(tour);
    }
}
