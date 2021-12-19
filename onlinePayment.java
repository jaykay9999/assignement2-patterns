public class onlinePayment implements onlinePaymentAdapter {

    private Payment onlinepayment ;

    public onlinePayment(Payment onlinepayment) {
        this.onlinepayment = onlinepayment;
    }

    @Override
    public void pay(){
        System.out.println("successfully paid online :)");
    }


}
