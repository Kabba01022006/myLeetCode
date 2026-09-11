1int smallestEvenMultiple(int n) {
2    int multiple;
3    for(int i=1;i<=n;i++){
4        if(i%2 == 0 && i%n==0){
5            multiple = i;
6            break;
7        }
8        else{
9            multiple = 2*n;
10        }
11    }
12    return multiple;
13}