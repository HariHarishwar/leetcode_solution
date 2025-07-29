class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        //int max = candies[0];
      
        int maxElement =candies[0];
        for(int i=0; i <candies.length;i++){
            if(maxElement<candies[i]){
                maxElement=candies[i];
            }
        }
        //max= maxElement+extraCandies;

        for(int i=0; i<candies.length;i++){
            if(candies[i]+extraCandies>=maxElement){
               result.add(true);
            }
            else{
                 result.add(false);
            }
        }
        return result;
    }
}