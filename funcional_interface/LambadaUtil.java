import java.util.function.Supplier;

public class LambadaUtil{

public static <T> T buscar(Supplier<T> filtro){
    return filtro.get();
}

}