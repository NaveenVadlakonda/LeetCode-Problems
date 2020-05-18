class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> s1m=new HashMap<>();
        Map<Character,Integer> s2m=new HashMap<>();
        //Table
        for(char ch:s1.toCharArray())
            s1m.put(ch,s1m.getOrDefault(ch,0)+1);
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(s2m.containsKey(ch)){
            s2m.put(ch,s2m.get(ch)+1);
            }
            else{
                s2m.put(ch,1);
            }
            if(i>=s1.length()){
                ch=s2.charAt(i-s1.length());
                if(s2m.get(ch)==1){
                    s2m.remove(ch);
                }
                else{
                    s2m.put(ch,s2m.get(ch)-1);
                }
            }
            if(s1m.equals(s2m))
                return true;
        }        
       return false; 
        
    }
}