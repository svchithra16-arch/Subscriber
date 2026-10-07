package Subscriber;
public class Subscriber {

    String subscriberName;
    long subscriberId;
    long subscriberPhoneNumber;
    String subscriberPlanName;
    int subscriberFreeCalls;
    double subscriberPackageCost;
    int subscriberExtraCallsInMinutes;
    double subscriberExtraCallCostPerMinutes;
    double subscriberTaxOnBill;

    public void getSubscriberDetails() {

        System.out.println("Subscriber Name: " + subscriberName);
        System.out.println("Subscriber ID: " + subscriberId);
        System.out.println("Subscriber Phone Number: " + subscriberPhoneNumber);
        System.out.println("Subscriber Plan Name: " + subscriberPlanName);
        System.out.println("Subscriber Free Calls: " + subscriberFreeCalls);
        System.out.println("Subscriber Package Cost: " + subscriberPackageCost);
        System.out.println("Subscriber Extra Calls In Minutes: "
                + subscriberExtraCallsInMinutes);
        System.out.println("Subscriber Extra Call Cost Per Minutes: "
                + subscriberExtraCallCostPerMinutes);
        System.out.println("Subscriber Tax On Bill: " + subscriberTaxOnBill + "%");
    }
}