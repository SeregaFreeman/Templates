package abstract_factory.factories;

import abstract_factory.pilots.Pilot;
import abstract_factory.planes.Aircraft;

public interface PlaneFactory {
    Aircraft makeAircraft();
    Pilot makePilot();
}
