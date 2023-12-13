import java.util.Scanner;
class EventManagementApp {
    public static void main(String[] args) {
        int maxEvents = 100;
        String eventTypes[] = {"Conference", "Concert", "Wedding", "Sports Event", "Exhibition", "Party", "Fashion Show"};
        EventManager eventManager = new EventManager(maxEvents);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Event Management System");
            System.out.println("1. Create Event");
            System.out.println("2. List Events");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Select Event Type:");
                    System.out.println("1. Conference");
                    System.out.println("2. Concert");
                    System.out.println("3. Wedding");
                    System.out.println("4. Sports Event");
                    System.out.println("5. Exhibition");
                    System.out.println("6. Party");
                    System.out.println("7. Fashion Show");
                    System.out.print("Enter Event Type (1-7): ");
                    int eventType = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Event Name: ");
                    String eventName = scanner.nextLine();
                    System.out.print("Enter Date: ");
                    String date = scanner.nextLine();
                    System.out.print("Enter Time: ");
                    String time = scanner.nextLine();
                    System.out.print("Enter Location: ");
                    String location = scanner.nextLine();
                    System.out.print("Enter Venue: ");
                    String venue = scanner.nextLine();
                    System.out.print("Enter Capacity: ");
                    int capacity = scanner.nextInt();
                    scanner.nextLine();

                    AbstractEvent event;
                    switch (eventType) {
                        case 1:
                            event = new Conference();
                            System.out.print("Enter Speaker: ");
                            ((Conference) event).setSpeaker(scanner.nextLine());
                            break;
                        case 2:
                            event = new Concert();
                            System.out.print("Enter Artist: ");
                            ((Concert) event).setArtist(scanner.nextLine());
                            break;
                        case 3:
                            event = new Wedding();
                            System.out.print("Enter Bride: ");
                            ((Wedding) event).setBride(scanner.nextLine());
                            System.out.print("Enter Groom: ");
                            ((Wedding) event).setGroom(scanner.nextLine());
                            break;
                        case 4:
                            event = new SportsEvent();
                            System.out.print("Enter Sport Type: ");
                            ((SportsEvent) event).setSportType(scanner.nextLine());
                            System.out.print("Enter First Team: ");
                            ((SportsEvent) event).setFirstTeam(scanner.nextLine());
                            System.out.print("Enter Second Team: ");
                            ((SportsEvent) event).setSecondTeam(scanner.nextLine());
                            break;
                        case 5:
                            event = new Exhibition();
                            System.out.print("Enter Exhibitor: ");
                            ((Exhibition) event).setExhibitor(scanner.nextLine());
                            break;
                        case 6:
                            event = new Party();
                            System.out.print("Enter Host: ");
                            ((Party) event).setHost(scanner.nextLine());
                            break;
                        case 7:
                            event = new Fashion();
                            System.out.print("Enter Theme: ");
                            ((Fashion) event).setTheme(scanner.nextLine());
                            System.out.print("Enter Number of Designers: ");
                            int numDesigners = scanner.nextInt();
                            scanner.nextLine();

                            String[] designers = new String[numDesigners];
                            for (int d = 0; d < numDesigners; d++) {
                                System.out.printf("Enter Name of Designer %d: ", d + 1);
                                designers[d] = scanner.nextLine();
                            }
                            ((Fashion) event).setDesigners(designers);

                            System.out.print("Enter Number of Models: ");
                            int numModels = scanner.nextInt();
                            scanner.nextLine();

                            String[] models = new String[numModels];
                            for (int m = 0; m < numModels; m++) {
                                System.out.printf("Enter Name of Model %d: ", m + 1);
                                models[m] = scanner.nextLine();
                            }
                            ((Fashion) event).setModels(models);

                            System.out.print("Enter Number of Judges: ");
                            int numJudge = scanner.nextInt();
                            scanner.nextLine();

                            String[] judges = new String[numJudge];
                            for (int l = 0; l < numJudge; l++) {
                                System.out.printf("Enter Name of Judges %d: ", l + 1);
                                judges[l] = scanner.nextLine();
                            }
                            ((Fashion) event).setJudge(judges);
                            break;
                        default:
                            System.out.println("Invalid Event Type.");
                            continue;
                    }
                    event.setEventName(eventName);
                    event.setDate(date);
                    event.setTime(time);
                    event.setLocation(location);
                    event.setVenue(venue);
                    event.setCapacity(capacity);
                    DB database = new DB();
                    database.addData(eventTypes[eventType-1], eventName, date, time, location, venue, Integer.toString(capacity));
                    eventManager.createEvent(event);

                    System.out.println("Event created successfully!");
                    break;

                case 2:
                    AbstractEvent[] events = eventManager.getEvents();
                    int eventCount = eventManager.getEventCount();
                    System.out.println("Event List:");

                    // Table header
                    System.out.println("Event Id Event Name Date Time Location Venue Details");
                    DB db = new DB();
                    db.printData();
                    break;

                case 3:
                    System.out.println("Exiting Event Management System.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice, please select a valid option.");
                    break;
            }
        }
    }
}