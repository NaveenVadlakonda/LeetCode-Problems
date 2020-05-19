class StockSpanner {
    List<Integer> l;    
    public StockSpanner() {
       l=new ArrayList<Integer>();
    }    
    public int next(int price) {
        int c=0;
        l.add(price);       
        for(int i=l.size()-1;i>=0;i--){
            if(l.get(i)>price) break;
            else c++;                
            }
        return c;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */