package Data;

import Models.Accommodation;
import Models.Land;
import Models.Room;

import java.util.ArrayList;
import java.util.List;

public class LandData {

  public static List<Accommodation> getLands() {
    List<Accommodation> lands = new ArrayList<>();

    List<Room> rooms = RoomsData.createCommonRooms();
    lands.add(new Land("Colonia", "Finca", rooms, new ArrayList<>(), 4.0f, "Finca Colonia"));
    lands.add(new Land("Pinar del Río", "Finca", rooms, new ArrayList<>(), 4.2f, "Finca Pinar del Río"));
    lands.add(new Land("Cienfuegos", "Finca", rooms, new ArrayList<>(), 4.1f, "Finca Cienfuegos"));
    lands.add(new Land("Villa Clara", "Finca", rooms, new ArrayList<>(), 4.3f, "Finca Villa Clara"));
    lands.add(new Land("Ciego de Ávila", "Finca", rooms, new ArrayList<>(), 4.4f, "Finca Ciego de Ávila"));
    lands.add(new Land("Camagüey", "Finca", rooms, new ArrayList<>(), 4.5f, "Finca Camagüey"));


    return lands;
  }
}