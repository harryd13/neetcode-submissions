class Solution {
    public boolean hasDuplicate(int[] nums) {
       // create a set
    Set<Integer> set = new HashSet<>();
    // run through nums -> fill set, if we see set element again return true
    for(int n:nums){
        if(set.contains(n)) return true;
        set.add(n);
    }
    return false;
    }
}