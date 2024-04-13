package com.example.owocewarzywa.practice.memo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ!\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u001fH\u0002J\u0006\u0010%\u001a\u00020&J\u0006\u0010\'\u001a\u00020\u001fR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/example/owocewarzywa/practice/memo/MemoViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_apiResponse", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/owocewarzywa/practice/memo/MemoData;", "_apiStatus", "", "_backupCardsList", "_cardsList", "_currentGoal", "_currentIdx", "", "kotlin.jvm.PlatformType", "_currentTries", "_score", "_wordlist", "apiResponse", "Landroidx/lifecycle/LiveData;", "getApiResponse", "()Landroidx/lifecycle/LiveData;", "apiStatus", "getApiStatus", "cardsList", "getCardsList", "currentGoal", "getCurrentGoal", "score", "getScore", "addScore", "", "initMemo", "level", "category", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareCards", "tryGetNextGoal", "", "tryGuess", "app_debug"})
public final class MemoViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _apiStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> apiStatus = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.owocewarzywa.practice.memo.MemoData>> _apiResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.owocewarzywa.practice.memo.MemoData>> apiResponse = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _currentGoal = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> currentGoal = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> _wordlist = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _currentIdx = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _currentTries = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _score = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> score = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.owocewarzywa.practice.memo.MemoData>> _cardsList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.owocewarzywa.practice.memo.MemoData>> cardsList = null;
    private final java.util.List<com.example.owocewarzywa.practice.memo.MemoData> _backupCardsList = null;
    
    public MemoViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getApiStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.owocewarzywa.practice.memo.MemoData>> getApiResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCurrentGoal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getScore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.owocewarzywa.practice.memo.MemoData>> getCardsList() {
        return null;
    }
    
    private final void prepareCards() {
    }
    
    public final boolean tryGetNextGoal() {
        return false;
    }
    
    public final void tryGuess() {
    }
    
    public final void addScore() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object initMemo(@org.jetbrains.annotations.NotNull()
    java.lang.String level, @org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}