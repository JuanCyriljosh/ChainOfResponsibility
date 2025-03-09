public class HazardousWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous")) {
            System.out.println("Careully collecting hazardous waste. Transporting to disposal facility.");
        } else {
            if (nextCollector != null) {
                nextCollector.collect(container);
            } else {
            }
        }
    }
}