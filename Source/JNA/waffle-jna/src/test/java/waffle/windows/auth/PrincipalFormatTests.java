/**
 * Waffle (https://github.com/Waffle/waffle)
 *
 * Copyright (c) 2010-2018 Application Security, Inc.
 *
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors: Application Security, Inc.
 */
package waffle.windows.auth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The Class PrincipalFormatTests.
 *
 * @author dblock[at]dblock[dot]org
 */
public class PrincipalFormatTests {

    /**
     * Test known.
     */
    @Test
    public void testKnown() {
        Assertions.assertEquals(PrincipalFormat.FQN, PrincipalFormat.valueOf("FQN"));
        Assertions.assertEquals(PrincipalFormat.SID, PrincipalFormat.valueOf("SID"));
        Assertions.assertEquals(PrincipalFormat.BOTH, PrincipalFormat.valueOf("BOTH"));
        Assertions.assertEquals(PrincipalFormat.NONE, PrincipalFormat.valueOf("NONE"));
        Assertions.assertEquals(4, PrincipalFormat.values().length);
    }

    /**
     * Test unknown.
     */
    @Test
    public void testUnknown() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            PrincipalFormat.valueOf("garbage");
        });
    }

}
