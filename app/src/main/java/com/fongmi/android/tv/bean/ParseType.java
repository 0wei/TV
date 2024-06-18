package com.fongmi.android.tv.bean;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

class ParseType {
    @IntDef({WEB_SNIFFER, JSON_PARSE, JSON_EXTEND, JSON_MIX, GOD_PARSE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type { }
    public static final int WEB_SNIFFER = 0;//嗅探
    public static final int JSON_PARSE = 1;//Json
    public static final int JSON_EXTEND = 2;//Json擴展
    public static final int JSON_MIX = 3;//Json聚合
    public static final int GOD_PARSE = 4;//超級解析
}