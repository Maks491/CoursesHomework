package Lesson4;

public class Park {
    public class Attractions {
        private String name;
        private String time;
        private double cost;

        public Attractions(String name, String time, double cost) {
            this.name = name;
            this.time = time;
            this.cost = cost;

        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public double getCost() {
            return cost;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attractions{" +
                    "name='" + name + '\'' +
                    ", time='" + time + '\'' +
                    ", cost=" + cost +
                    '}';
        }

        public void getParkInfo() {
            System.out.println("name" + " " + name);
            System.out.println("time" + " " + time);
            System.out.println("cost" + " " + cost);
        }
    }
}