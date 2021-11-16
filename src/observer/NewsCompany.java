package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsCompany implements Publisher {
    private List<Observer> observers;
    private String newsTitle;

    public NewsCompany(){
        observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        int idx = observers.indexOf(observer);
        observers.remove(idx);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(newsTitle);
        }
    }

    public void setNewsTitle(String newsTitle){
        this.newsTitle = newsTitle;
        notifyObserver();
    }
}
