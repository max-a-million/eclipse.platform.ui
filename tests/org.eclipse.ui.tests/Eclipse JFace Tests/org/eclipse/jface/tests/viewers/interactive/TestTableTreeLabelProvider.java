/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jface.tests.viewers.interactive;

import org.eclipse.swt.graphics.Image;

import org.eclipse.jface.tests.viewers.TestLabelProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
 
public class TestTableTreeLabelProvider extends TestLabelProvider implements ITableLabelProvider{
/**
 * Returns the label image for a given column.
 *
 * @param element the object representing the entire row. Can be 
 *     <code>null</code> indicating that no input object is set in the viewer.
 * @param columnIndex the index of the column in which the label appears. Numbering is zero based.
 */
public Image getColumnImage(Object element, int columnIndex) {
	return getImage();
}
/**
 * Returns the label text for a given column.
 *
 * @param element the object representing the entire row. Can be 
 *     <code>null</code> indicating that no input object is set in the viewer.
 * @param columnIndex the index of the column in which the label appears. Numbering is zero based.
 */
public String getColumnText(Object element, int columnIndex) {
	if (element != null)
		return element.toString() + " column " + columnIndex;
	return null;
}
}
