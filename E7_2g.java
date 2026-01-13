public class E7_2g
{
    public static void main(String[] args){
        int[] randoms = new int[10];
        for(int i = 0; i < randoms.length; i++){
            randoms[i] = (int)(Math.random() * 100) + 1;
            System.out.print(randoms[i] + " ");
        }
        System.out.println();  
        
        int largest = randoms[0];
        int secondLargest = randoms[0];
        for (int i = 1; i < randoms.length; i++) {
            if (randoms[i] > largest) {
                secondLargest = largest;
                largest = randoms[i];
            }
            else if (randoms[i] > secondLargest && randoms[i] !=largest){
                secondLargest = randoms[i];
            }
        }
        System.out.println("Second Largest Element in randoms: " + secondLargest);
    }
}