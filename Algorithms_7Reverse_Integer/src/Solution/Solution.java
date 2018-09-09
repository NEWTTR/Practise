package Solution;

public class Solution {
	public int reverse(int x) {
        int y = 0;
        int z = 0;
        while(x != 0){
            z = x % 10;
            x = x / 10;
            if(y > Integer.MAX_VALUE/10 || (y == Integer.MAX_VALUE/10 && z > 7)){ return 0;}
            if(y < Integer.MIN_VALUE/10 || (y == Integer.MIN_VALUE/10 && z < -8)){ return 0;}
            y = y*10 + z;
        }
        return y;
    }
	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.reverse(123));
	}
}

/*public int reverse(int x)
{
    int result = 0;

    while (x != 0)
    {
        int tail = x % 10;
        int newResult = result * 10 + tail;
        if ((newResult - tail) / 10 != result)
        { return 0; }
        result = newResult;
        x = x / 10;
    }

    return result;
}
} */
