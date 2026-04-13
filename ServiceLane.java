public static List<Integer> serviceLane(int n,List<Integer> width, List<List<Integer>> cases) {
    // Write your code here
    List<Integer> result=new ArrayList<>();
    for (List<Integer>c:cases){
        int s=c.get(0);
        int e=c.get(1);
        int min=width.get(s);
        for(int i=s;i<=e;i++){
            if(width.get(i)<min) {
                min=width.get(i);
            }
        }
        result.add(min);
    }
    return result;
    }

}