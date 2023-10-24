package March_17;

public class testClass {
    public static void main(String[] args) {
        int[] fuelPrice = {4,3,1,2};
        int[] fuel = {1,2,3,4};

        int n = fuel.length;
        int minimumFuelPrice = fuelPrice[0];
        int fuelNeeded = 0;
        int result = 0;

        for(int i = 0; i< n; i++) {
            fuelNeeded = fuelNeeded + fuel[i];
            if(minimumFuelPrice >= fuelPrice[i]) {
                minimumFuelPrice = fuelPrice[i];
            }
        }

        for(int i = 0; i< n; i++) {
            if(minimumFuelPrice == fuelPrice[i]) {
                result = result + minimumFuelPrice*fuelNeeded;
                break;
            }
            result = result + fuelPrice[i]*fuel[i];
            fuelNeeded = fuelNeeded - fuel[i];

        }

        System.out.println(result);
    }
}
