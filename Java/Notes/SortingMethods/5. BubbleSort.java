package SortingMethods;


class BubbleSort {
    
    public static void main(String [] args) {

        // Sorting Data to improve the efficiency with which it is handled is an accepted part of daily life
        // common measures for complexity analysis for sorting algorithms are:
        //  - the numbers of comparisons that occur
        //  - the number of data movements that take place
        // This isn't surprising, because in sorting, we compare and possibly move data; the size of the data set then plays a role
        // We must also consider the behaviour of algorithms
        // - some may differ depending on the original state of the data set (sorted, unsorted, partialy sorted)
        // others may behave the same way regardless of the data

        // Complexity Analysis of Sorting Algorithms

        // yet another consideration is the complexity of the algorithms themselves
        // some methods are considerably less efficient than others
        // however, for smaller data sets, they may prove to be faster, because their coding is simpler and executes faster
        // so simpler algorithms may prove more useful with less data than their elaborate counteraparts
        // as the amount of data grows, the need for more sophisticated and more lengthy (codewise) algorithms will become more apparent


        // Bubble Sort:

        // a simple sorting algorithm that works by repeatedly stepping through the list to be sorted
        // on each pass through the list, it compares pairs of adjacent items and swaps them if they are the wrong order
        // the passes through the list are repeated until no swaps are needed, which indicates that the list is sorted
        // name comes from how smaller elements 'bubble to the top' 

        int [] list = {5,3,2,5,10,7,1,6,5};

        bubble(list, 9); // 9 indicates how many times the bubble sort will run through the code, more than the maximum number is pointless, and less than the max means that the last few elements wont be sorted

        int n = list.length;

        for(int i = 1; i < n; i++) { // for some reason it ignores index[0]
           System.out.println(list[i]);
        }


        


    }

    public static void bubble(int[] e, int n) {
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < e.length-1; j++) {
                if(e[j] > e[j+1]) {
                    int swap = e[j+1];
                    e[j+1] = e[j];
                    e[j] = swap;
                }
            }
        }
    }

}
