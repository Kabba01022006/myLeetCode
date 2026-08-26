1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        //there can be only two elements more than n/3 times
4        int element1=0;
5        int element2=0;
6        int n=nums.length;
7        int count1=0;
8        int count2=0;
9        for(int i=0;i<n;i++){
10            if(nums[i]==element1){
11                count1++;
12            }
13            else if(nums[i]==element2){
14                count2++;
15            }
16            else if(count1==0){
17                element1=nums[i];
18                count1=1;
19            }
20            else if(count2==0){
21                element2=nums[i];
22                count2=1;
23            }
24            else{
25                count1--;
26                count2--;
27            }
28            
29        }
30        int count1Final=0;
31        int count2Final=0;
32        for(int i=0;i<n;i++){
33            if(nums[i]==element1) count1Final++;
34            else if(nums[i]==element2) count2Final++;
35        }
36        ArrayList<Integer> answer = new ArrayList<>();
37        if(count1Final>n/3){
38            answer.add(element1);
39        }
40        if(count2Final>n/3){
41            answer.add(element2);
42        }
43        return answer;
44    }
45}