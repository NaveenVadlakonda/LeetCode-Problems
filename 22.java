import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;
class Solution {
    public String frequencySort(String s) {
        String ans="";
        Map<Character,Integer> hm=new HashMap<Character,Integer>();
        for(char c:s.toCharArray()) hm.put(c,hm.getOrDefault(c,0)+1);
        /*System.out.println(hm);        
        List<Integer> l=new ArrayList<Integer>(hm.values());
         Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);
        for(int i:l){
            System.out.println(i);
            for(Map.Entry<Character,Integer> e:hm.entrySet()){
                if(e.getValue().equals(i)){
                    int j=0;
                    while(j<i){
                        ans+=e.getKey();
                    j++;}
            }
        }
        if(ans.length()==s.length())
            break;}
        return ans;*/
        Map<Character, Integer> s1 = hm .entrySet().stream().sorted(Map.Entry.<Character, Integer> comparingByValue().reversed()).collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
       /* List<Integer> l=new ArrayList<Integer>(hm.values());
         Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);
        for(int i:l){
            System.out.println(i);
            for(Map.Entry<Character,Integer> e:hm.entrySet()){
                if(e.getValue().equals(i)){
                    int j=0;
                    while(j<i){
                        ans+=e.getKey();
                    j++;}
            }
        }}*/
        for(Map.Entry<Character,Integer> e:s1.entrySet()){
            int c=e.getValue();
            while(c>0){
                ans+=e.getKey();
                c--;
            }
        }
        return ans;
        
    }
}