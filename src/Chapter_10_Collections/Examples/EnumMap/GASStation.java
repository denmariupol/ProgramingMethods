package Chapter_10_Collections.Examples.EnumMap;

/**
 * Created by Ingener_mobil on 22.11.2016.
 */
enum GASStation {
    DT(50), A80(30), A92(30), A95(50), GAS(40);
    private Integer maxVolume;
    private GASStation (int maxVolume) {
        this.maxVolume = maxVolume;
    }
    public Integer getMaxVolume() {
        return maxVolume;
    }
}
