

import java.util.*;


public class NewsAgency implements NewsAgencySubject{

    private List<Subscriber> subscriberList = new ArrayList<>(); 

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) { 
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String news, String category) {
        for(Subscriber subscriber : subscriberList){
            subscriber.update(news, category); 
        }
    }
}