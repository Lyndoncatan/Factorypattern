public class NewsSubscriptionService {
    public static void main(String[] args) {
        
        NewsAgency newsAgency = new NewsAgency();

        System.out.println("Welcome to 24 Oras News Agency!\n");

        // Creating Subscriber Objects

        // Lyndon Subscriber
        Subscriber lyndon = new Subscriber(); 
        // FIXED: Removed invalid named parameter syntax
        lyndon.setSubscriberName("Lyndon"); 

        // Leiron Subscriber
        Subscriber leiron = new Subscriber();
        leiron.setSubscriberName("leiron");

        // Catan Subscriber (Variable name corrected to 'catan')
        Subscriber catan = new Subscriber(); 
        // FIXED: Removed invalid named parameter syntax
        catan.setSubscriberName("Catan"); 

        // Orecha Subscriber
        Subscriber orecha = new Subscriber();
        orecha.setSubscriberName("orecha");

        // Subscribing Objects

        newsAgency.subscribe(lyndon);
        newsAgency.subscribe(leiron);
        newsAgency.subscribe(catan);
        newsAgency.subscribe(orecha);

        // Notifying the Subscribers

        System.out.println("Here are news for these subscribers!\n");
        newsAgency.notifySubscribers("Kathniel broke up", "Celebrity");

        // Unsubscribing Objects
        
        // FIXED: Changed method name to 'unsubscribe'
        newsAgency.unsubscribe(lyndon); 
        newsAgency.unsubscribe(catan); 

        // Notifying the Remaining Subscribers

        System.out.println("\nHere are news for these remaining subscribers!\n");
        newsAgency.notifySubscribers("Lumindol kaninang hapon!", "Calamity");

        // New Subscriber Joins

        Subscriber John = new Subscriber();
        John.setSubscriberName("John");

        newsAgency.subscribe(John);

        // Notifying All Current Subscribers

        System.out.println("\nHere are news for these subscribers!\n");
        newsAgency.notifySubscribers("Iphone releases Iphone 16", "Technology");
    }
}