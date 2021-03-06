/*
 * Copyright (c) 2012 Data Harmonisation Panel
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution. If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     HUMBOLDT EU Integrated Project #030962
 *     Data Harmonisation Panel <http://www.dhpanel.eu>
 */

package eu.esdihumboldt.hale.io.csv.ui;

import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/**
 * The Class specifying the TextField for the Typename
 * 
 * @author Kevin Mais
 */
public class TypeNameField extends StringFieldEditor {

	Composite _parent;

	/**
	 * Parameter that signals when a test has changed
	 */
	public static final String TXT_CHNGD = "text_has_changed";

	/**
	 * @param name the name intern
	 * @param labelText the label to be set in the StringFieldEditor
	 * @param parent the composite for the StringFieldEditor to be added in
	 */
	public TypeNameField(String name, String labelText, Composite parent) {
		super(name, labelText, parent);
		_parent = parent;
	}

	/**
	 * @see org.eclipse.jface.preference.StringFieldEditor#checkState()
	 */
	@Override
	protected boolean doCheckState() {
		boolean containsIllegalChar;

		setErrorMessage("You have not entered a valid Name");

		Text txtField = getTextControl(_parent);
		String txt = txtField.getText();

		containsIllegalChar = txt.contains("/") || txt.contains(":") || txt.contains(".");

		return !(containsIllegalChar);
	}

	/**
	 * @see org.eclipse.jface.preference.StringFieldEditor#valueChanged()
	 */
	@Override
	protected void valueChanged() {
		super.valueChanged();
		fireValueChanged(TXT_CHNGD, "", getStringValue());
	}

}
