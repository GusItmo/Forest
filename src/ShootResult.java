public class ShootResult {
    private Animal shootTarget;
    private boolean success;

    public ShootResult(Animal shootTarget, boolean success) {
        this.shootTarget = shootTarget;
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }
}
