public class WasteManagementSystem {
    public static void main(String[] args) {
        WasteCollectionChain wasteChain = new WasteCollectionChain();

        WasteContainer organicBin = new WasteContainer("organic", 50);
        WasteContainer recyclableBin = new WasteContainer("recyclable", 70);
        WasteContainer hazardousBin = new WasteContainer("hazardous", 30);

        System.out.println("Processing waste bins...");
        wasteChain.handleCollection(organicBin);
        wasteChain.handleCollection(recyclableBin);
        wasteChain.handleCollection(hazardousBin);
    }
}