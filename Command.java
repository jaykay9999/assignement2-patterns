public interface Command {

    public void execute(Tour tour);

    public void unexecute(Tour tour);
}
