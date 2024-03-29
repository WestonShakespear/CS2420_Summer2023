/*
 * @(#)QubbleSortAlgorithm.java	1.0 95/06/26 Jim Boritz
 *
 * Copyright (c) 1995 UBC Microsystems, Inc. All Rights Reserved.
 *
 * Permission to use, copy, modify, and distribute this software
 * and its documentation for NON-COMMERCIAL purposes and without
 * fee is hereby granted provided that this copyright notice
 * appears in all copies. Please refer to the file "copyright.html"
 * for further important copyright and licensing information.
 *
 * UBC MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. UBC SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */

/**
 * An quick sort with buble sort speedup  demonstration algorithm
 * SortAlgorithm.java, Thu Oct 27 10:32:35 1994
 *
 * @author Jim Boritz
 * @version 	1.6, 26 Jun 1995
 */
/**
 * 19 Feb 1996: Fixed to avoid infinite loop discoved by Paul Haberli.
 *              Misbehaviour expressed when the pivot element was not unique.
 *              -Jason Harrison
 *
 * 21 Jun 1996: Modified code based on comments from Paul Haeberli, and
 *              Peter Schweizer (Peter.Schweizer@mni.fh-giessen.de).  
 *              Used Daeron Meyer's (daeron@geom.umn.edu) code for the
 *              new pivoting code. - Jason Harrison
 *
 * 09 Jan 1998: Another set of bug fixes by Thomas Everth (everth@wave.co.nz)
 *              and John Brzustowski (jbrzusto@gpu.srv.ualberta.ca).
 */
class QuickAndBubbleSortAlgorithm extends SortAlgorithm {
    void bsort(int a[], int lo, int hi) throws Exception {
	for (int j=hi; j > lo; j--) {
    	    for (int i=lo; i < j; i++) {
                if (a[i] > a[i+1]) {
		    int T = a[i];
                    a[i] = a[i+1];
                    a[i+1] = T;
		    pause();
                }
            }
        }
    } 
    void sort(int a[], int lo0, int hi0) throws Exception {
	int lo = lo0;
	int hi = hi0;
	pause(lo, hi);

        /*
         *  Bubble sort if the number of elements is less than 6 
         */
	if ((hi-lo) <= 6) {
	    bsort(a, lo, hi);
	    return;
	}

        /*
         *  Pick a pivot and move it out of the way
         */
	int pivot = a[(lo + hi) / 2];
        a[(lo + hi) / 2] = a[hi];
        a[hi] = pivot;

        while( lo < hi ) {
            /*
             *  Search forward from a[lo] until an element is found that
             *  is greater than the pivot or lo >= hi 
             */
            while (a[lo] <= pivot && lo < hi) {
		lo++;
	    }

            /*
             *  Search backward from a[hi] until element is found that
             *  is less than the pivot, or hi <= lo 
             */
	    while (pivot <= a[hi] && lo < hi ) {
		hi--;
	    }

            /*
             *  Swap elements a[lo] and a[hi]
             */
            if( lo < hi ) {
                int T = a[lo];
                a[lo] = a[hi];
                a[hi] = T;
                pause();
            }
	}

        /*
         *  Put the median in the "center" of the list
         */
        a[hi0] = a[hi];
        a[hi] = pivot;

        /*
         *  Recursive calls, elements a[lo0] to a[lo-1] are less than or
         *  equal to pivot, elements a[hi+1] to a[hi0] are greater than
         *  pivot.
         */
	sort(a, lo0, lo-1);
	sort(a, hi+1, hi0);
    }

    void sort(int a[]) throws Exception {
	sort(a, 0, a.length-1);
    }
}
