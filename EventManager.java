class EventManager {
    private AbstractEvent[] events;
    private int eventCount;
    private int eventIdCounter;

    public EventManager(int maxEvents) {
        events = new AbstractEvent[maxEvents];
        eventIdCounter = 1;
        eventCount = 0;
    }

    public void createEvent(AbstractEvent event) {
        if (eventCount < events.length) {
            event.setEventId(eventIdCounter++);
            events[eventCount++] = event;
        } else {
            System.out.println("Event limit reached. Cannot create more events.");
        }
    }

    public AbstractEvent[] getEvents() {
        return events;
    }

    public int getEventCount() {
        return eventCount;
    }
}