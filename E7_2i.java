public class E7_2i
{
    public static void main(String[] args){
        E7_2i duplicates = new E7_2i();

        int[] randoms = new int[10];
        for(int i = 0; i < randoms.length; i++){
            randoms[i] = (int)(Math.random() * 100) + 1;
            System.out.print(randoms[i] + " ");
        }
        System.out.println();  

        boolean duplicate = duplicates.checkDuplicate(randoms);
        System.out.println("Adjacent duplicate elements? " + duplicate);
    }

    public boolean checkDuplicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;   
            }
        }
        return false; 
    }
}