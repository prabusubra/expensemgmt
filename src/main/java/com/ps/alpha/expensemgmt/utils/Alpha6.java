package com.ps.alpha.expensemgmt.utils;

import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

public class Alpha6 {
    public static void main(String[] args) {
        InternalUser user1 = new InternalUser();
        user1.attach(new InteralUserObserver());
        user1.setName("AAA");
        user1.setCity("BLR");

        InternalUser user2 = new InternalUser();
        user2.attach(new InteralUserObserver());
        user2.setName("BBB");
        user2.setCity("CBR");

    }
}

interface Observer {
    void update(String message);
}

interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}

@Getter
class InternalUser implements Subject {

    final private List<Observer> observers = new ArrayList<>();
    private String name;
    private String city;
    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: this.observers){
            observer.update(this.name + " was changed.");
            observer.update(this.city + " was changed.");
        }
    }

    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }

    public void setCity(String city) {
        this.city = city;
        notifyObservers();
    }
}

class InteralUserObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Received: "+message);
    }
}