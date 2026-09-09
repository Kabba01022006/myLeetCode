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
16        //sorting is neccessary as cases such as [2,4,0,0,8,1] might fail as 2->4 but 8 will be left alone , so we will sort it such that pairing happens correct orderwise
17        Arrays.sort(arr);
18        for(int i=0;i<arr.length;i++){
19            if(arr[i]!=0 && toClear.get(arr[i])>0 && toClear.containsKey(2*arr[i]) && toClear.get(2*arr[i])>0){
20                toClear.put(arr[i],toClear.get(arr[i])-1);
21                toClear.put(2*arr[i],toClear.get(2*arr[i])-1);
22                countPairs+=2;
23            }
24        }
25        return (countPairs+zeroCount==arr.length);
26    }
27}