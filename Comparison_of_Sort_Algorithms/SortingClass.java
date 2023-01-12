
public class SortingClass {
  
	SortingClass(){}

	private int a[];	// the actual data that has to be sorted for introsort
	private int n;	// the number of elements in the data for introsort

	// Constructor to initialize the size of the data(for IntroSort)
	SortingClass(int n){
		a = new int[n];
		this.n = 0;
	}

//HeapSort----------------------------------------------------------------------------------------------------------
	
	static void heapify(int a[], int n, int i){//Creates max heap on reduced array  
		
		int largest = i; // Initialize largest as root  
		int left = 2 * i + 1; // left child  
		int right = 2 * i + 2; // right child  
	    
		// If left child is larger than root  
		if (left < n && a[left] > a[largest])  
			largest = left;  
	    
		// If right child is larger than root  
		if (right < n && a[right] > a[largest])  
			largest = right;  
	    
		// If root is not largest  
		if (largest != i) {// swap a[i] with a[largest]  
			int temp = a[i];  
			a[i] = a[largest];  
			a[largest] = temp;  	          
			heapify(a, n, largest);  
		}  
	}  
			
	static void heapSort(int a[], int n){  
		for (int i = n / 2 - 1; i >= 0; i--)  
			heapify(a, n, i);  

		for (int i = n - 1; i >= 0; i--) { //swap first and last node
			int temp = a[0];  
			a[0] = a[i];  
			a[i] = temp;        
			heapify(a, i, 0);  
		}  
	}  

	
//INTRO-----------------------------------------------------------------------------------
		
	// The utility function to insert the data
	public void dataAppend(int temp) {
		a[n] = temp;
		n++;
	}

	// The utility function to swap two elements
	public void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	// To maxHeap a subtree rooted with node i which is an index in a[]. heapN is size of heap
	public void maxHeap(int i, int heapN, int begin) {
		int temp = a[begin + i - 1];
		int child;

		while (i <= heapN / 2) {
			child = 2 * i;

			if (child < heapN && a[begin + child - 1] < a[begin + child])
				child++;

			if (temp >= a[begin + child - 1])
				break;

			a[begin + i - 1] = a[begin + child - 1];
			i = child;
		}
		a[begin + i - 1] = temp;
	}

	// Function to build the heap (rearranging the array)
	public void heapify(int begin, int end, int heapN) {
		for (int i = (heapN) / 2; i >= 1; i--)
			maxHeap(i, heapN, begin);
	}

	// main function to do heapsort
	public void heapSort(int begin, int end) {
		int heapN = end - begin;
		this.heapify(begin, end, heapN);// Build heap (rearrange array)
	
		for (int i = heapN; i >= 1; i--) {// One by one extract an element from heap		
			swap(begin, begin + i);// Move current root to end			
			maxHeap(1, i, begin);// call maxHeap() on the reduced heap
		}
	}

	// function that implements insertion sort
	public void insertionSort(int left, int right) {

		for (int i = left; i <= right; i++) {
			int key = a[i];
			int j = i;

			// Move elements of arr[0..i-1], that are greater than the key, to one position ahead of their current position
			while (j > left && a[j - 1] > key) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = key;
		}
	}

	// Function for finding the median of the three elements
	public int findPivot(int a1, int b1, int c1) {
		int max = Math.max(Math.max(a[a1], a[b1]), a[c1]);
		int min = Math.min(Math.min(a[a1], a[b1]), a[c1]);
		int median = max ^ min ^ a[a1] ^ a[b1] ^ a[c1];
		if (median == a[a1])
			return a1;
		if (median == a[b1])
			return b1;
		return c1;
	}

		// This function takes the last element as pivot, places
		// the pivot element at its correct position in sorted
		// array, and places all smaller (smaller than pivot)
		// to the left of the pivot and greater elements to the right of the pivot
	public int partition(int low, int high) 	{
		
		int pivot = a[high];		
		int i = (low - 1);// Index of smaller element
		for (int j = low; j <= high - 1; j++) {// If the current element is smaller than or equal to the pivot
			if (a[j] <= pivot) {// increment index of smaller element
				i++;
				swap(i, j);
			}
		}
		swap(i + 1, high);
		return (i + 1);
	}

		// The main function that implements Introsort
		// low --> Starting index,
		// high --> Ending index,
		// depthLimit --> recursion level
	public void sortDataUtil(int begin, int end, int depthLimit) {
		if (end - begin > 16) {
			if (depthLimit == 0) {// if the recursion limit is occurred call heap sort
				this.heapSort(begin, end);
				return;
			}

			depthLimit = depthLimit - 1;
			int pivot = findPivot(begin, begin + ((end - begin) / 2) + 1, end);
			swap(pivot, end);

			// p is partitioning index, arr[p] is now at right place
			int p = partition(begin, end);

			// Separately sort elements before partition and after partition
			sortDataUtil(begin, p - 1, depthLimit);
			sortDataUtil(p + 1, end, depthLimit);
		}
		else {// if the data set is small, call insertion sort
			insertionSort(begin, end);
		}
	}

	// A utility function to begin the Introsort module
	public void sortData() {
		// Initialise the depthLimit as 2*log(length(data))
		int depthLimit = (int)(2 * Math.floor(Math.log(n) / Math.log(2)));
		this.sortDataUtil(0, n - 1, depthLimit);
	}

	// A utility function to print the array data
	public void printData() {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}	
		
		
	//SHELL-----------------------------------------------------------------------------------
	
	static void shellSort(int a[], int n) {  
	   /* Rearrange the array elements at n/2, n/4, ..., 1 intervals */  
		for (int interval = n/2; interval > 0; interval /= 2) {  
			for (int i = interval; i < n; i += 1) {  
	           /* store a[i] to the variable temp and make the ith position empty */  
				int temp = a[i];  
				int j;        
				for (j = i; j >= interval && a[j - interval] > temp; j -= interval)  
					a[j] = a[j - interval];  
	             
	           /* put temp (the original a[i]) in its correct position */  
				a[j] = temp;  
			}  
		}  
	}  
		
}
