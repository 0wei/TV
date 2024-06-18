package com.fongmi.android.tv.bean;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LiveType {
    @IntDef({TEXT, JSON, PROXY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public static final int TEXT = 0;
    public static final int JSON = 1;
    public static final int PROXY = 2;
}
