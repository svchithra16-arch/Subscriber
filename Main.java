package Subscriber;

public class Main {

    public static void main(String[] args) {

        // Mobile Subscriber
        MobileSubscriber mobile = new MobileSubscriber();

        mobile.subscriberName = "Bhoomika";
        mobile.subscriberId = 1001;
        mobile.subscriberPhoneNumber = 9876543210L;
        mobile.subscriberPlanName = "Postpaid";
        mobile.subscriberFreeCalls = 500;
        mobile.subscriberPackageCost = 599.00;
        mobile.subscriberExtraCallsInMinutes = 100;
        mobile.subscriberExtraCallCostPerMinutes = 1.50;
        mobile.subscriberTaxOnBill = 10.0;

        mobile.roamingNoOfMinutes = 20;
        mobile.roamingCostPerMinute = 2.00;

        System.out.println("==================================");
        System.out.println("       MOBILE SUBSCRIBER BILL");
        System.out.println("==================================");

        mobile.getSubscriberDetails();

        double mobileBill = mobile.calculateBill();

        System.out.println("----------------------------------");
        System.out.println("Final Mobile Bill: Rs. " + mobileBill);


        // LandLine Subscriber
        LandLineSubscriber landline = new LandLineSubscriber();

        landline.subscriberName = "Rahul";
        landline.subscriberId = 2001;
        landline.subscriberPhoneNumber = 8045678910L;
        landline.subscriberPlanName = "LandLine";
        landline.subscriberFreeCalls = 300;
        landline.subscriberPackageCost = 499.00;
        landline.subscriberExtraCallsInMinutes = 50;
        landline.subscriberExtraCallCostPerMinutes = 1.00;
        landline.subscriberTaxOnBill = 10.0;

        landline.noOfSTDCallMinutes = 40;
        landline.costPerEachSTDMinute = 2.50;

        System.out.println("\n==================================");
        System.out.println("      LANDLINE SUBSCRIBER BILL");
        System.out.println("==================================");

        landline.getSubscriberDetails();

        double landlineBill = landline.calculateBill();

        System.out.println("----------------------------------");
        System.out.println("Final LandLine Bill: Rs. "
                + landlineBill);

        System.out.println("==================================");
        System.out.println("       BILL GENERATION DONE");
        System.out.println("==================================");
    }
}