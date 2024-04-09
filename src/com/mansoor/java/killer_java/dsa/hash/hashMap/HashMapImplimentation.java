package com.mansoor.java.killer_java.dsa.hash.hashMap;

import java.util.LinkedList;

public class HashMapImplimentation {
    public static class MyHashmap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEAULT_LOAD_FACTOR = 0.75f;

        private class Node {

            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;  // return  umber of entries in map
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();

            }
        }

        private int HashFunc(K key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        public MyHashmap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        public int size() {
            return n;
        }

        public void put(K key, V value) {
            int bi = HashFunc(key);
            LinkedList<Node> curreBucket = buckets[bi];
            int ei = searchInBucket(curreBucket, key);
            if (ei == -1) {
                Node node = new Node(key, value);
                curreBucket.add(node);
                n++;
            } else {
                Node currNode = curreBucket.get(ei);
                currNode.value = value;
            }
        }

        public V get(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> curreBucket = buckets[bi];
            int ei = searchInBucket(curreBucket, key);

            if (ei != -1) {
                Node currNode = curreBucket.get(ei);
                return currNode.value;
            }
            return null;

        }

        public V remove(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> curreBucket = buckets[bi];
            int ei = searchInBucket(curreBucket, key);

            if (ei != -1) {
                Node currNode = curreBucket.get(ei);
                V val = currNode.value;
                curreBucket.remove(ei);
                return val;
            }
            n--;
            return null;
        }

    }

    public static void main(String[] args) {
        MyHashmap<String , Integer> mp=new MyHashmap<>();
        System.out.println("Testing put");
        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        mp.put("d",4);
        System.out.println(mp.size());
        mp.put("c",40);
        System.out.println(mp.get("c"));
        System.out.println(mp.remove("2"));
    }
}
