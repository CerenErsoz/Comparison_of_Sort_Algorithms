import java.util.Random;

public class MainTest {

	public static void main(String[] args) {
		Random rnd = new Random();		
		SortingClass sorting = new SortingClass();
		long startTime, endTime, estimatedTime;
		int count;
		
		System.out.println("HEAPSORT\n---------");		
		System.out.println("Equal Order");
		//1,000 numbers, equal order
		int n = 1000;
		int array1[] = new int[n];
		for (int i = 0; i < n; i++) {
			array1[i] = 3;
		}
		startTime = System.nanoTime(); 
		sorting.heapSort(array1, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("1,000 numbers --> " + estimatedTime);
		
		//10,000 numbers, equal order
		n = 10000;
		int array2[] = new int[n];
		for (int i = 0; i < n; i++) {
			array2[i] = 3;
		}
		startTime = System.nanoTime(); 
		sorting.heapSort(array2, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("10,000 numbers --> " + estimatedTime);
				
		//100,000 numbers, equal order
		n = 100000;
		int array3[] = new int[n];
		for (int i = 0; i < n; i++) {
			array3[i] = 3;
		}
		startTime = System.nanoTime(); 
		sorting.heapSort(array3, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("100,000 numbers --> " + estimatedTime);
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("\nRandom Order");
		//1,000 numbers, random order
		n = 1000;
		int array4[] = new int[n];
		for (int i = 0; i < n; i++) {
			array4[i] = rnd.nextInt(1000);
		}		
		startTime = System.nanoTime(); 
		sorting.heapSort(array4, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("1,000 numbers --> " + estimatedTime);
		
		//10,000 numbers, random order
		n = 10000;
		int array5[] = new int[n];
		for (int i = 0; i < n; i++) {
			array5[i] = rnd.nextInt(10000);
		}			
		startTime = System.nanoTime(); 
		sorting.heapSort(array5, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("10,000 numbers --> " + estimatedTime);
		
		
		//100,000 numbers, random order
		n = 100000;
		int array6[] = new int[n];
		for (int i = 0; i < n; i++) {
			array6[i] = rnd.nextInt(100000);
		}				
		startTime = System.nanoTime(); 
		sorting.heapSort(array6, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("100,000 numbers --> " + estimatedTime);
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		System.out.println("\nIncreasing Order");
		//1,000 numbers, increasing order
		n = 1000;
		int array7[] = new int[n];
		for (int i = 0; i < n; i++) {
				array7[i] = i;
		}		
		startTime = System.nanoTime(); 
		sorting.heapSort(array7, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("1,000 numbers --> " + estimatedTime);
		
		
		//10,000 numbers, increasing order
		n = 10000;
		int array8[] = new int[n];
		for (int i = 0; i < n; i++) {
			array8[i] = i;
		}				
		startTime = System.nanoTime(); 
		sorting.heapSort(array8, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("10,000 numbers --> " + estimatedTime);
		
		
		//100,000 numbers, increasing order
		n = 100000;
		int array9[] = new int[n];
		for (int i = 0; i < n; i++) {
			array9[i] = i;
		}				
		startTime = System.nanoTime(); 
		sorting.heapSort(array9, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("100,000 numbers --> " + estimatedTime);
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("\nDecreasing Order");
		//1,000 numbers, decreasing order
		n = 1000;
		count = 1000;
		int array10[] = new int[n];
		for (int i = 0; i < n; i++) {
			array10[i] = count;
			count--;
		}		
		startTime = System.nanoTime(); 
		sorting.heapSort(array10, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("1,000 numbers --> " + estimatedTime);


		//10,000 numbers, decreasing order
		n = 10000;
		count = 10000;
		int array11[] = new int[n];
		for (int i = 0; i < n; i++) {
			array11[i] = count;
			count--;
		}
		startTime = System.nanoTime(); 
		sorting.heapSort(array11, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("10,000 numbers --> " + estimatedTime);


		//100,000 numbers, decreasing order
		n = 100000;
		count = 100000;
		int array12[] = new int[n];
		for (int i = 0; i < n; i++) {
			array12[i] = count;
			count--;
		}
		startTime = System.nanoTime(); 
		sorting.heapSort(array12, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("100,000 numbers --> " + estimatedTime);

/////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////
				
		System.out.println("\n\nINTROSORT\n-----------");

		System.out.println("Equal Order");		
		//1,000 numbers, equal order
		n = 1000;
		SortingClass introsort = new SortingClass(n);
		for (int i = 0; i < n; i++) {
			introsort.dataAppend(3);
		}	
		startTime = System.nanoTime(); 
		introsort.sortData();
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("1,000 numbers --> " + estimatedTime);
		
		
		//10,000 numbers, equal order
		n = 10000;
		SortingClass introsort2 = new SortingClass(n);
		for (int i = 0; i < n; i++) {
			introsort2.dataAppend(3);
		}		
		startTime = System.nanoTime(); 
		introsort2.sortData();
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("10,000 numbers --> " + estimatedTime);
			
		
		//100,000 numbers, equal order
		n = 100000;
		SortingClass introsort3 = new SortingClass(n);
		for (int i = 0; i < n; i++) {
			introsort3.dataAppend(3);
		}				
		startTime = System.nanoTime(); 
		introsort3.sortData();
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("100,000 numbers --> " + estimatedTime);		
				
//////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println("\nRandom Order");
		//1,000 numbers, random order
		n = 1000;
		SortingClass introsort4 = new SortingClass(n);
		for (int i = 0; i < n; i++) {
			introsort4.dataAppend(rnd.nextInt(1000));
		}	
		startTime = System.nanoTime(); 
		introsort4.sortData();
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("1,000 numbers --> " + estimatedTime);
				
				
		//10,000 numbers, random order
		n = 10000;
		SortingClass introsort5 = new SortingClass(n);
		for (int i = 0; i < n; i++) {
			introsort5.dataAppend(rnd.nextInt(10000));
		}		
		startTime = System.nanoTime(); 
		introsort5.sortData();
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("10,000 numbers --> " + estimatedTime);
					
				
		//100,000 numbers, random order
		n = 100000;
		SortingClass introsort6 = new SortingClass(n);
		for (int i = 0; i < n; i++) {
			introsort6.dataAppend(rnd.nextInt(100000));
		}				
		startTime = System.nanoTime(); 
		introsort6.sortData();
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("100,000 numbers --> " + estimatedTime);		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("\nIncreasing Order");
		//1,000 numbers, increasing order
		n = 1000;
		SortingClass introsort7 = new SortingClass(n);
		for (int i = 0; i < n; i++) {
			introsort7.dataAppend(i);
		}	
		startTime = System.nanoTime(); 
		introsort7.sortData();
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("1,000 numbers --> " + estimatedTime);
						
						
		//10,000 numbers, increasing order
		n = 10000;
		SortingClass introsort8 = new SortingClass(n);
		for (int i = 0; i < n; i++) {
			introsort8.dataAppend(i);
		}		
		startTime = System.nanoTime(); 
		introsort8.sortData();
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("10,000 numbers --> " + estimatedTime);
							
						
		//100,000 numbers, increasing order
		n = 100000;
		SortingClass introsort9 = new SortingClass(n);
		for (int i = 0; i < n; i++) {
			introsort9.dataAppend(i);
		}				
		startTime = System.nanoTime(); 
		introsort9.sortData();
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("100,000 numbers --> " + estimatedTime);		
				
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println("\nDecreasing Order");
		//1,000 numbers, decreasing order
		n = 1000;
		count = 1000;
		SortingClass introsort10 = new SortingClass(n);
		for (int i = 0; i < n; i++) {
			introsort10.dataAppend(count);
			count--;
		}	
		startTime = System.nanoTime(); 
		introsort10.sortData();
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("1,000 numbers --> " + estimatedTime);
								
								
		//10,000 numbers, decreasing order
		n = 10000;
		count = 10000;
		SortingClass introsort11 = new SortingClass(n);
		for (int i = 0; i < n; i++) {
			introsort11.dataAppend(count);
			count--;
		}		
		startTime = System.nanoTime(); 
		introsort11.sortData();
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("10,000 numbers --> " + estimatedTime);
									
								
		//100,000 numbers, decreasing order
		n = 100000;
		count = 100000;
		SortingClass introsort12 = new SortingClass(n);
		for (int i = 0; i < n; i++) {
			introsort12.dataAppend(count);
			count--;
		}				
		startTime = System.nanoTime(); 
		introsort12.sortData();
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("100,000 numbers --> " + estimatedTime);	
				
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n\nSHELLSORT\n---------");
		System.out.println("Equal Order");
		//1,000 numbers, equal order
		n = 1000;
		int array13[] = new int[n];
		for (int i = 0; i < n; i++) {
			array13[i] = 3;
		}
		startTime = System.nanoTime(); 
		sorting.shellSort(array13, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("1,000 numbers --> " + estimatedTime);
		
		//10,000 numbers, equal order
		n = 10000;
		int array14[] = new int[n];
		for (int i = 0; i < n; i++) {
			array14[i] = 3;
		}
		startTime = System.nanoTime(); 
		sorting.shellSort(array14, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("10,000 numbers --> " + estimatedTime);
				
		//100,000 numbers, equal order
		n = 100000;
		int array15[] = new int[n];
		for (int i = 0; i < n; i++) {
			array15[i] = 3;
		}
		startTime = System.nanoTime(); 
		sorting.shellSort(array15, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("100,000 numbers --> " + estimatedTime);
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("\nRandom Order");
		//1,000 numbers, random order
		n = 1000;
		int array16[] = new int[n];
		for (int i = 0; i < n; i++) {
				array16[i] = rnd.nextInt(1000);
		}		
		startTime = System.nanoTime(); 
		sorting.shellSort(array16, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("1,000 numbers --> " + estimatedTime);
		
		
		//10,000 numbers, random order
		n = 10000;
		int array17[] = new int[n];
		for (int i = 0; i < n; i++) {
			array17[i] = rnd.nextInt(10000);
		}				
		startTime = System.nanoTime(); 
		sorting.shellSort(array17, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("10,000 numbers --> " + estimatedTime);
		
		
		//100,000 numbers, random order
		n = 100000;
		int array18[] = new int[n];
		for (int i = 0; i < n; i++) {
			array18[i] = rnd.nextInt(100000);
		}				
		startTime = System.nanoTime(); 
		sorting.shellSort(array18, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("100,000 numbers --> " + estimatedTime);
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		System.out.println("\nIncreasing Order");
		//1,000 numbers, increasing order
		n = 1000;
		int array19[] = new int[n];
		for (int i = 0; i < n; i++) {
				array19[i] = i;
		}		
		startTime = System.nanoTime(); 
		sorting.shellSort(array19, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("1,000 numbers --> " + estimatedTime);
		
		
		//10,000 numbers, increasing order
		n = 10000;
		int array20[] = new int[n];
		for (int i = 0; i < n; i++) {
			array20[i] = i;
		}				
		startTime = System.nanoTime(); 
		sorting.shellSort(array20, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("10,000 numbers --> " + estimatedTime);
		
		
		//100,000 numbers, increasing order
		n = 100000;
		int array21[] = new int[n];
		for (int i = 0; i < n; i++) {
			array21[i] = i;
		}				
		startTime = System.nanoTime(); 
		sorting.shellSort(array21, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("100,000 numbers --> " + estimatedTime);
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("\nDecreasing Order");
		//1,000 numbers, decreasing order
		n = 1000; count = 1000;
		int array22[] = new int[n];
		for (int i = 0; i < n; i++) {
			array22[i] = count; count--;
		}		
		startTime = System.nanoTime(); 
		sorting.shellSort(array22, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("1,000 numbers --> " + estimatedTime);


		//10,000 numbers, decreasing order
		n = 10000; count = 10000;
		int array23[] = new int[n];
		for (int i = 0; i < n; i++) {
			array23[i] = count; count--;
		}
		startTime = System.nanoTime(); 
		sorting.shellSort(array23, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("10,000 numbers --> " + estimatedTime);


		//100,000 numbers, decreasing order
		n = 100000; count = 100000;
		int array24[] = new int[n];
		for (int i = 0; i < n; i++) {
			array24[i] = count; count--;
		}
		startTime = System.nanoTime(); 
		sorting.shellSort(array24, n);
		endTime = System.nanoTime(); 
		estimatedTime = (endTime - startTime);
		System.out.println("100,000 numbers --> " + estimatedTime);

	}

}
