
package edu.acm.uiuc.mm20.objects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class GameState {

    @Expose
    private AiStats aiStats;
    @Expose
    private Map<String, Room> map;
    @Expose
    private List<Object> errors = new ArrayList<Object>();
    @Expose
    private Map<String, Person> people;
    @Expose
    private List<Message> messages = new ArrayList<Message>();
    @Expose
    private Events events;

    public AiStats getAiStats() {
        return aiStats;
    }

    public void setAiStats(AiStats aiStats) {
        this.aiStats = aiStats;
    }

    public GameState withAiStats(AiStats aiStats) {
        this.aiStats = aiStats;
        return this;
    }

    public Room getRoom(String name) {
        return map.get(name);
    }
    public Collection<Room> getRooms(){
    	return this.map.values();
    }

    public List<Object> getErrors() {
        return errors;
    }

    public Collection<Person> getPeople() {
        return people.values();
    }
    
    public Person getPerson(String key){
    	return people.get(key);
    }


    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public GameState withMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public GameState withEvents(Events events) {
        this.events = events;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

}
