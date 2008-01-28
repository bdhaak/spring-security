package org.springframework.security.rolemapping;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.TestCase;

/**
 * 
 * @author TSARDD
 * @since 18-okt-2007
 */
public class SimpleMappableRolesRetrieverTests extends TestCase {

	public final void testGetSetMappableRoles() {
		String[] roles = new String[] { "Role1", "Role2" };
		SimpleMappableRolesRetriever r = new SimpleMappableRolesRetriever();
		r.setMappableRoles(roles);
		String[] result = r.getMappableRoles();
		Collection resultColl = Arrays.asList(result);
		Collection rolesColl = Arrays.asList(roles);
		assertTrue("Role collections do not match; result: " + resultColl + ", expected: " + rolesColl, rolesColl.containsAll(resultColl)
				&& resultColl.containsAll(rolesColl));
	}

}