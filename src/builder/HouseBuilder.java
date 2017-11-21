package builder;

public class HouseBuilder {
    public int size;
    public boolean door = false;
    public boolean window = false;
    public boolean roof = false;

    public HouseBuilder(int size){
        this.size = size;
    }

    public HouseBuilder addDoor(){
        this.door = true;
        return this;
    }

    public HouseBuilder addWindow(){
        this.window = true;
        return this;
    }

    public HouseBuilder addRoof(){
        this.roof = true;
        return this;
    }

    public HouseBuilder build(){
        return new HouseBuilder(size);
    }
}
