import java.util.*;

public class SortBy {

    public static void main(String args[]){

        int[] toSort = new int[5] ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer les 10 chiffres à trier.");
        for(int i=0;i<5;i++){
            System.out.print("\nChiffre n°"+(i+1)+" :");
            toSort[i]=sc.nextInt();
        }
        printIntegerTab(toSort);
        System.out.println("Voici la liste triée : ");
        printIntegerTab(sortMinToMax(toSort));
        printIntegerTab(toSort);

    }

    public static void printIntegerTab(int[] toPrint){
        for(int print:toPrint){
            System.out.print(print+",");
        }
        System.out.println("");
    }

    public static int[] copyTab(int[] toCopy){
        int[] copy = new int[toCopy.length];
        for(int i =0; i<toCopy.length;i++){
            copy[i]=toCopy[i];
        }
        return copy;
    }

    public static int[] sortMinToMax(int[] toSort){
        int[] sortedTab=copyTab(toSort);
        for(int i=0; i<sortedTab.length;i++){
            for(int y =0;y<sortedTab.length;y++){
                if(sortedTab[i]<sortedTab[y]){
                    swapIntIntoTab(sortedTab,i,y);
                }
            }
        }
        return sortedTab;
    }

    public static void swapIntIntoTab(int[] toSwap,int index1, int index2){
        int temp = toSwap[index2];
        toSwap[index2]=toSwap[index1];
        toSwap[index1]=temp;
    }
}
