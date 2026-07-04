package io.moneylens.util;

import java.util.regex.Pattern;

public final class RegexUtil {

    private RegexUtil(){}

    public static final Pattern DATE_PATTERN =
            Pattern.compile("^\\d{2}-\\d{2}-\\d{4}.*");

    public static final Pattern AMOUNT_PATTERN =
            Pattern.compile("^\\d{1,3}(,\\d{3})*(\\.\\d{2})?$");

}