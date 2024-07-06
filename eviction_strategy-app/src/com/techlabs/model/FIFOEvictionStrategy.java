package com.techlabs.model;

import java.util.LinkedList;
import java.util.Queue;

public class FIFOEvictionStrategy<K> implements EvictionStrategy<K> {
    private Queue<K> queue;

    public FIFOEvictionStrategy() {
        queue = new LinkedList<>();
    }

    @Override
    public void keyAccessed(K key) {
        if (!queue.contains(key)) {
            queue.offer(key);
        }
    }

    @Override
    public K evict() {
        return queue.poll();
    }
}

