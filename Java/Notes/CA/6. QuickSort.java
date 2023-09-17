package CA;

class QuickSort {

    public static void main(String [] args) {

        // Divide and Conquer Methodology:

        // the list is partitioned into two sublists
        // each sublist is then sorted
        // sorted sublists are combined into one list in such a way that the combined list is also sorted

        // the 'pivot' element is used to divide the list into upperSubList, and lowerSubList
        // - the elements in upperSubList are >= pivot
        // - the elements in lowerSubList are < pivot

        // Pivot can be chosen in many ways
        // ideally the pivot divides the list into two sublists of nearly equal size

        // the pivot element is a chosen value within the index, the sub lists are created with all values that are lesser than or greater than
        

        // Partitioning Approach 1:
        // Select the element at index 0

        // Partitioning Approach 2:
        // Select the middle most element
        // swap it with the first element
        // - if the following elements are smaller than the pivot, place it in smallIndex
        // - if the following elements are larger than the pivot, place it in smallIndex
         

        // 


    }

    public void recQuickSort(E[] list, int first, int last){
        int pivotLocation;
        if(first < last) {
	    pivotLocation = partition(list, first, last);
	    recQuickSort(list, first, pivotLocation - 1);
	    recQuickSort(list, pivotLocation + 1, last);
   }
}	

}
