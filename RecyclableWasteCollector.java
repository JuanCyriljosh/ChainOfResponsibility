public class RecyclableWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("recyclable")) {
            System.out.println("Collecting recyclable wastes. To be processed for recycling.");
        } else {
            if (nextCollector != null) {
                nextCollector.collect(container);
            } else {
            }
        }
    }
}