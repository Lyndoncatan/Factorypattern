

public interface NewsAgencySubject {
    
    public void subscribe(Subscriber subscriber);
    public void unsubscribe(Subscriber subscriber); 
    void notifySubscribers(String news, String category);
}