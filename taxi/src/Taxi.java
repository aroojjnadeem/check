import java.util.ArrayList;
public class Taxi{
        private int id;
        private boolean availability;
        private int[] location;

        public Taxi(int id, boolean availability, int[] location) {
            this.id = id;
            this.availability = availability;
            this.location = location;
        }

        public int getId() {
            return id;
        }

        public boolean isAvailable() {
            return availability;
        }

        public int[] getLocation() {
            return location;
        }

        public void setAvailability(boolean availability) {
            this.availability = availability;
        }

        public double calculateDistance(int x, int y) {
            int diffX = x - location[0];
            int diffY = y - location[1];
            return Math.sqrt(diffX * diffX + diffY * diffY);
        }
    }

