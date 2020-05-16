class Solution {
    public int maxSubarraySumCircular(int[] A) {
       int max_c=A[0],min_c=A[0],glo_max=A[0],glo_min=A[0],i;
       int s=A[0]; 
       for(i=1;i<A.length;i++){
           s+=A[i];
           max_c=Math.max(A[i],max_c+A[i]);
           if(max_c>glo_max){
            glo_max=max_c;
        }
           min_c=Math.min(A[i],min_c+A[i]);
           if(min_c<glo_min){
            glo_min=min_c;
        }
       }
        if(s==glo_min)
            return glo_max;
        return Math.max(glo_max,s-glo_min);
    }
}