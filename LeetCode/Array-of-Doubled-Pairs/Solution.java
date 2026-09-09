1class Solution {
2    public boolean canReorderDoubled(int[] arr) {
3        //every even index ka double should be equal to its next element
4        //but this is the trap , dont think indexwise in this ques
5        //just check if the current elem and double exists , if yes , then reduce both their freq 
6        
7        // and we will handle the zeroes separately  
8        HashMap<Integer,Integer> toClear = new HashMap<>();
9        int countPairs = 0;
10        int zeroCount = 0;
11        for(int i=0;i<arr.length;i++){
12            if(arr[i]==0) zeroCount++;
13            else toClear.put(arr[i],toClear.getOrDefault(arr[i],0)+1);
14        }
15        if(zeroCount%2!=0) return false;
16        Arrays.sort(arr);
17        for(int i=0;i<arr.length;i++){
18            if(arr[i]!=0 && toClear.get(arr[i])>0 && toClear.containsKey(2*arr[i]) && toClear.get(2*arr[i])>0){
19                toClear.put(arr[i],toClear.get(arr[i])-1);
20                toClear.put(2*arr[i],toClear.get(2*arr[i])-1);
21                countPairs+=2;
22            }
23        }
24        return (countPairs+zeroCount==arr.length);
25    }
26}