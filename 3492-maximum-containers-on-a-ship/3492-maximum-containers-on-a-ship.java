class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        if (w==0) return n*n;
        int limit=maxWeight/w;
        int space=n*n;
        return Math.min(limit,space);
    }
}