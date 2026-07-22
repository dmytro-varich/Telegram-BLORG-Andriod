package org.telegram.blorg.discovery;

public final class Discovery {

    private Discovery() {}

    public static boolean allowMentions() {
        return !Config.BLOCK_USERNAME_RESOLVE;
    }

    public static boolean allowInlineBots() {
        return !Config.BLOCK_INLINE_BOTS;
    }

    public static boolean allowTelegramLinks() {
        return !Config.BLOCK_TELEGRAM_LINKS;
    }

    public static boolean allowResolveUsername() {
        return !Config.BLOCK_USERNAME_RESOLVE;
    }

    public static boolean allowGlobalSearch() {
        return !Config.BLOCK_GLOBAL_SEARCH;
    }

    public static boolean showBlockedUsersSection() {
        return !Config.BLOCK_BLOCKED_USERS_SECTION;
    }

    public static boolean allowRequestsJoin() {
        return !Config.BLOCK_REQUESTS_JOIN;
    }
}