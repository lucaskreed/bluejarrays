public class E7_2j
{
    public static void main(String[] args){
        E7_2j duplicates = new E7_2j();

        int[] randoms = new int[10];
        for(int i = 0; i < randoms.length; i++){
            randoms[i] = (int)(Math.random() * 100) + 1;
            System.out.print(randoms[i] + " ");
        }
        System.out.println();  

        boolean duplicate = duplicates.checkDuplicate(randoms);
        System.out.println("Need not be Adjacent duplicate elements? " + duplicate);
    }

    public boolean checkDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}