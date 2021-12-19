public class Feedback implements Command{

    FeedbackReceiver receiver;

    public Feedback(FeedbackReceiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(Tour tour) {
        receiver.addFeedback(tour);
    }

    @Override
    public void unexecute(Tour tour){
        receiver.removeFeedback(tour);
    }
}
