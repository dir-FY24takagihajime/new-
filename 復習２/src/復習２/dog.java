package 復習２;

public class dog {
    public class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public void sound() {
            System.out.println(name + " Bow");
        }

        public static void  main(String[] args) {
            Animal dog = new Animal("Dog");
            dog.sound();
        }
    }

}
