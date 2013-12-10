package io.github.ibuildthecloud.dstack.eventing.model;

import io.github.ibuildthecloud.dstack.eventing.model.Event;

import java.util.Date;
import java.util.UUID;

public class EventVO implements Event {

    String id;
    String name;
    String replyTo;
    String[] previousIds;
    Object data;
    Date time;
    String publisher;

    public EventVO() {
        id = UUID.randomUUID().toString();
        time = new Date();
    }

    public EventVO(Event event, String replyTo) {
        this.replyTo = replyTo;

        this.id = event.getId();
        this.name = event.getName();
        this.previousIds = event.getPreviousIds();
        this.data = event.getData();
        this.time = event.getTime();
        this.publisher = event.getPublisher();
    }
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String[] getPreviousIds() {
        return previousIds;
    }

    public void setPreviousIds(String[] previousIds) {
        this.previousIds = previousIds;
    }

    @Override
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

}
