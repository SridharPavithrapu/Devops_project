package org.kt3k.bankaccount;

import org.junit.Test;
import static org.junit.Assert.*;

public class TransferContextTest {

    @Test
    public void testTransfer() {
        BankAccount a = new BankAccount("abc123", 15000);
        BankAccount b = new BankAccount("def456", 25000);

        new TransferContext(a, b).transfer(5000);

        assertEquals((Integer)10000, a.getBalance());
        assertEquals((Integer)30000, b.getBalance());
    }

}