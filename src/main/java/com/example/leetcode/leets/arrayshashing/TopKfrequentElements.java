package com.example.leetcode.leets.arrayshashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKfrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();

        for (var num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        var priorityQueue = new PriorityQueue<Map.Entry<Integer, Integer>>(
              (e1, e2) -> e1.getValue() - e2.getValue());

        for (var entry : map.entrySet()) {

            priorityQueue.add(entry);

            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        var result = new int[k];

        for (int i = priorityQueue.size() - 1; i >= 0; i--) {
            result[i] = priorityQueue.poll().getKey();
        }

        return result;
    }

}
