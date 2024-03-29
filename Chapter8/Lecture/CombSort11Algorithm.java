/*
 * @(#)CombSort11Algorithm.java	1.0 96/11/20 Jason Harrison
 *
 * Copyright (c) 1995 University of British Columbia
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
 * A comb sort 11 sort demonstration algorithm
 * Idea from Byte April 1991 by Richard Box and Stephen Lacey
 * Michele Estebon (mestebon@vt.edu) brought this to my attention.
 * 
 * SortAlgorithm.java, Thu Oct 27 10:32:35 1994
 *
 * @author Jason Harrison@cs.ubc.ca
 * @version 	1.0, 20 Nov 1996
 *
 */
class CombSort11Algorithm extends SortAlgorithm {
    final float SHRINKFACTOR = (float)1.3;

    void sort(int a[]) throws Exception {
        boolean flipped = false;
        int gap, top;
        int i, j;

        gap = a.length;
        do {
            gap = (int) ((float) gap / SHRINKFACTOR);
            switch (gap) {
            case 0: /* the smallest gap is 1 - bubble sort */
                gap = 1;
                break;
            case 9: /* this is what makes this Combsort11 */
            case 10: 
                gap = 11;
                break;
            default: break;
            }
            flipped = false;
            top = a.length - gap;
            for (i = 0; i < top; i++) {
                if (stopRequested) {
                    return;
                }

                j = i + gap;
                if (a[i] > a[j]) {
                    int T = a[i];
                    a[i] = a[j];
                    a[j] = T;
                    flipped = true;
                }
                pause(i,j);
            }
        } while (flipped || (gap > 1));
        /* like the bubble and shell sorts we check for a clean pass */
    }
}

