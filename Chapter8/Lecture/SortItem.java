/*
 * @(#)SortItem.java	1.17f 95/04/10 James Gosling
 *
 * Copyright (c) 1994-1995 Sun Microsystems, Inc. All Rights Reserved.
 *
 * Permission to use, copy, modify, and distribute this software
 * and its documentation for NON-COMMERCIAL or COMMERCIAL purposes and
 * without fee is hereby granted. 
 * Please refer to the file http://java.sun.com/copy_trademarks.html
 * for further important copyright and trademark information and to
 * http://java.sun.com/licensing.html for further important licensing
 * information for the Java (tm) Technology.
 * 
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 * 
 * THIS SOFTWARE IS NOT DESIGNED OR INTENDED FOR USE OR RESALE AS ON-LINE
 * CONTROL EQUIPMENT IN HAZARDOUS ENVIRONMENTS REQUIRING FAIL-SAFE
 * PERFORMANCE, SUCH AS IN THE OPERATION OF NUCLEAR FACILITIES, AIRCRAFT
 * NAVIGATION OR COMMUNICATION SYSTEMS, AIR TRAFFIC CONTROL, DIRECT LIFE
 * SUPPORT MACHINES, OR WEAPONS SYSTEMS, IN WHICH THE FAILURE OF THE
 * SOFTWARE COULD LEAD DIRECTLY TO DEATH, PERSONAL INJURY, OR SEVERE
 * PHYSICAL OR ENVIRONMENTAL DAMAGE ("HIGH RISK ACTIVITIES").  SUN
 * SPECIFICALLY DISCLAIMS ANY EXPRESS OR IMPLIED WARRANTY OF FITNESS FOR
 * HIGH RISK ACTIVITIES.
 */

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.InputStream;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.net.*;

/**
 * A simple applet class to demonstrate a sort algorithm.
 * You can specify a sorting algorithm using the "alg"
 * attribyte. When you click on the applet, a thread is
 * forked which animates the sorting algorithm.
 *
 * @author James Gosling
 * @version 	1.17f, 10 Apr 1995
 */
public class SortItem extends JPanel implements Runnable, MouseListener {

	/**
	 * Initialize the applet.
	 */
	public SortItem() {
		//this.setSize(40, 60);
		String at = null;
		if (at == null) {

			// at = "InsertionSort"; //Keep a sorted list, and place the next item where it should go
			// at = "ShellSort"; //Extension of Insertion Sort, but keeping sortings of 5, 4, 3, 2, until finally, every 1
			//This allows items to move further faster
			// at = "MergeSort"; //Use extra space
			//at = "MergeSortNoExtraSpace"; //Divide the elements until the base case, then keep sorted lists

			at = "QuickSort"; //Find a pivot value (hopefully the middle one), and find it's spot by moving numbers to each side of the value, and repeat with each side

			//at = "QuickAndBubbleSort"; //Use bubble sort if there are less than 6 items in a group


			//at = "BubbleSort2"; //Keep moving the largest element up in the list
			//at = "BidirectionalBubbleSort"; //Move the largest, then move the smallest
			//at = "CombSort11"; //Bubble sort extension.  It eliminates 'turtles' by moving numbers further, say 11, then 10 .. until 1, which is a basic bubble sort

			//at = "SelectionSort"; //Find the smallest element, and then move it to the front
			//at = "ShakerSort"; //Find the largest, and smallest in a single pass



			//at = "HeapSort"; //Uses a heap, which is a binary tree where each node is greater then its children, so the max value is at the top.
			//The max value can then be removed, and a new max value calculated from it's children


			//at = "EQSort"; //Enhanced Quick Sort, probably finds a better pivot value?
			//at = "FastQSort";  //Also, just extra changes to the sorting algorithm

		}

		algName = at + "Algorithm";
		scramble();
		this.addMouseListener(this);
	}



	/**
	 * The thread that is sorting (or null).
	 */
	private Thread kicker;

	/**
	 * The array that is being sorted.
	 */
	int arr[];

	/**
	 * The high water mark.
	 */
	int h1 = -1;

	/**
	 * The low water mark.
	 */
	int h2 = -1;

	/**
	 * The name of the algorithm.
	 */
	String algName;

	/**
	 * The sorting algorithm (or null).
	 */
	SortAlgorithm algorithm;

	/**
	 * Fill the array with random numbers from 0..n-1.
	 */
	void scramble() {
		int a[] = new int[getSize().height / 2];
		double f = getSize().width / (double) a.length;
		for (int i = a.length; --i >= 0;) {
			a[i] = (int)(a.length * f * Math.random());
		}

		arr = a;
	}

	/**
	 * Pause a while.
	 * @see SortAlgorithm
	 */
	void pause() {
		pause(-1, -1);
	}

	/**
	 * Pause a while, and draw the high water mark.
	 * @see SortAlgorithm
	 */
	void pause(int H1) {
		pause(H1, -1);
	}

	/**
	 * Pause a while, and draw the low&high water marks.
	 * @see SortAlgorithm
	 */
	void pause(int H1, int H2) {
		h1 = H1;
		h2 = H2;
		if (kicker != null) {
			repaint();
		}
		try {Thread.sleep(10);} catch (InterruptedException e){}
	}


	/**
	 * Paint the array of numbers as a list
	 * of horizontal lines of varying lenghts.
	 */
	public void paintComponent(Graphics g) {
		int a[] = arr;
		int y = getSize().height - 1;

		
		// Erase old lines
		g.setColor(Color.lightGray);
		g.fillRect(0, 0, getSize().width, getSize().height);
		/*
		for (int i = a.length; --i >= 0; y -= 2) {
			g.drawLine(arr[i], y, getSize().width, y);
		}
		*/

		// Draw new lines
		g.setColor(Color.black);
		y = getSize().height - 1;
		for (int i = a.length; --i >= 0; y -= 2) {
			g.drawLine(0, y, arr[i], y);
		}

		if (h1 >= 0) {
			g.setColor(Color.red);
			y = h1 * 2 + 1;
			g.drawLine(0, y, getSize().width, y);
		}
		if (h2 >= 0) {
			g.setColor(Color.blue);
			y = h2 * 2 + 1;
			g.drawLine(0, y, getSize().width, y);
		}
	}

	/**
	 * Update without erasing the background.
	 */
	public void update(Graphics g) {
		paintComponent(g);
	}

	/**
	 * Run the sorting algorithm. This method is
	 * called by class Thread once the sorting algorithm
	 * is started.
	 * @see java.lang.Thread#run
	 * @see SortItem#mouseUp
	 */
	public void run() {
		try {
			if (algorithm == null) {
				algorithm = (SortAlgorithm)Class.forName(algName).newInstance();
				algorithm.setParent(this);
			}
			algorithm.init();
			algorithm.sort(arr);
		} catch(Exception e) {
		}
	}

	/**
	 * Stop the applet. Kill any sorting algorithm that
	 * is still sorting.
	 */
	public synchronized void stop() {
		if (kicker != null) {
			try {
				kicker.stop();
			} catch (IllegalThreadStateException e) {
				// ignore this exception
			}
			kicker = null;
		}
		if (algorithm != null){
			try {
				algorithm.stop();
			} catch (IllegalThreadStateException e) {
				// ignore this exception
			}
		}
	}


	/**
	 * For a Thread to actually do the sorting. This routine makes
	 * sure we do not simultaneously start several sorts if the user
	 * repeatedly clicks on the sort item.  It needs to be
	 * synchronoized with the stop() method because they both
	 * manipulate the common kicker variable.
	 */
	private synchronized void startSort() {
		if (kicker == null || !kicker.isAlive()) {
			scramble();
			repaint();
			try {Thread.sleep(10);} catch (InterruptedException e){}
			kicker = new Thread(this);
			kicker.start();
		}
	}



	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		startSort();		
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	public static void main(String [] args) {
		JFrame f = new JFrame("Sorting Algorithms");
		SortItem item = new SortItem();
		f.add(item);
		f.setSize(200, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
