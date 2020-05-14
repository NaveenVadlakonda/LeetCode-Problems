public class Solution {
    public String removeKdigits(String num, int k) {
        //change to list
        List<Character> list = new ArrayList<Character>();
        for(char c : num.toCharArray()){
            list.add(c);
        }
        //we need to remove k digits
        for(int i = 0; i<k; i++){
            int size = list.size();
            //observation 1
            if(size > 1 && list.get(1) == '0'){
                list.remove(0);
                while(!list.isEmpty() && list.get(0) == '0'){
                    list.remove(0);
                }
            }
            //if no observation 1, use observation 2
            if(size == list.size()){
                for(int j = 0; j < size; j++){
                    if((j < size - 1 && list.get(j) > list.get(j+1)) || (j == size - 1)){
                        list.remove(j);
                        break;
                    }  
                }
            }
        }
        //generate output
        if(list.size() == 0) return "0";
        StringBuilder result = new StringBuilder();
        for(Character c : list){
            result.append(c);
        }
        return result.toString();
    }
}