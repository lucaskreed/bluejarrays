public class E7_2c
{
    public static void main(String[] args){

        int[] randoms = new int[10];
        for(int i = 0; i < randoms.length; i++){
            randoms[i] = (int)(Math.random() * 100) + 1;
            System.out.print(randoms[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < randoms.length; i++){
            if (randoms[i] % 2==0){
                randoms[i] = 0;
            }
            System.out.print(randoms[i] + " ");
        }
    }
}