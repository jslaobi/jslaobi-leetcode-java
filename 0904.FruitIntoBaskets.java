class Solution {
    public int totalFruit(int[] tree) {
        int max = 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int j=0;

        for(int i=0;i<tree.length;i++){
            map.put(tree[i], i);
            if(map.size() >2){
               int minIndex = tree.length - 1;
               for(int fruit : map.values()){
                   if(fruit < minIndex){
                       minIndex = fruit;
                   }
               }

               map.remove(tree[minIndex]);
               j = minIndex+1;
            }

            max = Math.max(max, i-j+1);
        }


        return max;
    }
}