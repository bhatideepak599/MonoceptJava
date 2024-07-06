package com.techlabs.model;

import java.util.LinkedHashMap;


public class LRUEvictionStrategy<K> implements EvictionStrategy<K> {
    private LinkedHashMap<K, Boolean> accessOrderMap;

    public LRUEvictionStrategy() {
        accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
    }

    @Override
    public void keyAccessed(K key) {
        accessOrderMap.put(key, true);
    }

    @Override
    public K evict() {
        K evictedKey = accessOrderMap.keySet().iterator().next();
        accessOrderMap.remove(evictedKey);
        return evictedKey;
    }
}

