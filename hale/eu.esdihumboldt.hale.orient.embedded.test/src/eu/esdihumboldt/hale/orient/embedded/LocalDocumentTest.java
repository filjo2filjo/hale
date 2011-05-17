/*
 * HUMBOLDT: A Framework for Data Harmonisation and Service Integration.
 * EU Integrated Project #030962                 01.10.2006 - 30.09.2010
 * 
 * For more information on the project, please refer to the this web site:
 * http://www.esdi-humboldt.eu
 * 
 * LICENSE: For information on the license under which this program is 
 * available, please refer to http:/www.esdi-humboldt.eu/license.html#core
 * (c) the HUMBOLDT Consortium, 2007 to 2011.
 */

package eu.esdihumboldt.hale.orient.embedded;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx;

/**
 * Tests basic functions in the document based DB in the file system
 *
 * @author Simon Templer
 * @partner 01 / Fraunhofer Institute for Computer Graphics Research
 */
public class LocalDocumentTest extends AbstractDocumentTest {
	
	private static final String TEST_DB = "local:" + new File(new File(System.getProperty("java.io.tmpdir")), "testDB").getAbsolutePath();
	
	private ODatabaseDocumentTx db;
	
	/**
	 * @see AbstractDocumentTest#init()
	 */
	@Override
	public void init() {
		assertNotNull(EmbeddedOrientDB.getServer()); // to activate the embedded DB
		
		db = new ODatabaseDocumentTx(TEST_DB).create();
	}
	
	/**
	 * @see AbstractDocumentTest#dispose()
	 */
	@Override
	public void dispose() {
		db.delete();
		db.close();
	}

	/**
	 * @see AbstractDocumentTest#getDb()
	 */
	@Override
	protected ODatabaseDocumentTx getDb() {
		return db;
	}
	
}
