class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al=new ArrayList<>();
        List<Integer> al1=new ArrayList<>();
        al1.add(1);
        al.add(al1);
        for(int i=1;i<numRows;i++){
            List<Integer> al2=new ArrayList<>();
            al2.add(1);
            for(int j=1;j<i;j++){
                int temp=al.get(i-1).get(j)+al.get(i-1).get(j-1);
                al2.add(temp);
            }
            al2.add(1);
            al.add(al2);
           // al.add(temp);
        }
        return al;
    }
}