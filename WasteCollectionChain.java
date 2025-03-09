public class WasteCollectionChain {
    private WasteCollector chain;

    public WasteCollectionChain() {
        this.chain = new OrganicWasteCollector();
        WasteCollector c2 = new RecyclableWasteCollector();
        WasteCollector c3 = new HazardousWasteCollector();

        chain.setNextCollector(c2);
        c2.setNextCollector(c3);
    }

    public void handleCollection(WasteContainer container) {
        chain.collect(container);
    }
}