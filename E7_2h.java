public class E7_2h
{
    public static void main(String[] args){
        E7_2h sorter = new E7_2h();

        int[] randoms = new int[10];
        for(int i = 0; i < randoms.length; i++){
            randoms[i] = (int)(Math.random() * 100) + 1;
            System.out.print(randoms[i] + " ");
        }
        System.out.println();  

        boolean sorted = sorter.checkSorted(randoms);
        System.out.println("Sorted? " + sorted);
    }

    public boolean checkSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;   
            }
        }
        return true; 
    }
}