package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length; // number of provinces
        List<List<Integer>> adjacencyList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> directConnections = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    directConnections.add(j);
                }
            }
            adjacencyList.add(directConnections);
        }

        int count = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (adjacencyList.get(i).equals(new ArrayList<>())) {
                count++;
                continue;
            }
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            Queue<Integer> queue = new LinkedList<>();
            queue.addAll(adjacencyList.get(i));
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int j = 0; j < size; j++) {
                    Integer current = queue.poll();
                    visited[current] = true;
                    for (int k = 0; k < adjacencyList.get(current).size(); k++) {
                        if (!visited[adjacencyList.get(current).get(k)]) {
                            queue.add(adjacencyList.get(current).get(k));
                        }
                    }
                }
            }
            count++;
        }

        return count;
    }
}
