package day50_inheritance_hiding;

public class City {

        private String name;

        public City() {
            name = "undefined";
        }

        public City(String name) {
            this.name = name;
        }
        // METHOD HIDING
        public void letsBuildARoad(){
            System.out.println("City - lets building a road...");
            buildARoad();
        }
        public static void buildARoad(){
            System.out.println("City - building a road...");
        }
        @Override
        public String toString(){
            return "name = "+name;
        }

        public String getName() {
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
    }