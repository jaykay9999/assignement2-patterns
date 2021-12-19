public class InhousePayment implements InhousePaymentAdapter{

    private Payment inhousepayment ;

    public InhousePayment(Payment inhousepayment) {
        this.inhousepayment = inhousepayment;
    }

    @Override
    public void pay(){
        System.out.println("successfully paid in house :)");
    }
}
