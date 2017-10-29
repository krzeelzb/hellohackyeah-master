package com.example.kb.hackyeaaah;

/**
 * Created by ela on 28.10.17.
 */

public class Address {
    public String street;
    public String numberOfFlat;
    public String numberOfHouse;

    public Address(String street, String numberOfFlat, String numberOfHouse) {
        this.street = street;
        this.numberOfFlat = numberOfFlat;
        this.numberOfHouse = numberOfHouse;
    }
    //
//    protected Address() {
//    }
//
//    public static Builder builder() {
//        return new Builder();
//    }
//
////    public static class Builder {
////        public final Address instance = new Address();
////
////        public Builder() {
////        }
////        public Builder addStreet(String street_) {
////            instance.street = street_;
////            return this;
////        }
////
////        public Builder addNumberOfHouse(String numberOfHouse_) {
////            instance.numberOfHouse= numberOfHouse_;
////            return this;
////        }
////        public Builder addNumberOfFlat(String numberOfFlat_) {
////            if(numberOfFlat_!="Numer Mieszkania") {
////                instance.numberOfFlat = numberOfFlat_;
////            }
////            return this;
////        }
////        public Address build() {
////            return instance;
////        }
////    }

}



