/*
 * This file is generated by jOOQ.
*/
package ru.rem.db.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.rem.db.tables.Channel;


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
public class ChannelRecord extends UpdatableRecordImpl<ChannelRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = -449717452;

    /**
     * Setter for <code>public.channel.channel_id</code>.
     */
    public ChannelRecord setChannelId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.channel.channel_id</code>.
     */
    public Integer getChannelId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.channel.name</code>.
     */
    public ChannelRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.channel.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.channel.description</code>.
     */
    public ChannelRecord setDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.channel.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.channel.rules</code>.
     */
    public ChannelRecord setRules(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.channel.rules</code>.
     */
    public String getRules() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Channel.CHANNEL.CHANNEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Channel.CHANNEL.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Channel.CHANNEL.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Channel.CHANNEL.RULES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getChannelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRules();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getChannelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRules();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelRecord value1(Integer value) {
        setChannelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelRecord value4(String value) {
        setRules(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ChannelRecord
     */
    public ChannelRecord() {
        super(Channel.CHANNEL);
    }

    /**
     * Create a detached, initialised ChannelRecord
     */
    public ChannelRecord(Integer channelId, String name, String description, String rules) {
        super(Channel.CHANNEL);

        set(0, channelId);
        set(1, name);
        set(2, description);
        set(3, rules);
    }
}