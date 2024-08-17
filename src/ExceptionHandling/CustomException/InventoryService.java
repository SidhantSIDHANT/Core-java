package ExceptionHandling.CustomException;

class InsufficientInventoryException extends RuntimeException {
    InsufficientInventoryException() {
        super(" Insufficient avilable qulity ");
    }

    InsufficientInventoryException(String s) {
        super(s);
    }
}


public class InventoryService {
    private int avilableQuantity = 100;

    void processOrder(int qulity) throws InsufficientInventoryException {
        if (qulity > this.avilableQuantity || qulity <= 0) {
            throw new InsufficientInventoryException(" Insufficient avialbe qulity " + qulity);
        }
    }

    public static void main(String[] arg) {
        InventoryService inventoryService = new InventoryService();
        try {
            inventoryService.processOrder(0);
        } catch (InsufficientInventoryException e) {
            e.printStackTrace();
        }
    }
}