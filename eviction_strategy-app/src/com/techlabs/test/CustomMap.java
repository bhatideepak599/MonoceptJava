package com.techlabs.test;

import java.util.HashMap;
import java.util.Map;

import com.techlabs.model.EvictionStrategy;
import com.techlabs.model.LRUEvictionStrategy;

public class CustomMap<K, V> {
    private Map<K, V> map;
    private EvictionStrategy<K> evictionStrategy;
    private int maxSize;

    public CustomMap(EvictionStrategy<K> evictionStrategy, int maxSize) {
        this.map = new HashMap<>();
        this.evictionStrategy = evictionStrategy;
        this.maxSize = maxSize;
    }

    public V get(K key) {
        if (map.containsKey(key)) {
            evictionStrategy.keyAccessed(key);
            return map.get(key);
        }
        return null;
    }

    public void put(K key, V value) {
        if (map.size() >= maxSize) {
            K evictedKey = evictionStrategy.evict();
            map.remove(evictedKey);
        }
        map.put(key, value);
        evictionStrategy.keyAccessed(key);
    }

    public static void main(String[] args) {
        
        EvictionStrategy<String> lruStrategy = new LRUEvictionStrategy<>();
        CustomMap<String, Integer> customMap = new CustomMap<>(lruStrategy, 3);

        customMap.put("a", 1);
        customMap.put("b", 2);
        customMap.put("c", 3);
        
        System.out.println(customMap.get("a"));
        customMap.put("d", 4); 
        System.out.println(customMap.map); 
    }
}
