import org.postgresql.ds.PGSimpleDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Airport {

    private final PGSimpleDataSource dataSource;

    public Airport(PGSimpleDataSource dataSource) {
        this.dataSource = dataSource;
    }

    private List<Pilot> getPilotList() {
        ArrayList<Pilot> pilotsList = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             var statement = connection.createStatement()) {
            var resultSet = statement.executeQuery("select * from pilots");
            while (resultSet.next()) {
                Pilot pilot = new Pilot(
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getString("plane_model")
                );
                pilotsList.add(pilot);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pilotsList;
    }

    private List<Plane> getPlaneList() {
        ArrayList<Plane> planesList = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             var statement = connection.createStatement()) {
            var resultSet = statement.executeQuery("select * from plane");
            while (resultSet.next()) {
                Plane plane = new Plane(
                        resultSet.getString("plane_model"),
                        resultSet.getString("serial_number"),
                        resultSet.getInt("number_of_seats")
                );
                planesList.add(plane);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return planesList;
    }

    private void getUsedPlane(Map<String, List<Plane>> modelPlaneMap,
                              ArrayList<Plane> usedPlanes,
                              String planeModel,
                              int freePlanesCount) {
        for (Map.Entry<String, List<Plane>> modelPlaneEntry : modelPlaneMap.entrySet()) {
            if (modelPlaneEntry.getKey().equals(planeModel)) {
                var planes = modelPlaneEntry.getValue();
                planes.removeAll(usedPlanes);
                for (Plane plane : planes) {
                    if (plane.getPlaneModel().equals(planeModel)) {
                        if (freePlanesCount == 0) {
                            break;
                        }
                        usedPlanes.add(plane);
                        freePlanesCount--;
                    }
                }
            }
        }
    }

    public int clientCount() {
        List<Pilot> pilotList = getPilotList();
        List<Plane> planeList = getPlaneList();
        Map<String, List<Pilot>> collectPilot = pilotList.stream().collect(Collectors.groupingBy(Pilot::getName));
        Map<String, List<Plane>> collectPlane = planeList.stream().collect(Collectors.groupingBy(Plane::getPlaneModel));
        var clientCount = 0;
        List<Plane> usedPlane = getUsedPlane(collectPlane, collectPilot);
        for (Plane plane : usedPlane) {
            clientCount += plane.getSeats();
        }
        return clientCount;
    }
}
