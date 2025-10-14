package facadePattern;

public class FrontDesk {

    public static void delegateService(HotelService service) {
        service.execute();
    }
}
