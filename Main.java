public class Main {

    public static void main(String[] args) {

        //customers 1 and 2
        Customer c1 = new Customer("ahmed" , "ben ahmed");
        Customer c2 = new Customer("sami" , "ben sami");

        // 2 tours added by the travel agency
        System.out.println("--------------------------------");
        Travel_Agency ta1 = new Travel_Agency("lux travels");
        Tour t1 = new Tour("France,Paris,Monaco" , "23/06/2022" , 1499.99 , 300);
        Tour t2 = new Tour("Florida, California" , "15/02/2022" , 3099 , 250);
        ta1.addTour(t1);
        ta1.addTour(t2);

        //Employee modifying tour 1 date and price information
        System.out.println("--------------------------------");
        Employee e1 = new Employee(112 , "Lotfi");
        e1.modifyTour(t1 , "France,Paris,Monaco" , "15/07/2022" , 1349.99 , 300);


        // Testing marketing functionality
        System.out.println("--------------------------------");
        Prio_Customer p1 = new Prio_Customer("lamjed@gmail.com");
        Marketing m1 = new Marketing();
        m1.targetAdvertisement(p1 , " Have a look a our new Europe Tour offers !");


        //Customer 1 "ahmed" reserves a trip then adds a feedback to another trip
        System.out.println("--------------------------------");
        ReservationReceiver rr1 = new ReservationReceiver();
        FeedbackReceiver fr1 = new FeedbackReceiver();

        c1.setCommand(new reservation(rr1));
        c1.buttonWasPressed(t1);

        c1.setCommand(new Feedback(fr1));
        c1.buttonWasPressed(t2);

        // Ahmed then realizes that it does not make sense to give feedback to a trip he never visited
        c1.cancelButtonWasPressed(t2);




        // Sami wants to pay online for a trip he reserved 2 days ago
        System.out.println("--------------------------------");
        onlinePaymentAdapter onlinePaymentAdapter = new onlinePayment(c2);

        onlinePaymentAdapter.pay();

        // Ahmed went the agency location and paid in house
        System.out.println("--------------------------------");
        InhousePaymentAdapter inhousePaymentAdapter = new InhousePayment(c1);

        inhousePaymentAdapter.pay();


    }
}
