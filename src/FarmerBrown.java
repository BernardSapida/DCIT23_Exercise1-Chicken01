class FarmerBrown {
    // Properties of FarmerBrown
    private int monday, tuesday, wednesday, chickenCount, eggsPerChicken;
    private static int count;

    // Behavior of FarmerBrown
    // Setter Method for Total Eggs
    public void setTotalEggs(int chickenCount, int eggsPerChicken){
        count++;
        this.chickenCount = chickenCount;
        this.eggsPerChicken = eggsPerChicken;
    }

    // Getter Method for Total Eggs
    public void getTotalEggs(){
        System.out.println("\nScenario #" + count);
        this.monday = this.chickenCount * this.eggsPerChicken;
        System.out.println("Monday: " + monday);
        this.tuesday = (this.chickenCount += 1) * this.eggsPerChicken;
        System.out.println("Tuesday: " + tuesday);
        this.wednesday = (this.chickenCount /= 2) * this.eggsPerChicken;
        System.out.println("Wednesday: " + wednesday);
        System.out.println("Total Eggs: " + (int)(monday + tuesday + wednesday));
        System.out.println();
    }
}