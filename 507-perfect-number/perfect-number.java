// class Solution {
//     public boolean checkPerfectNumber(int num) {
//         int sum = 0;
//         int cpy = num;
//         for(int i=1; i<num;i++)
//         {
//             if(num%i==0)
//             {
//                 sum = sum+i;
//             }
//         }

//         if(cpy==sum){ return true;}
//         return false;
//     }
// }


public class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }

        }
        return sum == num;
    }
}
