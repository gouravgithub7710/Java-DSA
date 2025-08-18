class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;  //checking for 0 and 1
        boolean[] Composites = new boolean[n];
        int limit = (int)Math.sqrt(n);
        // Array of Composites --> True represent Composite and False       represents Prime
        for(int i=2;i<=limit;i++){
            if(Composites[i]==false){
                // Mark all the multiples of i as true
                // if the first index fliped to true, is i*i
                for(int j=i*i;j<n;j+=i){
                    Composites[j]=true;
                }
            }
        }
        int count=0;
      for(int i=2;i<n;i++){
        if(Composites[i]==false) count++;
      }
    
    return count;
    }
}



// class Solution {
//     public int countPrimes(int n) {
//         int count = 0;
//         if (n <= 2) return 0;  
//         for (int i = 2; i < n; i++) {
//             if (isPrime(i)) {
//                 count++;
//             }
//         }
//         return count;
//     }

//       private boolean isPrime(int num) {
//         if (num <= 1) return false;
//         for (int i = 2; i * i <= num; i++) {
//             if (num % i == 0) return false;
//         }
//         return true;
//     }
// }