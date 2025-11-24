import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Moneda {
    @SerializedName("conversion_rates")
    private Map<String, Double> tasa;



    public Map<String, Double> getTasa() {
        return tasa;
    }


    @Override
    public String toString() {
        return "Moneda{" +

                ", conversion_rates=" + tasa +
        '}';
    }

}
