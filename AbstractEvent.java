abstract class AbstractEvent {
        private int eventId;
        private String eventName;
        private String date;
        private String time;
        private String location;
        private String venue;
        private int capacity;
    
        public int getEventId() {
            return eventId;
        }
    
        public void setEventId(int eventId) {
            this.eventId = eventId;
        }
    
        public String getEventName() {
            return eventName;
        }
    
        public void setEventName(String eventName) {
            this.eventName = eventName;
        }
    
        public String getDate() {
            return date;
        }
    
        public void setDate(String date) {
            this.date = date;
        }
    
        public String getTime() {
            return time;
        }
    
        public void setTime(String time) {
            this.time = time;
        }
    
        public String getLocation() {
            return location;
        }
    
        public void setLocation(String location) {
            this.location = location;
        }
    
        public String getVenue() {
            return venue;
        }
    
        public void setVenue(String venue) {
            this.venue = venue;
        }
    
        public int getCapacity() {
            return capacity;
        }
    
        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
    }