package labs_examples.enumerations.labs.Task1;

public enum Books {
    MYSTERY("Suspenseful", "Intriguing"),
    FICTION("Drama", "Imagination"),
    NON_FICTION("Autobiography", "Biography"),
    HISTORY("Historical", "Educational");

    private String descriptor1;
    private String descriptor2;

    Books(String descriptor1, String descriptor2) {
        this.descriptor1 = descriptor1;
        this.descriptor2 = descriptor2;
    }

    public String getDescriptor1() {
        return descriptor1;
    }

    public String getDescriptor2() {
        return descriptor2;
    }
}
