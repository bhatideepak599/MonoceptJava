package com.techlabs.model;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LFUEvictionStrategy<K> implements EvictionStrategy<K> {
    private Map<K, Integer> usageCount;
    private PriorityQueue<K> minHeap;

    public LFUEvictionStrategy() {
        usageCount = new HashMap<>();
        minHeap = new PriorityQueue<>((a, b) -> usageCount.get(a) - usageCount.get(b));
    }

    @Override
    public void keyAccessed(K key) {
        usageCount.put(key, usageCount.getOrDefault(key, 0) + 1);
        minHeap.remove(key);
        minHeap.offer(key);
    }

    @Override
    public K evict() {
        K evictedKey = minHeap.poll();
        usageCount.remove(evictedKey);
        return evictedKey;
    }
}
