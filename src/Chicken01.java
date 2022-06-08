public class Chicken01 {
    public static void main(String[] args) throws Exception {
        // variable declaration
        int chickenCount_1 = 3,
            eggsPerChicken_1 = 5,
            chickenCount_2 = 8,
            eggsPerChicken_2 = 4;

        // Instantiating the FarmerBrown Class
        FarmerBrown farmerBrown = new FarmerBrown();

        // Setters and Getters for first scenario
        farmerBrown.setTotalEggs(chickenCount_1, eggsPerChicken_1);
        farmerBrown.getTotalEggs();

        // Setters and Getters for second scenario
        farmerBrown.setTotalEggs(chickenCount_2, eggsPerChicken_2);
        farmerBrown.getTotalEggs();
    }
}