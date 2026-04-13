    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    int appleCount=0;
    for(int d:apples){
        int dis=a+d;
        if(dis>=s&&dis<=t){
            appleCount++;
        }
    }
    int orangeCount=0;
    for(int d:oranges){
        int dis=b+d;
        if(dis>=s&&dis<=t){
            orangeCount++;
        }
    }
    System.out.println(appleCount);
    System.out.println(orangeCount);
    }

}