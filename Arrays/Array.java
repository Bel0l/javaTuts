package Arrays;

public class Array {
    private int[] num;
    private int count;

    public Array(int length){
        num = new int[length];
    }
    public void insert (int nums){
        if (num.length == count){
            int[] newNum = new int[count * 2];
            for (int i =0; i < count ; i++)
                newNum[i]=num[i];
            num=newNum;
        }
        num[count++]=nums;
    }

    public void print () {
        for (int i = 0; i < count; i++)
        System.out.println(num[i]);

    }
}
