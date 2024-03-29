/*
 * This file is generated by jOOQ.
*/
package ru.rem.db.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import ru.rem.db.tables.Post;


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
public class PostRecord extends UpdatableRecordImpl<PostRecord> implements Record5<Integer, String, Timestamp, Integer, Integer> {

    private static final long serialVersionUID = 1052246942;

    /**
     * Setter for <code>public.post.post_id</code>.
     */
    public PostRecord setPostId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.post.post_id</code>.
     */
    public Integer getPostId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.post.message</code>.
     */
    public PostRecord setMessage(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.post.message</code>.
     */
    public String getMessage() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.post.date_time</code>.
     */
    public PostRecord setDateTime(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.post.date_time</code>.
     */
    public Timestamp getDateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.post.thread_id</code>.
     */
    public PostRecord setThreadId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.post.thread_id</code>.
     */
    public Integer getThreadId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.post.image_id</code>.
     */
    public PostRecord setImageId(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.post.image_id</code>.
     */
    public Integer getImageId() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Timestamp, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Timestamp, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Post.POST.POST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Post.POST.MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Post.POST.DATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Post.POST.THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Post.POST.IMAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPostId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getDateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getImageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPostId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getImageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostRecord value1(Integer value) {
        setPostId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostRecord value2(String value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostRecord value3(Timestamp value) {
        setDateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostRecord value4(Integer value) {
        setThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostRecord value5(Integer value) {
        setImageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostRecord values(Integer value1, String value2, Timestamp value3, Integer value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PostRecord
     */
    public PostRecord() {
        super(Post.POST);
    }

    /**
     * Create a detached, initialised PostRecord
     */
    public PostRecord(Integer postId, String message, Timestamp dateTime, Integer threadId, Integer imageId) {
        super(Post.POST);

        set(0, postId);
        set(1, message);
        set(2, dateTime);
        set(3, threadId);
        set(4, imageId);
    }
}
