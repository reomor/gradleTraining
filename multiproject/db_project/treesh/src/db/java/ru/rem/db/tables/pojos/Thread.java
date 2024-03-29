/*
 * This file is generated by jOOQ.
*/
package ru.rem.db.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Thread implements Serializable {

    private static final long serialVersionUID = 740531484;

    private final Integer   threadId;
    private final String    message;
    private final Integer   priority;
    private final Timestamp dateTime;
    private final Integer   channelId;
    private final Integer   imageId;

    public Thread(Thread value) {
        this.threadId = value.threadId;
        this.message = value.message;
        this.priority = value.priority;
        this.dateTime = value.dateTime;
        this.channelId = value.channelId;
        this.imageId = value.imageId;
    }

    public Thread(
        Integer   threadId,
        String    message,
        Integer   priority,
        Timestamp dateTime,
        Integer   channelId,
        Integer   imageId
    ) {
        this.threadId = threadId;
        this.message = message;
        this.priority = priority;
        this.dateTime = dateTime;
        this.channelId = channelId;
        this.imageId = imageId;
    }

    public Integer getThreadId() {
        return this.threadId;
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public Timestamp getDateTime() {
        return this.dateTime;
    }

    public Integer getChannelId() {
        return this.channelId;
    }

    public Integer getImageId() {
        return this.imageId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Thread (");

        sb.append(threadId);
        sb.append(", ").append(message);
        sb.append(", ").append(priority);
        sb.append(", ").append(dateTime);
        sb.append(", ").append(channelId);
        sb.append(", ").append(imageId);

        sb.append(")");
        return sb.toString();
    }
}
