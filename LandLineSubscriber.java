package Subscriber;

public class LandLineSubscriber extends Subscriber {

    int noOfSTDCallMinutes;
    double costPerEachSTDMinute;

    @Override
    public void getSubscriberDetails() {

        System.out.println("LandLine Subscriber Details");
        System.out.println("---------------------------");

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
        System.out.println("Subscriber Tax On Bill: "
                + subscriberTaxOnBill + "%");
        System.out.println("No Of STD Call Minutes: "
                + noOfSTDCallMinutes);
        System.out.println("Cost Per Each STD Minute: "
                + costPerEachSTDMinute);
    }

    public double calculateBill() {

        double extraCallCost =
                subscriberExtraCallsInMinutes
                * subscriberExtraCallCostPerMinutes;

        double stdCallCost =
                noOfSTDCallMinutes
                * costPerEachSTDMinute;

        double totalBill =
                subscriberPackageCost
                + extraCallCost
                + stdCallCost;

        double tax =
                totalBill * subscriberTaxOnBill / 100;

        double finalBill =
                totalBill + tax;

        return finalBill;
    }
}