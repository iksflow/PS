package leetcode.dailychallenge.year2020;

import java.util.Objects;

public class DesignHashSet {
    public static void main(String[] args) {
        MyHashSet mhs = new MyHashSet();
        mhs.add(1);
        mhs.add(2);
        System.out.println(mhs.contains(3));
        for(int i = 0; i < 10; i++) {
            System.out.println("mhs key:" + mhs.keys[i]);
        }
    }

    public static class MyHashSet {
        int[] keys = new int[1000001];

        public MyHashSet() {
            for(int i = 0; i < keys.length; i++) {
                keys[i] = -1;
            }
        }

        public void add(int key) {
            keys[key] = key;
        }

        public void remove(int key) {
            keys[key] = -1;
        }

        public boolean contains(int key) {
            return keys[key] != -1;
        }
    }
}
