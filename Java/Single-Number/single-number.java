class Solution {
    public int singleNumber(int[] nums) {
        Set <Integer> set = new HashSet();
        
        for(int i:nums){
         if(!set.add(i)){
               set.remove(i);
         }
        }
          System.out.print(set);
        return set.stream().findFirst().get();
    }
}