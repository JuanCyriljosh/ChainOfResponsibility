public class OrganicWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic")) {
            System.out.println("Collecting organic waste. To be used for composting.");
        } else {
            if (nextCollector != null) {
                nextCollector.collect(container);
            } else {
            }
        }
    }
}