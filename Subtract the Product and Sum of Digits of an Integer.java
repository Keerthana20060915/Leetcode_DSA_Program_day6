class Solution {
    public int subtractProductAndSum(int n) {
        int l,product = 1,sum = 0;
        while(n!=0)
        {
            l = n%10;
            product = product*l;
            sum += l;
            n = n/10;
        }
        return product-sum;
    }
}
