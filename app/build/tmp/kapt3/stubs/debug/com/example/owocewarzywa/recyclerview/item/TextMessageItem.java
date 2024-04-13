package com.example.owocewarzywa.recyclerview.item;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0016\u0010\u0016\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/example/owocewarzywa/recyclerview/item/TextMessageItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "message", "Lcom/example/owocewarzywa/model/TextMessage;", "context", "Landroid/content/Context;", "(Lcom/example/owocewarzywa/model/TextMessage;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getMessage", "()Lcom/example/owocewarzywa/model/TextMessage;", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "equals", "", "other", "", "getLayout", "isSameAs", "Lcom/xwray/groupie/Item;", "setMessageRootGravity", "setTimeText", "app_debug"})
public final class TextMessageItem extends com.xwray.groupie.kotlinandroidextensions.Item {
    @org.jetbrains.annotations.NotNull()
    private final com.example.owocewarzywa.model.TextMessage message = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public TextMessageItem(@org.jetbrains.annotations.NotNull()
    com.example.owocewarzywa.model.TextMessage message, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.owocewarzywa.model.TextMessage getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.kotlinandroidextensions.ViewHolder viewHolder, int position) {
    }
    
    private final void setTimeText(com.xwray.groupie.kotlinandroidextensions.ViewHolder viewHolder) {
    }
    
    private final void setMessageRootGravity(com.xwray.groupie.kotlinandroidextensions.ViewHolder viewHolder) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean isSameAs(@org.jetbrains.annotations.Nullable()
    com.xwray.groupie.Item<?> other) {
        return false;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
}