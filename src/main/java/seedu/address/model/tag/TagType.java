package seedu.address.model.tag;

/**
 * Enumeration of allowed tag types.
 */
public enum TagType {
    VEGETARIAN("Vegetarian"),
    VEGAN("Vegan"),
    HALAL("Halal"),
    ALLERGIES("Allergies");

    private final String displayName;

    TagType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Converts a string to a TagType (case-insensitive).
     */
    public static TagType fromString(String input) {
        String normalized = input.trim();

        for (TagType type : TagType.values()) {
            if (type.displayName.equalsIgnoreCase(input.trim())) {
                return type;
            }
        }
        throw new IllegalArgumentException(
                 "Tags must be one of the following: Vegetarian, Vegan, Halal, Allergies");
    }
}
