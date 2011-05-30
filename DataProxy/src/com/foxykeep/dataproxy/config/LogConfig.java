package com.foxykeep.dataproxy.config;

@SuppressWarnings("all")
public class LogConfig {

    private LogConfig() {
    }
    
    /**
     * Log Level variables
     */
    private static final int DP_LOG_LEVEL_DEBUG = 4;
    private static final int DP_LOG_LEVEL_INFO = 3;
    private static final int DP_LOG_LEVEL_WARNING = 2;
    private static final int DP_LOG_LEVEL_ERROR = 1;
    private static final int DP_LOG_LEVEL_NONE = 0;

    /**
     * Set this flag to {@link LogConfig#DP_LOG_LEVEL_NONE} when releasing your
     * application in order to remove all logs generated by DataProxy.
     */
    private static final int DP_LOG_LEVEL = DP_LOG_LEVEL_DEBUG;

    public static final boolean DEBUG_LOGS_ENABLED = (DP_LOG_LEVEL == DP_LOG_LEVEL_DEBUG);
    public static final boolean INFO_LOGS_ENABLED = DEBUG_LOGS_ENABLED || (DP_LOG_LEVEL == DP_LOG_LEVEL_INFO);
    public static final boolean WARNING_LOGS_ENABLED = INFO_LOGS_ENABLED || (DP_LOG_LEVEL == DP_LOG_LEVEL_WARNING);
    public static final boolean ERROR_LOGS_ENABLED = WARNING_LOGS_ENABLED || (DP_LOG_LEVEL == DP_LOG_LEVEL_ERROR);
}
