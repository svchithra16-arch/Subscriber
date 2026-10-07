package Subscriber;
public class MobileSubscriber extends Subscriber {

    int roamingNoOfMinutes;
    double roamingCostPerMinute;

    @Override
    public void getSubscriberDetails() {

        System.out.println("Mobile Subscriber Details");
        System.out.println("-------------------------");

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
        System.out.println("Roaming No Of Minutes: " + roamingNoOfMinutes);
        System.out.println("Roaming Cost Per Minute: "
                + roamingCostPerMinute);
    }

    public double calculateBill() {

        double extraCallCost =
                subscriberExtraCallsInMinutes
                * subscriberExtraCallCostPerMinutes;

        double roamingCost =
                roamingNoOfMinutes
                * roamingCostPerMinute;

        double totalBill =
                subscriberPackageCost
                + extraCallCost
                + roamingCost;

        double tax =
                totalBill * subscriberTaxOnBill / 100;

        double finalBill =
                totalBill + tax;

        return finalBill;
    }
}