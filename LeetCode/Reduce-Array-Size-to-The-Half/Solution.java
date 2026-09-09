1class Solution {
2    public int minSetSize(int[] arr) {
3        //arr size = 10
4        // 3->4
5        // 5->3
6        // 2->2
7        // 7->1
8        
9        //atleast 5 remove karne hai,
10        // so 2->2 wala set aur 5->3 wala set remove kardenge
11        // so basically atleast 2 type of numbers need to be removed so we return 2 
12
13        HashMap<Integer,Integer> map = new HashMap<>();
14        for(int i=0;i<arr.length;i++){
15            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
16        }
17
18        // 4 1 2 3
19        //sort
20        // 1 2 3 4
21        int[] size = new int[map.size()];
22        int i=0;
23        for(int ele : map.keySet()){
24            size[i] = map.get(ele);
25            i++;
26        }
27
28        Arrays.sort(size);
29
30        int toReduce;
31        if(arr.length%2==0){
32            toReduce = arr.length/2;
33        }
34        else{
35            toReduce = (arr.length/2) + 1;
36        }
37
38        // 4 3 2 1
39        int count = 0 ;
40        for(int j=size.length-1;j>=0;j--){
41            if(toReduce>0){
42                count++;
43                toReduce -= size[j];
44            }
45        }
46        return count;
47    }
48}