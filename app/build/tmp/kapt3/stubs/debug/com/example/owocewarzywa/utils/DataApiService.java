package com.example.owocewarzywa.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ5\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/owocewarzywa/utils/DataApiService;", "", "getFill", "", "Lcom/example/owocewarzywa/practice/fill/FillData;", "task", "", "level", "category", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFlashcards", "Lcom/example/owocewarzywa/practice/flashcards/FlashcardData;", "getMemo", "Lcom/example/owocewarzywa/practice/memo/MemoData;", "minigame", "getPuzzle", "Lcom/example/owocewarzywa/practice/puzzle/PuzzleData;", "getQuiz", "Lcom/example/owocewarzywa/practice/quiz/QuizData;", "getUnscramble", "Lcom/example/owocewarzywa/practice/unscramble/UnscrambleData;", "app_debug"})
public abstract interface DataApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users")
    public abstract java.lang.Object getQuiz(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "task")
    java.lang.String task, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "level")
    java.lang.String level, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "category")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.owocewarzywa.practice.quiz.QuizData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users")
    public abstract java.lang.Object getFill(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "task")
    java.lang.String task, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "level")
    java.lang.String level, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "category")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.owocewarzywa.practice.fill.FillData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users")
    public abstract java.lang.Object getFlashcards(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "task")
    java.lang.String task, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "level")
    java.lang.String level, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "category")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.owocewarzywa.practice.flashcards.FlashcardData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users")
    public abstract java.lang.Object getMemo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "minigame")
    java.lang.String minigame, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "level")
    java.lang.String level, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "category")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.owocewarzywa.practice.memo.MemoData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users")
    public abstract java.lang.Object getUnscramble(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "minigame")
    java.lang.String minigame, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "level")
    java.lang.String level, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "category")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.owocewarzywa.practice.unscramble.UnscrambleData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users")
    public abstract java.lang.Object getPuzzle(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "minigame")
    java.lang.String minigame, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "level")
    java.lang.String level, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "category")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.owocewarzywa.practice.puzzle.PuzzleData>> continuation);
}