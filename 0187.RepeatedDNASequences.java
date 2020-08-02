class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<String>();
        Set<String> result =  new HashSet<String>();
        int i = 0;
        while(i+10<=s.length()){
            String dna = s.substring(i,i+10);
            if(set.contains(dna)){
                result.add(dna);
            }else{
                set.add(dna);
            }

            i++;
        }
   
        return new ArrayList<String>(result);
    }
}