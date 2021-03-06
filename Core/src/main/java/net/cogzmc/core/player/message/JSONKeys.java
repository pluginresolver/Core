package net.cogzmc.core.player.message;

enum JSONKeys {
    EXTRAS("extra"),
    MESSAGE("text"),
    TRANSLATE("translate"),
    WITH("with"),
    BOLD("bold"),
    ITALIC("italic"),
    UNDERLINE("underlined"),
    STRIKETHROUGH("strikethrough"),
    OBFUSCATED("obfuscated"),
    COLOR("color"),
    CLICK_EVENT("clickEvent"),
    HOVER_EVENT("hoverEvent"),
    ACTION("action"),
    VALUE("value");

    private final String keyValue;

    JSONKeys(String keyValue) {
        this.keyValue = keyValue;
    }

    public String toString() {
        return keyValue;
    }
}
