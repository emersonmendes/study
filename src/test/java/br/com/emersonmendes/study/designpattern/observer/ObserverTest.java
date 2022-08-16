package br.com.emersonmendes.study.designpattern.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {

    @Test
    void shouldTestObserver() {

        NewsAgency newsAgencyObservable = new NewsAgency();
        NewsChannel newsChannelObserver = new NewsChannel();

        newsAgencyObservable.addObserver(newsChannelObserver);
        newsAgencyObservable.setNews("news");
        assertEquals(newsChannelObserver.getNews(), "news");

    }

    @Test
    void shouldTestJavaObserver() {

        ONewsAgency observable = new ONewsAgency();
        ONewsChannel observer = new ONewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");
        assertEquals(observer.getNews(), "news");

    }

}