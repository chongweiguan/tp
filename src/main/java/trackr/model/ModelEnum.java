package trackr.model;

/**
 * Enum representing all the available models.
 */
public enum ModelEnum {

    SUPPLIER("Supplier"),
    TASK("Task"),
    ORDER("Order"),
    CUSTOMER("Customer");

    private final String strRepresentation;

    ModelEnum(String strRepresentation) {
        this.strRepresentation = strRepresentation;
    }

    @Override
    public String toString() {
        return strRepresentation;
    }
}