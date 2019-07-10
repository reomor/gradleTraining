/*
 * This file is generated by jOOQ.
*/
package ru.rem.db.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
import ru.rem.db.tables.records.ImageRecord;


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
public class Image extends TableImpl<ImageRecord> {

    private static final long serialVersionUID = 398409190;

    /**
     * The reference instance of <code>public.image</code>
     */
    public static final Image IMAGE = new Image();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ImageRecord> getRecordType() {
        return ImageRecord.class;
    }

    /**
     * The column <code>public.image.image_id</code>.
     */
    public final TableField<ImageRecord, Integer> IMAGE_ID = createField("image_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('image_image_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.image.directory</code>.
     */
    public final TableField<ImageRecord, String> DIRECTORY = createField("directory", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.image.file_name</code>.
     */
    public final TableField<ImageRecord, String> FILE_NAME = createField("file_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>public.image</code> table reference
     */
    public Image() {
        this(DSL.name("image"), null);
    }

    /**
     * Create an aliased <code>public.image</code> table reference
     */
    public Image(String alias) {
        this(DSL.name(alias), IMAGE);
    }

    /**
     * Create an aliased <code>public.image</code> table reference
     */
    public Image(Name alias) {
        this(alias, IMAGE);
    }

    private Image(Name alias, Table<ImageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Image(Name alias, Table<ImageRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.IMAGE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ImageRecord, Integer> getIdentity() {
        return Keys.IDENTITY_IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ImageRecord> getPrimaryKey() {
        return Keys.IMAGE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ImageRecord>> getKeys() {
        return Arrays.<UniqueKey<ImageRecord>>asList(Keys.IMAGE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Image as(String alias) {
        return new Image(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Image as(Name alias) {
        return new Image(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Image rename(String name) {
        return new Image(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Image rename(Name name) {
        return new Image(name, null);
    }
}
