package com.signalfx.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class RetryDefaults {
    private RetryDefaults() {
    }

    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final List<Class<? extends IOException>> DEFAULT_NON_RETRYABLE_EXCEPTIONS = Collections.unmodifiableList(Arrays.asList(
            InterruptedIOException.class,
            UnknownHostException.class,
            ConnectException.class));
}
