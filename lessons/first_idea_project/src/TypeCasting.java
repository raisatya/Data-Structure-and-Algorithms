public class TypeCasting {
    public static void main(String[] args) {
        float fnum = 34.58f;

        //Type Promotion: Java automatically promotes type to the higher type
        // when two or more types are being used at the same time.
        int num = (int)(fnum); //Float to integer
        System.out.println(num);
        System.out.println((int)(fnum)); //(int)(fnum) => This is type casting.
    }
}
