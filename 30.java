class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int[][] an=new int[K][2];
        /*Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int i=0;i<points.length;i++) m.put(i,(int)Math.pow(points[i][0],2)+(int)Math.pow(points[i][1],2));
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)->m.get(a)-m.get(b));
        pq.addAll(m.keySet());
       for(int i=0;i<K;i++) an[i]=points[pq.poll()];
       return an;
    }
}
//  Second and easy Comparator
/*public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparing(p -> p[0] * p[0] + p[1] * p[1]));
        return Arrays.copyOfRange(points, 0, K);
    }*/

PriorityQueue<int[]> pq=new PriorityQueue<int[]>((p,q)->p[0]*p[0]+p[1]*p[1] - p[0]*p[0]+p[1]*p[1]);
for(int[] v:points){
    pq.offer(v);
    if(pq.size()>K)
        pq.poll();
}

while(K>0){
    an[--K]=pq.poll();
   }
return an;
  }
}