public class E7_2a
{
    public static void main(String[] args){

        int[] randoms = new int[10];
        for(int i = 0; i < randoms.length; i++){
            randoms[i] = (int)(Math.random() * 100) + 1;
            System.out.print(randoms[i] + " ");
        }
        System.out.println();

        int temp = randoms[0];
        randoms[0] = randoms[randoms.length - 1];
        randoms[randoms.length - 1] = temp;

        for (int i = 0; i < randoms.length; i++) {
            System.out.print(randoms[i] + " ");
        }
    }
}