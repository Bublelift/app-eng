package com.example.owocewarzywa.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u001a0\u0017J(\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u001a0\u0017J\u001a\u0010\u001c\u001a\u00020\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001a0\u0017J1\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00102!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u001a0\u0017J1\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u00102!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u001a0\u0017J\u0014\u0010\'\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0(J\u000e\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u0012J\u000e\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0010J\u0016\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020\u0010J\u0016\u00100\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0010J&\u00102\u001a\u00020\u001a2\b\b\u0002\u0010#\u001a\u00020\u00102\b\b\u0002\u00103\u001a\u00020\u00102\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0010J\u000e\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u000207R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/example/owocewarzywa/utils/FirestoreUtil;", "", "()V", "chatChannelsCollectionRef", "Lcom/google/firebase/firestore/CollectionReference;", "currentUserDocRef", "Lcom/google/firebase/firestore/DocumentReference;", "getCurrentUserDocRef", "()Lcom/google/firebase/firestore/DocumentReference;", "firestoreInstance", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getFirestoreInstance", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "firestoreInstance$delegate", "Lkotlin/Lazy;", "userList", "", "addChatMessagesListener", "Lcom/google/firebase/firestore/ListenerRegistration;", "channelId", "context", "Landroid/content/Context;", "onListen", "Lkotlin/Function1;", "", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "", "addUsersListener", "getCurrentUser", "onComplete", "Lcom/example/owocewarzywa/model/User;", "getMsgReadStatus", "chatroomId", "onSuccess", "Lkotlin/ParameterName;", "name", "toReadBy", "getOrCreateChatChannel", "otherUserId", "initCurrentUserIfFirstTime", "Lkotlin/Function0;", "removeListener", "registration", "sendFeedback", "feedback", "sendMessage", "message", "Lcom/example/owocewarzywa/model/TextMessage;", "setMsgReadStatus", "status", "updateCurrentUser", "bio", "profilePicturePath", "updateUserScore", "score", "", "app_debug"})
public final class FirestoreUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.owocewarzywa.utils.FirestoreUtil INSTANCE = null;
    private static final kotlin.Lazy firestoreInstance$delegate = null;
    private static final com.google.firebase.firestore.CollectionReference chatChannelsCollectionRef = null;
    private static java.lang.String userList;
    
    private FirestoreUtil() {
        super();
    }
    
    private final com.google.firebase.firestore.FirebaseFirestore getFirestoreInstance() {
        return null;
    }
    
    private final com.google.firebase.firestore.DocumentReference getCurrentUserDocRef() {
        return null;
    }
    
    public final void updateCurrentUser(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String bio, @org.jetbrains.annotations.Nullable()
    java.lang.String profilePicturePath) {
    }
    
    public final void initCurrentUserIfFirstTime(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
    }
    
    public final void getCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.owocewarzywa.model.User, kotlin.Unit> onComplete) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.ListenerRegistration addUsersListener(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<? extends com.xwray.groupie.kotlinandroidextensions.Item>, kotlin.Unit> onListen) {
        return null;
    }
    
    public final void removeListener(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.ListenerRegistration registration) {
    }
    
    public final void getOrCreateChatChannel(@org.jetbrains.annotations.NotNull()
    java.lang.String otherUserId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onComplete) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.ListenerRegistration addChatMessagesListener(@org.jetbrains.annotations.NotNull()
    java.lang.String channelId, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<? extends com.xwray.groupie.kotlinandroidextensions.Item>, kotlin.Unit> onListen) {
        return null;
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    com.example.owocewarzywa.model.TextMessage message, @org.jetbrains.annotations.NotNull()
    java.lang.String channelId) {
    }
    
    public final void getMsgReadStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String chatroomId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSuccess) {
    }
    
    public final void setMsgReadStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String chatroomId, @org.jetbrains.annotations.NotNull()
    java.lang.String status) {
    }
    
    public final void sendFeedback(@org.jetbrains.annotations.NotNull()
    java.lang.String feedback) {
    }
    
    public final void updateUserScore(int score) {
    }
}