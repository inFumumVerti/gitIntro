public enum VehiclesEnum {
    CAR("Land",100),
    BOAT("Water",80),
    PLANE("AIR",800);

    String madeFor;
    int maxSpeed;

    VehiclesEnum(String madeFor, int maxSpeed){
        this.madeFor = madeFor;
        this.maxSpeed = maxSpeed;
    }

}
