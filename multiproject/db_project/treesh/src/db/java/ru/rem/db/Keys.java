/*
 * This file is generated by jOOQ.
*/
package ru.rem.db;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import ru.rem.db.tables.Channel;
import ru.rem.db.tables.Databasechangeloglock;
import ru.rem.db.tables.Image;
import ru.rem.db.tables.Post;
import ru.rem.db.tables.Thread;
import ru.rem.db.tables.Token;
import ru.rem.db.tables.UserRoles;
import ru.rem.db.tables.Users;
import ru.rem.db.tables.records.ChannelRecord;
import ru.rem.db.tables.records.DatabasechangeloglockRecord;
import ru.rem.db.tables.records.ImageRecord;
import ru.rem.db.tables.records.PostRecord;
import ru.rem.db.tables.records.ThreadRecord;
import ru.rem.db.tables.records.TokenRecord;
import ru.rem.db.tables.records.UserRolesRecord;
import ru.rem.db.tables.records.UsersRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ChannelRecord, Integer> IDENTITY_CHANNEL = Identities0.IDENTITY_CHANNEL;
    public static final Identity<ImageRecord, Integer> IDENTITY_IMAGE = Identities0.IDENTITY_IMAGE;
    public static final Identity<PostRecord, Integer> IDENTITY_POST = Identities0.IDENTITY_POST;
    public static final Identity<ThreadRecord, Integer> IDENTITY_THREAD = Identities0.IDENTITY_THREAD;
    public static final Identity<TokenRecord, Integer> IDENTITY_TOKEN = Identities0.IDENTITY_TOKEN;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ChannelRecord> CHANNEL_PKEY = UniqueKeys0.CHANNEL_PKEY;
    public static final UniqueKey<DatabasechangeloglockRecord> DATABASECHANGELOGLOCK_PKEY = UniqueKeys0.DATABASECHANGELOGLOCK_PKEY;
    public static final UniqueKey<ImageRecord> IMAGE_PKEY = UniqueKeys0.IMAGE_PKEY;
    public static final UniqueKey<PostRecord> POST_PKEY = UniqueKeys0.POST_PKEY;
    public static final UniqueKey<ThreadRecord> THREAD_PKEY = UniqueKeys0.THREAD_PKEY;
    public static final UniqueKey<TokenRecord> TOKEN_PKEY = UniqueKeys0.TOKEN_PKEY;
    public static final UniqueKey<UsersRecord> USERS_PKEY = UniqueKeys0.USERS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<PostRecord, ThreadRecord> POST__POST_THREAD_ID_FK = ForeignKeys0.POST__POST_THREAD_ID_FK;
    public static final ForeignKey<PostRecord, ImageRecord> POST__POST_IMAGE_ID_FK = ForeignKeys0.POST__POST_IMAGE_ID_FK;
    public static final ForeignKey<ThreadRecord, ChannelRecord> THREAD__THREAD_CHANNEL_ID_FK = ForeignKeys0.THREAD__THREAD_CHANNEL_ID_FK;
    public static final ForeignKey<ThreadRecord, ImageRecord> THREAD__THREAD_IMAGE_ID_FK = ForeignKeys0.THREAD__THREAD_IMAGE_ID_FK;
    public static final ForeignKey<TokenRecord, UsersRecord> TOKEN__TOKEN_USER_ID_FK = ForeignKeys0.TOKEN__TOKEN_USER_ID_FK;
    public static final ForeignKey<UserRolesRecord, UsersRecord> USER_ROLES__USER_ID_FK = ForeignKeys0.USER_ROLES__USER_ID_FK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<ChannelRecord, Integer> IDENTITY_CHANNEL = Internal.createIdentity(Channel.CHANNEL, Channel.CHANNEL.CHANNEL_ID);
        public static Identity<ImageRecord, Integer> IDENTITY_IMAGE = Internal.createIdentity(Image.IMAGE, Image.IMAGE.IMAGE_ID);
        public static Identity<PostRecord, Integer> IDENTITY_POST = Internal.createIdentity(Post.POST, Post.POST.POST_ID);
        public static Identity<ThreadRecord, Integer> IDENTITY_THREAD = Internal.createIdentity(Thread.THREAD, Thread.THREAD.THREAD_ID);
        public static Identity<TokenRecord, Integer> IDENTITY_TOKEN = Internal.createIdentity(Token.TOKEN, Token.TOKEN.TOKEN_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ChannelRecord> CHANNEL_PKEY = Internal.createUniqueKey(Channel.CHANNEL, "channel_pkey", Channel.CHANNEL.CHANNEL_ID);
        public static final UniqueKey<DatabasechangeloglockRecord> DATABASECHANGELOGLOCK_PKEY = Internal.createUniqueKey(Databasechangeloglock.DATABASECHANGELOGLOCK, "databasechangeloglock_pkey", Databasechangeloglock.DATABASECHANGELOGLOCK.ID);
        public static final UniqueKey<ImageRecord> IMAGE_PKEY = Internal.createUniqueKey(Image.IMAGE, "image_pkey", Image.IMAGE.IMAGE_ID);
        public static final UniqueKey<PostRecord> POST_PKEY = Internal.createUniqueKey(Post.POST, "post_pkey", Post.POST.POST_ID);
        public static final UniqueKey<ThreadRecord> THREAD_PKEY = Internal.createUniqueKey(Thread.THREAD, "thread_pkey", Thread.THREAD.THREAD_ID);
        public static final UniqueKey<TokenRecord> TOKEN_PKEY = Internal.createUniqueKey(Token.TOKEN, "token_pkey", Token.TOKEN.TOKEN_ID);
        public static final UniqueKey<UsersRecord> USERS_PKEY = Internal.createUniqueKey(Users.USERS, "users_pkey", Users.USERS.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<PostRecord, ThreadRecord> POST__POST_THREAD_ID_FK = Internal.createForeignKey(ru.rem.db.Keys.THREAD_PKEY, Post.POST, "post__post_thread_id_fk", Post.POST.THREAD_ID);
        public static final ForeignKey<PostRecord, ImageRecord> POST__POST_IMAGE_ID_FK = Internal.createForeignKey(ru.rem.db.Keys.IMAGE_PKEY, Post.POST, "post__post_image_id_fk", Post.POST.IMAGE_ID);
        public static final ForeignKey<ThreadRecord, ChannelRecord> THREAD__THREAD_CHANNEL_ID_FK = Internal.createForeignKey(ru.rem.db.Keys.CHANNEL_PKEY, Thread.THREAD, "thread__thread_channel_id_fk", Thread.THREAD.CHANNEL_ID);
        public static final ForeignKey<ThreadRecord, ImageRecord> THREAD__THREAD_IMAGE_ID_FK = Internal.createForeignKey(ru.rem.db.Keys.IMAGE_PKEY, Thread.THREAD, "thread__thread_image_id_fk", Thread.THREAD.IMAGE_ID);
        public static final ForeignKey<TokenRecord, UsersRecord> TOKEN__TOKEN_USER_ID_FK = Internal.createForeignKey(ru.rem.db.Keys.USERS_PKEY, Token.TOKEN, "token__token_user_id_fk", Token.TOKEN.USER_ID);
        public static final ForeignKey<UserRolesRecord, UsersRecord> USER_ROLES__USER_ID_FK = Internal.createForeignKey(ru.rem.db.Keys.USERS_PKEY, UserRoles.USER_ROLES, "user_roles__user_id_fk", UserRoles.USER_ROLES.USER_ID);
    }
}
