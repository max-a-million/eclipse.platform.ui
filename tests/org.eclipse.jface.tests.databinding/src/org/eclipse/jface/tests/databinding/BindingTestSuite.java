/*******************************************************************************
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Brad Reynolds - bugs 137877, 152543, 152540
 *     Brad Reynolds - bug 116920
 *******************************************************************************/
package org.eclipse.jface.tests.databinding;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.jface.internal.databinding.provisional.conversion.IdentityConverterTest;
import org.eclipse.jface.internal.databinding.provisional.factories.DefaultBindSupportFactoryBooleanPrimitiveTest;
import org.eclipse.jface.internal.databinding.provisional.factories.DefaultBindSupportFactoryBytePrimitiveTest;
import org.eclipse.jface.internal.databinding.provisional.factories.DefaultBindSupportFactoryDoublePrimitiveTest;
import org.eclipse.jface.internal.databinding.provisional.factories.DefaultBindSupportFactoryFloatPrimitiveTest;
import org.eclipse.jface.internal.databinding.provisional.factories.DefaultBindSupportFactoryIntTest;
import org.eclipse.jface.internal.databinding.provisional.factories.DefaultBindSupportFactoryLongPrimitiveTest;
import org.eclipse.jface.internal.databinding.provisional.factories.DefaultBindSupportFactoryShortPrimitiveTest;
import org.eclipse.jface.internal.databinding.provisional.factories.DefaultBindSupportFactoryTest;
import org.eclipse.jface.internal.databinding.provisional.validation.ObjectToPrimitiveValidatorTest;
import org.eclipse.jface.tests.databinding.mask.EditMaskLexerAndTokenTest;
import org.eclipse.jface.tests.databinding.mask.EditMaskParserTest;
import org.eclipse.jface.tests.databinding.observable.value.WritableValueTest;
import org.eclipse.jface.tests.databinding.scenarios.BindingScenariosTestSuite;
import org.eclipse.jface.tests.databinding.swt.TextObservableValueTests;
import org.eclipse.jface.tests.examples.model.PersonTests;
import org.eclipse.jface.tests.internal.databinding.internal.ListBindingTest;
import org.eclipse.jface.tests.internal.databinding.internal.ValueBindingTest;
import org.eclipse.jface.tests.internal.databinding.internal.observable.UnmodifiableObservableListTest;
import org.eclipse.jface.tests.internal.databinding.internal.viewers.SelectionProviderSingleSelectionObservableValueTest;
import org.eclipse.jface.tests.internal.databinding.provisional.observable.AbstractObservableTest;
import org.eclipse.jface.tests.internal.databinding.provisional.observable.ObservablesTest;

public class BindingTestSuite extends TestSuite {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static Test suite() {
        return new BindingTestSuite();
    }

    public BindingTestSuite() {
        // org.eclipse.jface.internal.databinding.provisional.conversion
        addTestSuite(IdentityConverterTest.class);

        // org.eclipse.jface.internal.databinding.provisional.factories
        addTestSuite(DefaultBindSupportFactoryBooleanPrimitiveTest.class);
        addTestSuite(DefaultBindSupportFactoryBytePrimitiveTest.class);
        addTestSuite(DefaultBindSupportFactoryDoublePrimitiveTest.class);
        addTestSuite(DefaultBindSupportFactoryFloatPrimitiveTest.class);
        addTestSuite(DefaultBindSupportFactoryIntTest.class);
        addTestSuite(DefaultBindSupportFactoryLongPrimitiveTest.class);
        addTestSuite(DefaultBindSupportFactoryShortPrimitiveTest.class);
        addTestSuite(DefaultBindSupportFactoryTest.class);

        // org.eclipse.jface.internal.databinding.provisional.validation
        addTestSuite(ObjectToPrimitiveValidatorTest.class);

        // org.eclipse.jface.tests.databinding
        addTestSuite(BindSpecTests.class);
        addTestSuite(ComputedValueTest.class);
        addTestSuite(DatabindingContextTest.class);
//FIXME        addTestSuite(EventEditorObservableLazyDataRequestorTest.class);
        addTestSuite(IDiffsTest.class);
//FIXME        addTestSuite(LazyDataRequestor.class);
//FIXME        addTestSuite(LazyListBindingTest.class);
        addTestSuite(ObservableTest.class);
        addTestSuite(RandomAccessListIteratorTest.class);
//FIXME        addTestSuite(SelectionAwareObservableCollectionTest.class);
        
        // org.eclipse.jface.tests.databinding.mask
        addTestSuite(EditMaskLexerAndTokenTest.class);
        addTestSuite(EditMaskParserTest.class);

        // org.eclipse.jface.tests.databinding.observable.value
        addTestSuite(WritableValueTest.class);

        //org.eclipse.jface.tests.databinding.scenarios
        addTest(BindingScenariosTestSuite.suite());
        //The files in this package are in the above test suite
        
        //org.eclipse.jface.tests.databinding.swt
//FIXME        addTestSuite(AbstractGetAndSetSelectionObservableCollectionTest.class);
//FIXME        addTestSuite(AutoSelectTableViewerCollectionExtendedTest.class); 
//FIXME        addTestSuite(AutoSelectTableViewerCollectionTest.class);
//FIXME        addTestSuite(CComboObservableCollectionTest.class);
//FIXME        addTestSuite(ComboObservableCollectionTest.class);
//FIXME        addTestSuite(CopyOfAutoSelectTableViewerCollectionExtendedTest.class);
//FIXME        addTestSuite(ListObservableCollectionTest.class);
//FIXME        addTestSuite(ObservableCollectionViewerTest.class);
//FIXME        addTestSuite(TableViewerObservableCollectionTest.class);
        addTestSuite(TextObservableValueTests.class);
        
        //org.eclipse.jface.tests.examples.model
        addTestSuite(PersonTests.class);
        
        //org.eclipse.jface.tests.internal.databinding.internal
        addTestSuite(ListBindingTest.class);
        addTestSuite(ValueBindingTest.class);
        
        //org.eclipse.jface.tests.internal.databinding.internal.observable
        addTestSuite(UnmodifiableObservableListTest.class);
        
        //org.eclipse.jface.tests.internal.databinding.internal.viewers
        addTestSuite(SelectionProviderSingleSelectionObservableValueTest.class);
//FIXME        addTestSuite(SVOCWLTest.class);
        
        //org.eclipse.jface.tests.internal.databinding.provisional.observable
        addTestSuite(AbstractObservableTest.class);
        addTestSuite(ObservablesTest.class);
    }

    /**
     * @param testCase
     *            TODO
     * @return true if the given test is temporarily disabled
     */
    public static boolean failingTestsDisabled(TestCase testCase) {
        System.out.println("Ignoring disabled test: " + testCase.getClass().getName() + "." + testCase.getName());
        return true;
    }

    /**
     * @param testSuite
     *            TODO
     * @return true if the given test is temporarily disabled
     */
    public static boolean failingTestsDisabled(TestSuite testSuite) {
        System.out.println("Ignoring disabled test: " + testSuite.getClass().getName() + "." + testSuite.getName());
        return true;
    }
}