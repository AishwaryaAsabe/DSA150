import java.util.HashSet;

class containsDuplicate{
    public boolean containsduplicate(int[] nums){
        HashSet<Integer> hashSet =new HashSet<>();
        for(int n:nums){
            if(hashSet.contains(n)){
                return true;

            }
            hashSet.add(n);
        }

        return false;
    }


    public static void main(String[] args) {
        containsDuplicate cs=new containsDuplicate();
        int []nums={1,2,3,4,5,6,7,8,9,1,2};
        System.out.println(cs.containsduplicate(nums));

        }
}