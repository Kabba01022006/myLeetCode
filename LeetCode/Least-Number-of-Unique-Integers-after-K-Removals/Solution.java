1class Solution {
2    public int findLeastNumOfUniqueInts(int[] arr, int k) {
3        //store freq
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for(int i=0;i<arr.length;i++){
6            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
7        }
8        //at the end humein dupicate maximise krne hai , means jinki freq jyada hai unhe maximise karna hai , to freq kum wale hatayengw
9        int[] freq = new int[map.size()];
10        int i=0;
11        for(int ele:map.keySet()){
12            freq[i]=map.get(ele);
13            i++;
14        }
15        //sort the freq 
16        Arrays.sort(freq);
17        int remove=k;
18        int count=0;
19        for(i=0;i<freq.length;i++){
20            if(remove-freq[i]>=0){
21                remove-=freq[i];
22                count++;
23            }
24        }
25        return map.size()-count;
26    }
27}