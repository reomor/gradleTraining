/*
 * This file is generated by jOOQ.
*/
package ru.rem.db.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.rem.db.Indexes;
import ru.rem.db.Keys;
import ru.rem.db.Public;
import ru.rem.db.tables.records.TokenRecord;


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
public class Token extends TableImpl<TokenRecord> {

    private static final long serialVersionUID = -2008011679;

    /**
     * The reference instance of <code>public.token</code>
     */
    public static final Token TOKEN = new Token();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TokenRecord> getRecordType() {
        return TokenRecord.class;
    }

    /**
     * The column <code>public.token.token_id</code>.
     */
    public final TableField<TokenRecord, Integer> TOKEN_ID = createField("token_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('token_token_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.token.token</code>.
     */
    public final TableField<TokenRecord, String> TOKEN_ = createField("token", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.token.expiry_date</code>.
     */
    public final TableField<TokenRecord, Date> EXPIRY_DATE = createField("expiry_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>public.token.user_id</code>.
     */
    public final TableField<TokenRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.token</code> table reference
     */
    public Token() {
        this(DSL.name("token"), null);
    }

    /**
     * Create an aliased <code>public.token</code> table reference
     */
    public Token(String alias) {
        this(DSL.name(alias), TOKEN);
    }

    /**
     * Create an aliased <code>public.token</code> table reference
     */
    public Token(Name alias) {
        this(alias, TOKEN);
    }

    private Token(Name alias, Table<TokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private Token(Name alias, Table<TokenRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TOKEN_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TokenRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TokenRecord> getPrimaryKey() {
        return Keys.TOKEN_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TokenRecord>> getKeys() {
        return Arrays.<UniqueKey<TokenRecord>>asList(Keys.TOKEN_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TokenRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TokenRecord, ?>>asList(Keys.TOKEN__TOKEN_USER_ID_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Token as(String alias) {
        return new Token(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Token as(Name alias) {
        return new Token(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Token rename(String name) {
        return new Token(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Token rename(Name name) {
        return new Token(name, null);
    }
}
