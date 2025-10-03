class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        combinations(list, curr, candidates, target, 0);
        return list;
    }

    public void combinations(List<List<Integer>> list, List<Integer> curr, int[] candidates, int target, int idx){
        if(target == 0){
           list.add(new ArrayList<>(curr));
        }
        for(int i = idx; i < candidates.length; i++){
            if(i > idx && candidates[i] == candidates[i-1]) {
                continue;
            }
            if(candidates[i] > target){
                break;
            }
            curr.add(candidates[i]);
            combinations(list, curr, candidates, target-candidates[i], i+1);
            curr.remove(curr.size()-1);
        }
    }
}
