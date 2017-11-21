package builder;

public class BuilderRunner {
    public static void main(String[] args) {
        Building building = new Building(new HouseBuilder(10).addDoor().addRoof().addWindow());
        System.out.println(building.isDoor());
        System.out.println(building.isRoof());
    }
}
