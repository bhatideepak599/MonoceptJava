package com.techlabs.model;

public interface EvictionStrategy<K> {
    void keyAccessed(K key);
    K evict();
}
