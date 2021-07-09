package cn.com.yunweizhan.middle;

import java.util.*;

public class Solution399_ {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String,Double>> graph = doGraph(equations, values);
        double[] res = new double[queries.size()];
        int index = 0;
        for(List<String> q : queries){
            res[index++] = dfs(graph, new HashSet<>(), q.get(0), q.get(1), 1);
        }
        return res;
    }

    public double dfs(Map<String, Map<String,Double>> graph, Set<String> visited, String start, String end, double ans){
        if(!graph.containsKey(start) || !graph.containsKey(end)) return -1;
        Map<String, Double> edges = graph.get(start);
        for(String key : edges.keySet()){
            if(!visited.contains(key)){
                visited.add(key);
                double v = edges.get(key);
                if(key.equals(end)) return ans*v;  //
                double d = dfs(graph, visited, key, end, ans*v);
                if(d != -1) return d;
            }
        }
        return -1;
    }

    public Map<String, Map<String,Double>> doGraph(List<List<String>> equations, double[] values){
        Map<String, Map<String,Double>> graph = new HashMap<>();
        for(int i = 0 ; i < equations.size(); i++){
            String s = equations.get(i).get(0);
            String t = equations.get(i).get(1);
            double val = values[i];
            Map<String, Double> edge1 = graph.getOrDefault(s, new HashMap<>());
            edge1.put(t, val);
            graph.put(s, edge1);
            Map<String, Double> edge2 = graph.getOrDefault(t, new HashMap<>());
            edge2.put(s, 1/val);
            graph.put(t, edge2);
        }
        return graph;
    }
}
