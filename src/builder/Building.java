package builder;

public class Building {
    private boolean door = false;
    private boolean window = false;
    private boolean roof = false;

    public boolean isDoor() {
        return door;
    }

    public void setDoor(boolean door) {
        this.door = door;
    }

    public boolean isWindow() {
        return window;
    }

    public void setWindow(boolean window) {
        this.window = window;
    }

    public boolean isRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    public Building(HouseBuilder builder){
        this.door = builder.door;
        this.window = builder.window;
        this.roof = builder.roof;
    }
}
