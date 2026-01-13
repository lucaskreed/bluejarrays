public class E7_2b
{
    public static void main(String[] args){

        int[] randoms = new int[10];
        for(int i = 0; i < randoms.length; i++){
            randoms[i] = (int)(Math.random() * 100) + 1;
            System.out.print(randoms[i] + " ");
        }
        System.out.println();

        int last = randoms[randoms.length - 1];

        for (int i = randoms.length - 1; i > 0; i--) {
            randoms[i] = randoms[i - 1];
        }

        randoms[0] = last;

        for(int i = 0; i < randoms.length; i++){
            System.out.print(randoms[i] + " ");
        }
    }
}