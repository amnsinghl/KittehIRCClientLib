package org.kitteh.irc;

import org.junit.Assert;
import org.junit.Test;

public class IRCFormatTest {
    @Test
    public void format() {
        String colorChar = IRCFormat.COLOR_CHAR + "";
        for (IRCFormat format : IRCFormat.values()) {
            Assert.assertTrue("Color format with wrong length: " + format.name(), !format.toString().startsWith(colorChar) || format.toString().length() == 3);
        }
    }
}