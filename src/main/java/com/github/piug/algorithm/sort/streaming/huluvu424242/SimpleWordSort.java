package com.github.piug.algorithm.sort.streaming.huluvu424242;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SimpleWordSort {

    final String[] words;

    public SimpleWordSort(final String[] words){
        if( words==null){
            throw new IllegalArgumentException("Als Array darf nicht null übergeben werden");
        }
        this.words=words;
    }

    public String[] sort(){
        return Arrays.stream(words).sorted().collect(Collectors.toList()).toArray(new String[0]);
    }
}
