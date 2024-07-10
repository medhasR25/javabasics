public class Person {
    
        int roll;
        String name;
        String phoneNumber;
        String emailAddress;
        String address;
        public Person(int roll, String name, String phoneNumber, String emailAddress, String address) {
            this.roll = roll;
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress;
            this.address = address;
        }
        

        @Override
        public String toString() {
            return "Person [roll=" + roll + ", Name=" + name + ", phoneNumber=" + phoneNumber + ", emailAddress="
                    + emailAddress + ", address=" + address + "]";
        }


        public static void main(String[] args) {
            Person m1 = new Person(25, "MEDHAS REDDY","9898981234" , "medhas@gmail.com", "Bangkok");
            System.out.println(m1);


        }

        


    
}
