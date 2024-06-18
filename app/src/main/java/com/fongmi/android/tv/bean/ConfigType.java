package com.fongmi.android.tv.bean;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ConfigType {
    @IntDef({Live,VOD,WALL})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type { }

    public static final int VOD = 0;
    public static final int Live = 1;
    public static final int WALL = 2;
}
