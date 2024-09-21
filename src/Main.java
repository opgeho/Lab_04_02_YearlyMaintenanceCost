public class Main
{
    public static void main(String[] args)
    {
        double maintenanceSpring = 450.37;
        double maintenanceSummer = 302.11;
        double maintenanceFall = 321.91;
        double maintenanceWinter = 537.75;
        double maintenanceTotal = 0;

        System.out.println("the maintenance cost for spring is: " + maintenanceSpring + "$.");
        System.out.println("the maintenance cost for summer is: " + maintenanceSummer + "$.");
        System.out.println("the maintenance cost for fall is: " + maintenanceFall + "$.");
        System.out.println("the maintenance cost for winter is: " + maintenanceWinter + "$.");

        maintenanceTotal = maintenanceSpring + maintenanceSummer + maintenanceFall + maintenanceWinter;
        System.out.println("The total yearly maintenance cost is: " + maintenanceTotal + "$.");




    }
}