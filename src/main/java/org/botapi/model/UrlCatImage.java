package org.botapi.model;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class UrlCatImage implements Comparable<UrlCatImage>{

    private String id;

    @SerializedName("url")
    private String catUrl;

    @Override
    public String toString() {
        return catUrl;
    }

    @Override
    public int compareTo(@NotNull UrlCatImage o) {
        return 0;
    }



}
